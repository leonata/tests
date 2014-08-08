package test;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import test.requirements.UserLogin;
import test.steps.LoginSteps;

@Story(UserLogin.LoginByUser.class)
@RunWith(ThucydidesRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://tpa.smiss.ua")
    public Pages pages;

    @Steps
    public LoginSteps endUser;

    @Issue("#LOGIN-1")
    
    @Test
    public void entering_of_incorrect_credentials_should_not_open_application() {
        endUser.is_the_home_page();
		endUser.enter_credentials("qwerty");
		endUser.should_see_warning("Incorrect login!");
    }
    
    @Test
    public void entering_of_correct_credentials_should_open_application() {
        endUser.is_the_home_page();
		endUser.enter_credentials("demo");
        endUser.should_see_greeting("Welcome to application!");

    }



    @Pending @Test
    public void entering_of_correct_login_incorrect_password__should_not_open_application() {
    }
} 