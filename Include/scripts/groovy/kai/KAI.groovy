package kai
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



class KAI {
	@And('I want to pay train bill')
	def I_want_to_pay_train_bill(){
		Mobile.callTestCase(findTestCase('KAI/Go To KAI From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I write (.*) booking of train bill')
	def I_write_number_booking_of_train_bill(String numberKAI){
		Mobile.callTestCase(findTestCase('KAI/Service KAI Form'), [('numberKAI') : numberKAI], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw amount of train bill then choose account (.*)')
	def I_saw_amount_of_train_bill_then_choose_account_debit(String debit){
		Mobile.callTestCase(findTestCase('KAI/Service KAI Nominal'), [('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm payment of train bill')
	def I_confirm_payment_of_train_bill(){
		Mobile.callTestCase(findTestCase('KAI/Service KAI Confirm'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Abnormal Saldo - I saw amount of train bill with (.*)')
	def Abnormal_saldo_i_saw_amount_of_train_bill(String username){
		Mobile.callTestCase(findTestCase('KAI/Service KAI Nominal - Abnormal Saldo'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}