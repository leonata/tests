package test.steps;

import test.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.*;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    
    @Step
    public void is_the_home_page() {
        loginPage.open();
    }

    @Step
    public void enters(String credentials) {
        loginPage.enter_credentials(credentials);
    }

    @Step
    public void clicks() {
        loginPage.logInButton_click();
    }

    @Step
    public void should_see_greeting(String greeting) {
        assertEquals(loginPage.getLoginGreeting(), greeting);
       
    }

    @Step
    public void should_see_warning(String warning) {
        assertEquals(loginPage.getLoginWarning(), warning);
       
    }

    @Step
    public void enter_credentials(String term) {
        enters(term);
        clicks();
    }
}