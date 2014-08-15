package test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://tpa.smiss.ua")
public class HomePage extends PageObject{

    @FindBy(id="nav-claim")
    private WebElementFacade claimLink;
    
    @FindBy(id="nav-benefit")
    private WebElementFacade benefitPlanLink;
    
    @FindBy(id="nav-members")
    private WebElementFacade membersLink;
    
    @FindBy(id="nav-provider")
    private WebElementFacade providerLink;
    
    @FindBy(id="nav-person")
    private WebElementFacade personLink;
    
    @FindBy(id="companylobsettings")
    private WebElementFacade settingsLink;
    
    @FindBy(id="nav-importfile")
    private WebElementFacade importingLink;
    
    @FindBy(id="nav-profile")
    private WebElementFacade profileLink;
   
    @FindBy(id="nav-exit")
    private WebElementFacade exitLink;
    
    @FindBy(id="usermenu")
    private WebElementFacade userMenu;
    
    @FindBy(xpath="/html/body/div[3]/div/div[2]/div[3]/form/div/div/input")
    private WebElementFacade searchField;
    
    @FindBy(xpath="/html/body/div[3]/div/div[2]/div[3]/form/div/div/button")
    private WebElementFacade searchSubmitButton;
}
