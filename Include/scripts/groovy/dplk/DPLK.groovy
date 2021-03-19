package dplk
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class DPLK {
	@And('I want to see my DPLK account')
	def I_want_to_see_my_dplk_account(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Go To DPLK Info From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('I already see my DPLK account')
	def I_already_see_my_dplk_account(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Service Info DPLK'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('I want to top up my DPLK account with (.*) for (.*)')
	def I_want_to_top_up_my_dplk_account(String condition, String username){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Go To DPLK Form From DPLK Info'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw my top up DPLK history')
	def I_saw_my_top_up_dplk_history(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Service DPLK Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I want to add recipient of DPLK')
	def I_want_to_add_recipient_of_dplk(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Go To DPLK New From DPLK Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try adding recipient of DPLK account condition with (.*)')
	def I_try_adding_recipient_of_dplk_account_condition_with_dplkNumber(String dplkNumber){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Service DPLK New Form'), [('dplkNumber') : dplkNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I inputting (.*) for the DPLK amount and (.*) with (.*) , then choose account (.*)')
	def I_inputting_amount_for_the_dplk_amount(String amountDPLK, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Service DPLK Nominal'), [('amountDPLK') : amountDPLK, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm top up DPLK account')
	def I_confirm_top_up_dplk_account(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Service DPLK Confirm'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Validate DPLK Form")
	def validate_dplk_form(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/1 - DPLK Form/Validate Toolbar DPLK'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/1 - DPLK Form/Validate TextView Top Up Terakhir'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/1 - DPLK Form/Validate TextView Daftar DPLK'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/1 - DPLK Form/Validate Button Top Up Baru'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate DPLK New Form")
	def validate_dplk_new_form(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/2 - DPLK New Form/Validate Toolbar DPLK'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/2 - DPLK New Form/Validate TextView Top Up DPLK'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/2 - DPLK New Form/Validate EditText Masukkan Nomor Akun'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/2 - DPLK New Form/Validate Button Lanjutkan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate DPLK Inquiry")
	def validate_dplk_inquiry(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/3 - DPLK Inquiry/Validate Toolbar DPLK'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/3 - DPLK Inquiry/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/3 - DPLK Inquiry/Validate TextView Nominal Top Up'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/3 - DPLK Inquiry/Validate EditText Masukkan Nominal Top Up'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/3 - DPLK Inquiry/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/3 - DPLK Inquiry/Validate Button Lanjutkan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate DPLK Confirm")
	def validate_dplk_confirm(){
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate Toolbar Konfirmasi'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate TextView Detail'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate TextView Nominal Top Up'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate TextView Biaya Admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate TextView Total'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/DPLK/Validate/4 - DPLK Confirm/Validate Button Top Up  '), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
}