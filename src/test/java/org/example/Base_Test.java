package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base_Test extends Utils {
    @BeforeMethod
    public void open_Browser() {
        //setting up chrome driver from WebDriver manager
        WebDriverManager.chromedriver().setup();
        //create object for chrome driver
        driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //open URL
        driver.get("https://www.next.co.uk/");
    }

    @AfterMethod
    public void close_Browser() {
        //close browser
        driver.quit();
    }
}
