package org.dschulz;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Diego Schulz
 *
 * Utilidad para convertir números de precisión arbitraria a su representación
 * literal.
 */
public class Numero {

    /**
     * Traduce un BigDecimal
     *
     * @param numero El número a convertir a letras.
     * @return Representación literal del número.
     */
    public static String enLetras(BigDecimal numero) {

        //Extraer parte decimal
        BigInteger intpart = numero.toBigInteger();
        BigDecimal decpart = numero.subtract(new BigDecimal(numero.toBigInteger()));

        // Si tiene parte decimal mayor a cero..
        if (decpart.compareTo(BigDecimal.ZERO) > 0) {
            StringBuilder sb = new StringBuilder();
            /// convertir parte entera
            sb.append(enLetras(intpart));

            sb.append(" con ");
            sb.append(decpart.movePointRight(decpart.scale()));
            sb.append("/");
            sb.append(BigDecimal.TEN.pow(decpart.scale()));

            return sb.toString();
        }

        // Tiene solo parte entera
        return enLetras(intpart);
    }

    /**
     * Traduce un BigInteger
     *
     * @param numero El número a convertir a letras.
     * @return Representación literal del número.
     */
    public static String enLetras(BigInteger numero) {

        if (numero.equals(BigInteger.ZERO)) {
            return normalizar(UNIDADES[0]);
        }

        return normalizar(enLetras(numero.toString()));
    }
    ////////// PRIVADO DESDE AQUÍ  //////////
    private final static int DIGITOS_POR_PERIODO = 6;
    private final static String MUY_GRANDE = "Número demasiado grande";
    private final static String LLON = "llón";
    private final static String LLONES = "llones";
    private final static String UN = "un";
    private final static String VEINTIUN = "veintiún";
    private final static String CIEN = "cien";
    private final static String MIL = "mil";
    private final static String[] UNIDADES = {
        "cero", "uno", "dos", "tres",
        "cuatro", "cinco", "seis",
        "siete", "ocho", "nueve"};
    private final static String[] DIECIS = {
        "diez", "once", "doce", "trece",
        "catorce", "quince", "dieciséis",
        "diecisiete", "dieciocho", "diecinueve"};
    private final static String[] VEINTIS = {
        "veinte", "veintiuno", "veintidós", "veintitrés",
        "veinticuatro", "veinticinco", "veintiséis",
        "veintisiete", "veintiocho", "veintinueve"};
    private final static String[] DECENAS = {
        "ERROR", "diez", "veinte", "treinta", "cuarenta",
        "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
    };
    private final static String[] CENTENAS = {
        "ERROR", "ciento", "doscientos", "trescientos",
        "cuatrocientos", "quinientos", "seiscientos",
        "setecientos", "ochocientos", "novecientos"
    };
    private final static String[] PERIODOS = {
        "ERROR", "mi", "bi", "tri", "quatri", "quinti", "sexti",
        "septi", "octi", "noni", "deci", "undeci", "duodeci",
        "tredeci", "cuatrodeci", "quindeci", "hexadeci",
        "septendeci", "octodeci", "novendeci", "viginti",
        "unviginti", "duoviginti", "treviginti", "cuatroviginti",
        "quinviginti", "sexviginti", "septenviginti", "octoviginti",
        "novemviginti", "triginti", "untriginti", "duotriginti", "tretriginti"
    };

    //// Fin definición de strings  
    ////
    /**
     * Algoritmo principal empieza aquí
     */
    private static String enLetras(String digitos) {


        List<PeriodoNumerico> lista = splitPeriodos(digitos);

        if (lista.size() > ((PERIODOS.length))) {
            return MUY_GRANDE;
        }

        StringBuilder sb = new StringBuilder();

        for (PeriodoNumerico pn : lista) {
            sb.append(pn.toString());
            sb.append(" ");
        }

        return normalizar(sb.toString());
    }

    private static List<PeriodoNumerico> splitPeriodos(String digitos) {

        StringBuilder sb = new StringBuilder();

        char[] chArray = digitos.toCharArray();

        for (int i = chArray.length; i > 0; i--) {
            if (((chArray.length - i) % DIGITOS_POR_PERIODO == 0)
                    && ((chArray.length - i) > 0)) {
                sb.append('M');
            }
            sb.append(chArray[i - 1]);
        }

        String[] periodos = sb.reverse().toString().split("M");

        List<PeriodoNumerico> lista = new ArrayList<>();

        ListIterator<String> li = (Arrays.asList(periodos).listIterator());
        while (li.hasNext()) {
            int orden = periodos.length - li.nextIndex() - 1;
            Integer periodo = Integer.parseInt(li.next());
            lista.add(new PeriodoNumerico(orden, periodo));
        }

        return lista;
    }

    /*
     * Capitaliza la primera palabra y pone exactamente un espacio entre palabras
     */
    private static String normalizar(String s) {

        if (0 == s.trim().length()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        String tnlc = s.trim().toLowerCase();

        sb.append(Character.toUpperCase(tnlc.charAt(0)));
        sb.append(tnlc.substring(1));

        String[] words = sb.toString().split(" ");

        sb.delete(0, sb.length());

        int cnt = 0;
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(word.trim());
                if (cnt < words.length - 1) {
                    sb.append(" ");
                }
            }
            cnt++;
        }

        return sb.toString();
    }

    private static class PeriodoNumerico {

        private final int m_posicion;
        private final Integer m_numero;

        public PeriodoNumerico(int posicion, Integer numero) {

            if (posicion < 0) {
                throw new IllegalArgumentException("Posicion debe ser un numero positivo!");
            }

            if (numero < 0) {
                throw new IllegalArgumentException("Periodo numérico no puede ser menor que cero!");
            }
            if (numero > 999999) {
                throw new IllegalArgumentException("Periodo numérico no puede ser mayor que 999.999!");
            }

            this.m_posicion = posicion;
            this.m_numero = numero;
        }

        private String sufijo() {

            switch (m_numero) {
                case 0:
                    return ""; // Ej.: 100000000000000
                    
                case 1:
                    StringBuilder sb1 = new StringBuilder();
                    return sb1.append(PERIODOS[m_posicion]).append(LLON).toString();

                default:
                    StringBuilder sb2 = new StringBuilder();
                    return sb2.append(PERIODOS[m_posicion]).append(LLONES).toString();
            }
        }

        private boolean esPrimerPeriodo() {
            return 0 == m_posicion;
        }

        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder();

            // procesar los digitos del periodo
            sb.append(procesarPeriodo());

            if (!esPrimerPeriodo()) {
                sb.append(" ");
                sb.append(sufijo());
            }

            return sb.toString();
        }

        private String procesarPeriodo() {

            List<ClaseNumerica> lc = splitClases(m_numero);

            StringBuilder sb = new StringBuilder();
            ListIterator li = lc.listIterator();
            while (li.hasNext()) {
                sb.append(li.next().toString());
                sb.append(" ");
            }

            return sb.toString();
        }

        private List<ClaseNumerica> splitClases(Integer s) {

            List<ClaseNumerica> lc = new ArrayList<>();

            Integer clBaja, clAlta;
            clBaja = s - ((s / 1000) * 1000);
            clAlta = s / 1000;

            if (clAlta > 0) {
                lc.add(new ClaseNumerica(clAlta, TipoClase.ClaseAlta, this));
            }

            lc.add(new ClaseNumerica(clBaja, TipoClase.ClaseBaja, this));


            return lc;
        }
    }

    private enum TipoClase {

        ClaseBaja, ClaseAlta
    }

    private static class ClaseNumerica {

        private final Integer m_numero;
        private final TipoClase m_tipo;
        private final PeriodoNumerico m_periodo;

        public ClaseNumerica(Integer num, TipoClase tc, PeriodoNumerico periodo) {

            if (null == periodo) {
                throw new IllegalArgumentException("Periodo no puede ser null");
            }

            this.m_tipo = tc;
            this.m_numero = num;
            this.m_periodo = periodo;

        }

        @Override
        public String toString() {
            final int cen = m_numero / 100;
            final int dec = (m_numero - (m_numero / 100) * 100) / 10;
            final int uni = m_numero - (m_numero / 10) * 10;
            final boolean claseBaja = (m_tipo == TipoClase.ClaseBaja);

            StringBuilder sb = new StringBuilder();

            // No hace falta considerar 0 (cero)

            // Caso excepcional
            if (100 == m_numero) {
                if (claseBaja) {
                    return CIEN;
                } else {
                    sb.append(CIEN);
                    sb.append(" ");
                    sb.append(MIL);
                    return sb.toString();
                }
            }

            // Empezar con las centenas
            if (cen > 0) {
                sb.append(CENTENAS[cen]);
            }

            if ((((10 * dec) + uni) < 10) && (((10 * dec) + uni) > 0)) {
                sb.append(" ");
                if (uni == 1) {
                    if (claseBaja && m_periodo.esPrimerPeriodo()) {
                        sb.append(UNIDADES[uni]);
                    } else {
                        sb.append(UN);
                    }
                } else {
                    sb.append(UNIDADES[uni]);
                }

            }

            if ((((10 * dec) + uni) > 9) && (((10 * dec) + uni) < 20)) {
                sb.append(" ");
                sb.append(DIECIS[uni]);
            }

            if ((((10 * dec) + uni) > 19) && (((10 * dec) + uni) < 30)) {
                sb.append(" ");
                if (uni == 1) {
                    if (claseBaja && m_periodo.esPrimerPeriodo()) {
                        sb.append(VEINTIS[uni]); // veintiuno
                    } else {
                        sb.append(VEINTIUN);
                    }
                } else {
                    sb.append(VEINTIS[uni]);
                }
            }

            if (dec > 2) {
                sb.append(" ");
                sb.append(DECENAS[dec]);
            }

            if ((dec > 2) && (uni > 0)) {
                sb.append(" y ");
                if (uni == 1) {
                    if (claseBaja && m_periodo.esPrimerPeriodo()) {
                        sb.append(UNIDADES[uni]);
                    } else {
                        sb.append(UN);
                    }
                } else {
                    sb.append(UNIDADES[uni]);
                }
            }

            if ((m_numero > 0) && (!claseBaja)) {
                sb.append(" ");
                sb.append(MIL);
            }

            return sb.toString();
        }
    }
}
