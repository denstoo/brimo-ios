package pulsa
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



class Pulsa {
	@And("I want to buy pulsa with (.*) for (.*)")
	def I_want_to_buy_pulsa(String condition, String username){
		Mobile.callTestCase(findTestCase('Pulsa/Go To Pulsa From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I write my (.*) phone and (.*)")
	def I_write_my_number_phone_and_amount(String numberPhone, String amountPulsa){
		Mobile.callTestCase(findTestCase('Pulsa/Service Pulsa Form'), [('numberPhone') : numberPhone, ('amountPulsa') : amountPulsa], FailureHandling.STOP_ON_FAILURE)
	}

	//	@When("I confirm pulsa bill and choose (.*) cause (.*)")
	//	def I_confirm_pulsa_bill(String debit, String pulsa){
	//		Mobile.callTestCase(findTestCase('Service Pulsa Confirm'), [('debit') : debit, ('pulsa') : pulsa], FailureHandling.STOP_ON_FAILURE)
	//	}

	@When('I choose account (.*) for pulsa')
	def I_choose_account_debit_for_pulsa(String debit){
		Mobile.callTestCase(findTestCase('Pulsa/Service Pulsa Rekening'), [('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I confirm pulsa bill cause (.*)")
	def I_confirm_pulsa_bill_cause_provider(String pulsa){
		Mobile.callTestCase(findTestCase('Pulsa/Service Pulsa Confirm'), [('pulsa') : pulsa], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I buy pulsa from my history')
	def I_buy_pulsa_from_my_history(){
		Mobile.callTestCase(findTestCase('Pulsa/Service Pulsa From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Abnormal Saldo - I confirm pulsa bill with (.*) and (.*)")
	def Abnormal_saldo_i_confirm_pulsa_bill(String username, String pulsa){
		Mobile.callTestCase(findTestCase('Pulsa/Service Pulsa Rekening - Abnormal Saldo'), [('username') : username, ('pulsa') : pulsa], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I want to buy pulsa from fast menu with (.*) for (.*)")
	def I_want_to_buy_pulsa_from_fast_menu(String condition, String username){
		Mobile.callTestCase(findTestCase('Pulsa/Go To Pulsa From Fast Menu'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}