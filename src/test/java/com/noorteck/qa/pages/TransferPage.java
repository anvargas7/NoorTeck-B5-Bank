package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	
	String countryName = "";

	@FindBy(xpath = "//mat-select[@id = 'mat-select-0']")
	WebElement originAccount;	
	
	//mat-option[@id='mat-option-5'] is RAINY DAY but goes to retirement? dynamic element?
	@FindBy(xpath = "//span[contains(@class, 'mat-option-text') and text()=' Rainy Day ']") //doesn't select rainy day but goes to retirement instead when the id = 'Rainy Day' ????????????
	WebElement rainyDayAccount;

	@FindBy(xpath = "//mat-select[@id='mat-select-1']")
	WebElement destinationAccount;
	
	@FindBy(xpath = "//span[contains(@class, 'mat-option-text') and text()=' Retirement ']") //doesn't select investing but when i do retirement it selects investing???
	WebElement investmentAccount;

	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement amountField;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement socialSecurityField;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	WebElement atmPINField;

	@FindBy(xpath = "//button[@class,'v24DomSyncDenyAgent.mat-raised-button.mat-primary']")
	WebElement transferButton;

	@FindBy(css = "mat-card-title") //need to use xpath or more specific tag
	WebElement successTransfer;

	public TransferPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectOriginAccount() {
		
		moveToElementAndClick(originAccount);
		
		moveToElementAndClick(rainyDayAccount);
		
	}

	public void selectDestinationAccount() {
		
		moveToElementAndClick(destinationAccount);
		
		moveToElementAndClick(investmentAccount);
		
	}

	public void enterAmount(String amount) {
		
		enter(amountField, amount);
	}

	public void enterSocialSecurity(String socialSecurityNumber) {
		enter(socialSecurityField, socialSecurityNumber);
	}

	public void clickTransfer() {
		moveToElementAndClick(transferButton);
	}

	public void enterAtmPINField(String PIN) {
		enter(atmPINField, PIN);
	}

	public void getSuccessMessage() {
		isDisplayed(successTransfer);
		String text = successTransfer.getText();
		System.out.println(text);
	}

}
