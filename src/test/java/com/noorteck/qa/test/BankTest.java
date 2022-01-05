package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;


public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "https://usdemo.vee24.com/#/transactions";
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		testCaseOne();
		CommonUI.quitBrowser();
		
		
	}
	
	public static void testCaseOne() {
		
		homePageObj.clickTransferButton();
		transferPageObj.selectOriginAccount();
		transferPageObj.selectDestinationAccount();
		transferPageObj.enterAmount("1000");
		transferPageObj.enterSocialSecurity("123435677");
		transferPageObj.enterAtmPINField("1235");
		transferPageObj.clickTransfer();
		transferPageObj.getSuccessMessage();
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FORGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FORGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/