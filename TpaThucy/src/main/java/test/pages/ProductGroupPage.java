package test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("http://tpa.smiss.ua/productgroup/index")
public class ProductGroupPage extends PageObject {

	 @FindBy(name="delete")
	 private WebElementFacade deleteButton;

	 @FindBy(name="create")
	 private WebElementFacade createButton;
	 
	 @FindBy(id="inputName")
	 private WebElementFacade nameField;
	 
	 @FindBy(name="inputBL")
	 private WebElementFacade businessLineDropDown;
	 
	 @FindBy(css="input.btn.btn-primary")
	 private WebElementFacade saveButton;
	 
	/*    
	 @FindBy(smth=" ? ")
	 private WebElementFacade moveToFirstPageButton;
	
	 @FindBy(smth=" ? ")
	 private WebElementFacade moveToPreviousPageButton;
	 
	 @FindBy(smth=" ? ")
	 private WebElementFacade moveToNextPageButton;
	 
	 @FindBy(smth=" ? ")
	 private WebElementFacade moveToLastPageButton; */
	
	 @FindBy(id="pagination")
	 private WebElementFacade pageSearchField;
	
	 @FindBy(xpath=" /html/body/div[5]/div[2]/div/table/thead/tr[2]/th[3]/input")
	 private WebElementFacade nameSearchField;
	
	 @FindBy(name="showDeleted")
	 private WebElementFacade showDeletedCheckBox;
	 
	 @FindBy(className="toggle")
	 private WebElementFacade showFilterArrow;
	
	 @FindBy(name="selectAll")
	 private WebElementFacade checkAllCheckBox;

	 public void createButton_click() {
		 createButton.click();	
	 }
	 
	 public void enter_name(String productGroupName) {
		 nameField.type(productGroupName);
	 }
	 
	 public void select_business_line(String businessLine) {
		 businessLineDropDown.type(businessLine);
	 }

	 public void saveButton_click() {
		 saveButton.click();
	 }

	 public void search_for_product_group(String productGroupName) {
		nameSearchField.type(productGroupName + Keys.RETURN);
	 }
	 
}
