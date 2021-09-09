package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By _myAccount=By.xpath("//a[@accesskey=\"h\"]");

    public void click_On_MyAccount(){
        //click on MyAccount
        clickOnElement(_myAccount);

    }
}
