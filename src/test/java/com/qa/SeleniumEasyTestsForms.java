package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class SeleniumEasyTestsForms {

    private ChromeDriver chromeDriver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Profile\\IdeaProjects\\selenium\\src\\test\\java\\resources\\chromedriver.exe");
        chromeDriver = new ChromeDriver();

    };

    @After
    public void tearDown(){
        chromeDriver.close();
    }

    @Test
    public void seleniumEasyTest() throws InterruptedException {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(1000);
        WebElement inputField = chromeDriver.findElementById("user-message");
        assertTrue(inputField.isDisplayed());
        inputField.sendKeys("Hello");
        Thread.sleep(1000);
        WebElement submitForm = chromeDriver.findElementByXPath("//*[@id=\"get-input\"]/button");
        submitForm.click();
        Thread.sleep(1000);
        WebElement inputA = chromeDriver.findElementById("sum1");
        inputA.sendKeys("20");
        Thread.sleep(1000);
        WebElement inputB = chromeDriver.findElementById("sum2");
        inputB.sendKeys("20");
        Thread.sleep(1000);
        WebElement submitFormTotal = chromeDriver.findElementByXPath("//*[@id=\"gettotal\"]/button");
        submitFormTotal.click();
        Thread.sleep(1000);
    }


}
