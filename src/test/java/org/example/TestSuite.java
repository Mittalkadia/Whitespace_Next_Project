package org.example;

import org.testng.annotations.Test;

public class TestSuite extends Base_Test {

    HomePage homePage = new HomePage();
    Login_Page login_page = new Login_Page();

    @Test
    public void user_Should_Successfully_Sign_In() {
        homePage.click_On_MyAccount();
        login_page.user_Sign_Into_Next();

    }
}
