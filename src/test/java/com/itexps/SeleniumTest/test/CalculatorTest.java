/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.SeleniumTest.test;

import com.itexps.seleniumtest.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zunera Ali
 */
public class CalculatorTest {

    Calculator c;//creating instanse variable and using it everywhere

    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("****Executing setupClass method***");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("***Executing tearDownClass method****");
    }

    @Before
    public void setUp() {
        System.out.println("***Executing setUp method***");
        c = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("***Executing tearDown method****");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void add() {
        System.out.println("***Executing add method***");
        double result = c.add(100.5, 200.5);
        assertEquals(301.0, result, 0.0);
    }

    @Test
    public void addMore() {
        System.out.println("***Executing addMore method***");
        // Calculator c = new Calculator(); wrote this in the setup method
        double result = c.add(20000, 21000);
        assertEquals(41000.0, result, 0.0);
    }
    @Test
    public void subtract(){
        System.out.println("**Executing subtract method");
        double result=c.subtract(40000, 20000);
        assertEquals(20000, result,0.0);
    }
}
