package test;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import test.requirements.UserLogin;
import test.requirements.ProductGroup;
import test.steps.LoginSteps;
import test.steps.ProductGroupSteps;

@Story(ProductGroup.class)
@RunWith(ThucydidesRunner.class)
public class ProductGroupTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://tpa.smiss.ua/")
	public Pages pages;

	@Steps
	public LoginSteps user;
	@Steps
	public ProductGroupSteps endUser;


	@Issue("#ProductGroup-1")
	
    @Before
	public void entering_of_correct_credentials_should_open_application() {
	        user.is_the_home_page();
			user.enter_credentials("demo");	
	    }
	    public void go_to_product_group_page(){
	    }
	   
	    
	    @Test	
	    public void product_group_creation() {
		
		// getPages().get(LoginPage.class);
		// user = new LoginSteps();
	    // var s = getPages().get(LoginPage.class);
        // user.is_the_home_page();
	    // user.enter_credentials("demo");	
	    
	   
	        endUser.is_the_product_group_page();
			endUser.click_create_button();
			endUser.enter_product_group_name("Smiss PG");
		//	endUser.select_business_line();
			endUser.click_save_button();
	    }
	
	
	
}
