package org.example;

import org.openqa.selenium.By;

public class Login_Page extends Utils{
    LoadProperty loadProperty=new LoadProperty();
    private By _emailAddress=By.cssSelector("input#EmailOrAccountNumber");
    private By _password=By.cssSelector("input#Password");
    private By _signInButton=By.cssSelector("input#SignInNow");

    public void user_Sign_Into_Next(){
        //Type email
        enterText(_emailAddress,loadProperty.getProperty("Email"));
        //Type Password
        enterText(_password,loadProperty.getProperty("Password"));
        //Click on SigIn
        clickOnElement(_signInButton);
        //print message
        System.out.println(loadProperty.getProperty("SuccessMessage"));
    }
}
