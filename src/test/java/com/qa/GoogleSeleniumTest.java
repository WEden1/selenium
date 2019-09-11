package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class GoogleSeleniumTest {
    private ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Profile\\IdeaProjects\\selenium\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.name("q"));
        assertTrue(searchField.isDisplayed());
        searchField.sendKeys("funny cat pictures");
        Thread.sleep(5000);
        WebElement submit = driver.findElement(By.name("btnK"));
        submit.click();
        Thread.sleep(5000);
        WebElement linkToBiggerPicture = driver.findElementByLinkText("Images for funny cat");
        linkToBiggerPicture.click();
        Thread.sleep(5000);
        WebElement catImage = driver.findElementByXPath("//*[@id=\"rg_s\"]/div[5]");
        catImage.click();
        Thread.sleep(5000);

    }
}
