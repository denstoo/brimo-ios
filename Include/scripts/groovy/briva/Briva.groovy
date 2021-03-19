package briva
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



class Briva {
	@And("I want transfer with virtual account with (.*) for (.*)")
	def I_want_transfer_with_virtual_account(String condition, String username){
		Mobile.callTestCase(findTestCase('Briva/Go To Briva From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I saw my virtual account transfer history")
	def I_saw_my_virtual_account_transfer_history(){
		Mobile.callTestCase(findTestCase('Briva/Service Briva Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to add recipient of virtual account")
	def I_want_to_add_recipient_of_virtual_account(){
		Mobile.callTestCase(findTestCase('Briva/Go To Briva New From Briva Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I try adding recipient of virtual account in condition with (.*)")
	def I_try_adding_recipient_of_virtual_account_in_condition_with_brivaNumber(String brivaNumber){
		Mobile.callTestCase(findTestCase('Briva/Service Briva New Form'), [('brivaNumber') : brivaNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I inputting (.*) for (.*) Payment Briva and (.*) with (.*) , then choose account (.*)")
	def I_inputting_amount_for_what_payment_briva(String amountBriva, String whatPayment, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Briva/Service Briva Nominal'), [('amountBriva') : amountBriva, ('whatPayment') : whatPayment, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I confirm briva transaction with (.*)")
	def I_confirm_briva_transaction_with_detail(String detail){
		Mobile.callTestCase(findTestCase('Briva/Service Briva Confirm'), [('detail') : detail], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try pay briva from my list')
	def I_try_pay_briva_from_my_list(){
		Mobile.callTestCase(findTestCase('Briva/Service Briva From List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try pay briva from my history')
	def I_try_pay_briva_from_my_history(){
		Mobile.callTestCase(findTestCase('Briva/Service Briva From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Abnormal Saldo - I inputting (.*) for (.*) Payment Briva with (.*)")
	def Abnormal_saldo_i_inputting_amount_for_what_payment_briva(String amountBriva, String whatPayment, String username){
		Mobile.callTestCase(findTestCase('Briva/Service Briva Nominal - Abnormal Saldo'), [('amountBriva') : amountBriva, ('whatPayment') : whatPayment, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}