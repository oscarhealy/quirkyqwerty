package com.mycompany.mavenunittestproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K00195112
 */
public class UtilityClassTest {

    public UtilityClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of concatWords method, of class UtilityClass.
     */
    @Test
    public void concatWords_inputStringsHelloWorld_OutputsOneString() {
        System.out.println("concatWords");
        String result = UtilityClass.concatWords("Hello", ", ", "world", "!");
        String expResult = "Hello, world!";
        assertEquals(expResult, result);
    }

    @Test
    public void computeFactorial_Factorial5_Is120() {
        System.out.println("ComputeFactorial 5");
        assertEquals("120", UtilityClass.computeFactorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void computeFactorial_FactorialNegative5_ThrowsException() {
        System.out.println("computeFactorial of -5");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + UtilityClass.computeFactorial(factorialOf));
    }

}
