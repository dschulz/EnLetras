/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dschulz.Numero;

/**
 *
 * @author diego
 */
public class NumeroMain {

    public static void main(String[] args) {

        startGui();

        String path = "/home/diego/Escritorio/numeros.txt";
        writeFile(path);
        //openFile(path);

        test2();
        test0();

    }

    public static void openFile(String path) {
        Desktop desktop = Desktop.getDesktop();

        try {
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File(path));
            } else {
                System.out.println("No soportado.");
            }
        } catch (Exception ex) {
            Logger.getLogger(NumeroMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void startGui() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumeroGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                NumeroGui ng = new NumeroGui();
                ng.setLocation(200, 120);

                ng.setVisible(true);
            }
        });
    }

    public static void writeFile(String path) {
        try (FileOutputStream fos = new FileOutputStream(path, false); PrintWriter writer = new PrintWriter(fos)) {
            BigInteger bi0 = new BigInteger("890011809687175131890011809687175131890011809687175131890011809687175131890011809687175131890011809687175131");
            writer.println(String.format("%1$d: %2$s", bi0, Numero.enLetras(bi0)));


//            Integer cnt;
//
//            for (cnt = 0; cnt < 1001; cnt++) {
//                BigInteger bi = new BigInteger(cnt.toString());
//                writer.println(String.format("%1$d: %2$s", bi, Numero.enLetras(bi)));
//            }
//
//            for (cnt = 99100; cnt < 121902; cnt++) {
//                BigInteger bi = new BigInteger(cnt.toString());
//                writer.println(String.format("%1$d: %2$s", bi, Numero.enLetras(bi)));
//            }
//            BigInteger bi = new BigInteger("3000001100012");
//            writer.println(String.format("%1$d: %2$s", bi, Numero.enLetras(bi)));

        } catch (IOException e) {
            System.err.println(String.format("Exception: %1$s", e.getMessage()));
        }

    }

    public static void test1() {
        BigInteger bi = new BigInteger("890011809687175131890011809687175131890011809687175131890011809687175131890011809687175131890011809687175131");
        System.out.println(String.format("%1$,d: %2$s", bi, Numero.enLetras(bi)));
        BigInteger bi2 = new BigInteger("809687175131");
        System.out.println(String.format("%1$,d: %2$s", bi2, Numero.enLetras(bi2)));

    }

    public static void test0() {
//        testNumero("123456789666555444333222111.65");
//        testNumero("123456789666555444333222111");
//        testNumero("1000000");
//        testNumero("100000000001");
        // testNumero("123456789");
        // testNumero("100100121");

        Random r = new Random();
        for (int i = 0; i < 212; i++) {
            testNumero(new Integer(i).toString() + "." + r.nextInt(999));
        }
        for (int i = 0; i < 212; i++) {
            testNumero(new Integer((1000 * i)).toString());
        }
    }

    public static void testNumero(String n) {
        StringBuilder sb = new StringBuilder();
        BigDecimal bd = new BigDecimal(n);
        sb.append(String.format("%1$,.3f", bd));
        sb.append(": ");
        sb.append(Numero.enLetras(bd));
        sb.append(".");
        System.out.println(sb.toString());

    }

    public static void test2() {

        String l;
        long t0, t1, total = 0;
        List<BigInteger> ll = new ArrayList<>();
        Map<BigInteger, String> lr = new HashMap<>();


        ll.add(new BigInteger("100000000000000"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("21"));
        ll.add(new BigInteger("654321"));
        ll.add(new BigInteger("54321"));
        ll.add(new BigInteger("0"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("1000000"));
        ll.add(new BigInteger("100000000001"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("21"));
        ll.add(new BigInteger("654321"));
        ll.add(new BigInteger("54321"));
        ll.add(new BigInteger("0"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("1000000"));
        ll.add(new BigInteger("100000000001"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("21"));
        ll.add(new BigInteger("654321"));
        ll.add(new BigInteger("54321"));
        ll.add(new BigInteger("0"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("1000000"));
        ll.add(new BigInteger("100000000001"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("1231"));
        ll.add(new BigInteger("21"));
        ll.add(new BigInteger("654321"));
        ll.add(new BigInteger("54321"));
        ll.add(new BigInteger("0"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("123456789666555444333222111"));
        ll.add(new BigInteger("1000000"));
        ll.add(new BigInteger("100000000001"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));
        ll.add(new BigInteger("51356561689879846546546543298"));

        for (BigInteger bi : ll) {
            t0 = System.nanoTime();
            l = Numero.enLetras(bi);
            t1 = System.nanoTime();
            total += (t1 - t0);

            lr.put(bi, l);
        }

        System.out.println(ll.size() + " números, total " + String.format("%1$.2f", total / 1000000.0) + " ms.");
        System.out.println(String.format("%1$.2f ms./conversión", total / 1000000.0 / ll.size()));


    }
}
