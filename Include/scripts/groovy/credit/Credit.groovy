package credit
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



class Credit {
	@And('I want to pay credit bill with (.*) for (.*)')
	def I_want_to_pay_credit_bill(String condition, String username){
		Mobile.callTestCase(findTestCase('Credit Card/Go To Credit From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw payment of credit bills history')
	def I_saw_payment_of_credit_bills_history(){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I want to add recipient of credit bill')
	def I_want_to_add_recipient_of_credit_bill(){
		Mobile.callTestCase(findTestCase('Credit Card/Go To Credit New From Credit Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try adding recipient of credit bill condition with (.*) and (.*)')
	def I_try_adding_recipient_of_credit_bill_condition_with_creditBank_and_creditNumber(String creditBank, String creditNumber){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit New Form'), [('creditBank') : creditBank, ('creditNumber') : creditNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I inputting (.*) and (.*) for the credit amount and (.*) with (.*) , then choose account (.*)')
	def I_inputting_totalInput_and_amount(String totalInput, String amountCredit, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit Nominal'), [('totalInput') : totalInput, ('amountCredit') : amountCredit, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm payment of credit bill with (.*) and (.*)')
	def I_confirm_payment_of_credit_bill_with_detail(String detail, String creditBank){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit Confirm'), [('detail') : detail, ('creditBank') : creditBank], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try pay credit bill from my list')
	def I_try_pay_credit_from_my_list(){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit From List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try pay credit bill from my history')
	def I_try_pay_credit_from_my_history(){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('Abnormal Saldo - I inputting (.*) and (.*) for the credit amount with (.*)')
	def Abnormal_saldo_i_inputting_totalInput_and_amount(String totalInput, String amountCredit, String username){
		Mobile.callTestCase(findTestCase('Credit Card/Service Credit Nominal - Abnormal Saldo'), [('totalInput') : totalInput, ('amountCredit') : amountCredit, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}