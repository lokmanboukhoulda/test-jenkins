/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theguru.mavenproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author theguru
 */
public class FonctionMathTest {
    
    public FonctionMathTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of add method, of class FonctionMath.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");
        String valeur1 = "5";
        String valeur2 = "7";
        int expResult = 12;
        int result = FonctionMath.add(valeur1, valeur2);
        assertEquals(expResult, result);
    }

    /**
     * Test of minus method, of class FonctionMath.
     */
    @org.junit.jupiter.api.Test
    public void testMinus() {
        System.out.println("minus");
        String valeur1 = "5";
        String valeur2 = "7";
        int expResult = -2;
        int result = FonctionMath.minus(valeur1, valeur2);
        assertEquals(expResult, result);

    }

    /**
     * Test of divide method, of class FonctionMath.
     */
    @org.junit.jupiter.api.Test
    public void testDivide() {
        System.out.println("divide");
        String valeur1 = "5";
        String valeur2 = "2";
        double expResult = 2.5;
        double result = FonctionMath.divide(valeur1, valeur2);
        assertEquals(expResult, result, 2.5);

    }
    
}
