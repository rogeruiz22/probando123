package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void firstTest() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com");

        Thread.sleep(8000);

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Login | Salesforce", "Could not load the site");

        Thread.sleep(2000);

        driver.quit();
    }
}
