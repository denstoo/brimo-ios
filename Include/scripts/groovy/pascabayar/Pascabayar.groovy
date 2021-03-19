package pascabayar
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



class Pascabayar {
	@And('I want to pay pascabayar bill with (.*) for (.*)')
	def I_want_to_pay_pascabayar_bill(String condition, String username){
		Mobile.callTestCase(findTestCase('Pascabayar/Go To Pascabayar From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw payment of pascabayar bills history')
	def I_saw_payment_of_pascabayar_bills_history(){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I want to add recipient of pascabayar bill')
	def I_want_to_add_recipient_of_pascabayar_bill(){
		Mobile.callTestCase(findTestCase('Pascabayar/Go To Pascabayar New From Pascabayar Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try adding recipient of pascabayar bill condition with (.*)')
	def I_try_adding_recipient_of_pascabayar_bill_condition_with_pascaNumber(String pascaNumber){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar New Form'), [('pascaNumber') : pascaNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw pascabayar amount and (.*) with (.*) , then choose account (.*)')
	def I_saw_pascabayar_amount(String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar Nominal'), [('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm payment of pascabayar bill with (.*)')
	def I_confirm_payment_of_pascabayar_bill(String pulsa){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar Confirm'), [('pulsa') : pulsa], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try pay pascabayar bill from my list')
	def I_try_pay_pascabayar_from_my_list(){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar From List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try pay pascabayar bill from my history')
	def I_try_pay_pascabayar_from_my_history(){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Abnormal Studio - I saw pascabayar amount with (.*)')
	def Abnormal_saldo_i_saw_pascabayar_amount(String username){
		Mobile.callTestCase(findTestCase('Pascabayar/Service Pascabayar Nominal - Abnormal Saldo'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}