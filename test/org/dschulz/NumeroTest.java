/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dschulz;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class NumeroTest {

    public NumeroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        //System.err.println("Setup class");
    }

    @AfterClass
    public static void tearDownClass() {
        //System.err.println("Tear down class");
    }

    @Before
    public void setUp() {
        //System.err.println("Setup");
    }

    @After
    public void tearDown() {
        //System.err.println("Tear down");
    }

    @Test
    public void testEnLetras_BigDecimal() {
        System.err.println("Test BigDecimal 1");
        BigDecimal numero = new BigDecimal("212.1235");
        String expResult = "Doscientos doce con 1235/10000";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger() {
        System.err.println("Test BigInteger 1");

        BigInteger numero = new BigInteger("0");
        String expResult = "Cero";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger1() {
        BigInteger numero = new BigInteger("101");
        String expResult = "Ciento uno";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger2() {
        BigInteger numero = new BigInteger("121");
        String expResult = "Ciento veintiuno";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger3() {
        BigInteger numero = new BigInteger("121101");
        String expResult = "Ciento veintiún mil ciento uno";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger4() {
        BigInteger numero = new BigInteger("30001000000");
        String expResult = "Treinta mil un millones";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger5() {
        BigInteger numero = new BigInteger("30001000101");
        String expResult = "Treinta mil un millones ciento uno";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger6() {
        BigInteger numero = new BigInteger("30001000101001252216518611313");
        String expResult = "Treinta mil un quatrillones ciento un trillones un mil doscientos cincuenta y dos billones doscientos dieciséis mil quinientos dieciocho millones seiscientos once mil trescientos trece";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger7() {
        BigInteger numero = new BigInteger("100000000000000");
        String expResult = "Cien billones";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger8() {
        BigDecimal numero = new BigDecimal("1e100");
        String expResult = "Diez mil hexadecillones";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger9() {
        BigDecimal numero = new BigDecimal("1e144");
        String expResult = "Un cuatorvigintillón";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }

    @Test
    public void testEnLetras_BigInteger10() {
        BigDecimal numero = new BigDecimal("1e150");
        String expResult = "Un quinvigintillón";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEnLetras_BigInteger11(){
        BigDecimal numero = new BigDecimal("1e180");
        String expResult = "Un trigintillón";
        String result = Numero.enLetras(numero);
        assertEquals(expResult, result);
    }
}