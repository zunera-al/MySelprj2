/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.SeleniumTest.test;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Zunera Ali
 */
public class GoogleSearchTest {

    WebDriver driver;

    public GoogleSearchTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        //calling driverutils
        //open chrome/ launching browser
        driver = DriverUtils.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /*@Test
     public void testSearch() {
     driver.get("http://www.google.com");
     WebElement e = driver.findElement(By.name("q"));
     e.sendKeys("selenium jobs");
     e = driver.findElement(By.name("btnK"));
     e.click();
     String title = driver.getTitle();
     assertTrue(title.contains("selenium jobs"));
     System.out.println("Title is selenium jobs");

     }

     @Test
     public void testNavigation() {
     Navigation n = driver.navigate();
     n.to("http://www.itexps.net");
     n.to("http://www.google.com");
     n.to("http://www.facebook.com");
     n.back();
     n.forward();
     n.refresh();
     }*/
    //fb sign up
    @Test
    public void testFacebookSignup() {
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("u_0_f")).sendKeys("Narendra");
        driver.findElement(By.name("lastname")).sendKeys("lilaramani");
        driver.findElement(By.id("u_0_k")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("u_0_p")).sendKeys("abc123");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        driver.findElement(By.id("u_0_9")).click();
        driver.findElements(By.name("sex")).get(0).click();
        driver.findElement(By.id("u_0_w")).click();
        //to select from drop down
        new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(3);
        //if not selected then click
        if (!driver.findElements(By.name("sex")).get(0).isSelected()) {
            driver.findElements(By.name("sex")).get(0).click();
        }

    }
}
