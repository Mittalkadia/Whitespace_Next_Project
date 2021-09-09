package org.example;

import org.openqa.selenium.By;


public class Utils extends Base_Page {
    // method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    // method for click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
}
