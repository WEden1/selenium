package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasyTestCheckbox {

    private ChromeDriver chromeDriver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Profile\\IdeaProjects\\selenium\\src\\test\\java\\resources\\chromedriver.exe");
        chromeDriver = new ChromeDriver();

    };

    @After
    public void tearDown() {
        chromeDriver.close();
    }

    @Test
    public void seleniumEasyTestCheckbox() throws InterruptedException {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkBox1 = chromeDriver.findElementById("isAgeSelected");
        checkBox1.click();
        Thread.sleep(1000);

        WebElement checkAll = chromeDriver.findElementById("check1");
        checkAll.click();
        Thread.sleep(1000);

        WebElement checkOne = chromeDriver.findElementByXPath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input");
        checkOne.click();
        Thread.sleep(1000);

    }
}