

EnLetras
========

Convierte números (en forma de BigInteger y BigDecimal) a su representación literal en castellano.
La clase permite convertir correctamente números desde cero hasta 1e203 (cientos de miles de tretrigintillones).


Ejemplo:

656845138498435468.546: 

"Seiscientos cincuenta y seis mil ochocientos cuarenta y cinco billones \
ciento treinta y ocho mil cuatrocientos noventa y ocho millones cuatrocientos \
treinta y cinco mil cuatrocientos sesenta y ocho con 546/1000"


Uso: 

    import org.dschulz.Numero;
    ...

    BigInteger bi = new BigInteger("8905465");
    String texto = Numero.enLetras(bi);


    
En el directorio `dist` se encuentra EnLetras.jar. Este jar puede ser ejecutado
y provee una GUI rápida y sucia para probar la clase org.dschulz.Numero.

    java -jar EnLetras.jar

    

Diego Schulz <dschulz_at_gmail_dot_com>
