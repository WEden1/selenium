package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasyTestsRadioButtons {
    private ChromeDriver chromeDriver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Profile\\IdeaProjects\\selenium\\src\\test\\java\\resources\\chromedriver.exe");
        chromeDriver = new ChromeDriver();

    }

    ;

    @After
    public void tearDown() {
        chromeDriver.close();
    }

    @Test
    public void seleniumEasyTestCheckbox() throws InterruptedException {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        WebElement radioButton = chromeDriver.findElementByXPath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input");
        radioButton.click();
        Thread.sleep(2000);
        WebElement submitRadioButton = chromeDriver.findElementById("buttoncheck");
        submitRadioButton.click();
        Thread.sleep(2000);
        WebElement radioButton2 = chromeDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
        radioButton2.click();
        Thread.sleep(2000);
    }
}
