package test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.Keys;

@DefaultUrl("http://tpa.smiss.ua/productgroup/index")
public class ProductGroupPage extends PageObject {

	 @FindBy(name="delete")
	 private WebElementFacade deleteButton;

	 @FindBy(name="create")
	 private WebElementFacade createButton;
	 
	 @FindBy(id="inputName")
	 private WebElementFacade nameField;
	 
	 @FindBy(id="inputBL")
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
	
	 @FindBy(xpath="/html/body/div[5]/div[2]/div/table/thead/tr[2]/th[3]/input")
	 private WebElementFacade nameSearchField;
	
	 @FindBy(name="showDeleted")
	 private WebElementFacade showDeletedCheckBox;
	 
	 @FindBy(className="toggle")
	 private WebElementFacade showFilterArrow;
	
	 @FindBy(name="selectAll")
	 private WebElementFacade checkAllCheckBox;
	 
	 @FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)")
	 private WebElementFacade firstFindedProductGroup;
	 
	 @FindBy(css="td.ignore:nth-child(1) > div:nth-child(1)")
	 public WebElementFacade firstFindedProductGroupCheckBox;
	 
	 @FindBy(css="#confirmDelete > form:nth-child(1) > input:nth-child(2)")
	 private WebElementFacade yesButtonDeletionConfirmation;
	 
	 @FindBy(css="input.btn:nth-child(3)")
	 private WebElementFacade noButtonDeletionConfirmation;
	 
	 @FindBy(css="button.btn:nth-child(4)")
	 private WebElementFacade yesButtonUpdateConfirmation;
	 
	 @FindBy(css=".restore")
	 private WebElementFacade restoreButton;

	 public void createButtonClick(){
		 createButton.click();	
	 }
	 
	 public void enterName(String productGroupName) {
		 nameField.type(productGroupName);
	 }
	 
	 public void selectBusinessLine(String businessLine) {
		 businessLineDropDown.type(businessLine);
	 }

	 public void saveButtonClick() {
		 saveButton.click();
	 }

	 public void searchForProductGroup(String productGroupName) {

		nameSearchField.type(productGroupName + Keys.ENTER);
	 }
	 
	 public String getProductGroupName() {
	        String results = firstFindedProductGroup.getText();
	        return (results);
	 }
	 
	 public void firstFindedProductGroupClick(){
		 firstFindedProductGroup.click();	
	 }
	 
	 public void firstFindedProductGroupCheck(){
		 firstFindedProductGroupCheckBox.click();	
	 }
	 
	 public void deleteButtonClick(){
		 deleteButton.click();	
	 }
	 
	 public void confirmDeletionButtonClick(){
		 yesButtonDeletionConfirmation.click();	
	 }
	 
	 public void confirmUpdateButtonClick(){
		 yesButtonUpdateConfirmation.click();	
	 }
	 
	 public String getRestoreButtonName() {
	        String results = restoreButton.getText();
	        return (results);
	 }
	 
	 public void restoreButtonClick(){
		 restoreButton.click();	
	 }
	 
	
}
