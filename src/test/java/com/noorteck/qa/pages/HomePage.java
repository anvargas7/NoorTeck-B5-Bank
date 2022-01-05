package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(css = ("ul.navigation-items li:nth-of-type(2)")) 
	WebElement transferButton;

	@FindBy(xpath = "//*[routerlink='/loans']")
	WebElement loansButton;

	@FindBy(xpath = "//*[class='ng-star-inserted']")
	WebElement logOutButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickTransferButton() {
		click(transferButton);
	}

	public void clickLoansButton() {
		click(loansButton);
	}

	public void clickLogOutButton() {
		click(logOutButton);
	}

}
