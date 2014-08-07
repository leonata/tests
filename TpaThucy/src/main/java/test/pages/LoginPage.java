package test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;

@DefaultUrl("http://tpa.smiss.ua/site/login")
public class LoginPage extends PageObject {

    @FindBy(name="loginForm[login]")
    private WebElementFacade userField;

    @FindBy(name="loginForm[password]")
    private WebElementFacade passwordField;
    
    @FindBy(css="input.btn.btn-primary")
    private WebElementFacade logInButton;

    public void enter_credentials(String credentials) {
    	userField.type(credentials);
    	passwordField.type(credentials);
    }

    public void logInButton_click() {
    	logInButton.click();
    }

    public String getLoginWarning() {
        WebElementFacade loginWarning = find(By.cssSelector("p.text-danger"));
        String results = loginWarning.getText();
        return (results);
    }
    
    
    public String getLoginGreeting() {
        WebElementFacade loginGreeting = find(By.cssSelector("h2"));
        String results = loginGreeting.getText();
        return (results);
    }
    
}