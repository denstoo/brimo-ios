package asuransi
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



class Asuransi {
	@And("I want to pay insurance bill with (.*) for (.*)")
	def I_want_to_pay_insurance_bill(String condition, String username){
		Mobile.callTestCase(findTestCase('Test Cases/Asuransi/Go To Asuransi From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I saw my insurance bill history")
	def I_saw_my_insurance_bill_history(){
		Mobile.callTestCase(findTestCase('Test Cases/Asuransi/Service Asuransi Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I want to add new insurance bill")
	def I_want_to_add_new_insurance_bill(){
		Mobile.callTestCase(findTestCase('Test Cases/Asuransi/Go To Asuransi New From Asuransi Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I try adding new insurance (.*) bill with (.*) and (.*)")
	def I_try_adding_new_insurance_bill_with_type_and_number(String insuranceType, String paymentType, String insuranceNumber){
		Mobile.callTestCase(findTestCase('Test Cases/Asuransi/Service Asuransi New Form'), [('insuranceType') : insuranceType, ('paymentType') : paymentType, ('insuranceNumber') : insuranceNumber], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I inputting (.*) for (.*) payment insurance bill and (.*) with (.*) , then choose account (.*)")
	def I_inputting_amount_for_what_payment_insurance_bill(String amountInsurance, String whatPayment, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Test Cases/Asuransi/Service Asuransi Nominal'), [('amountInsurance') : amountInsurance, ('whatPayment') : whatPayment, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I confirm insurance bill transaction with (.*)")
	def I_confirm_insurance_bill_transaction_with_detail(String detail){
		Mobile.callTestCase(findTestCase('Test Cases/Asuransi/Service Asuransi Confirm'), [('detail') : detail], FailureHandling.STOP_ON_FAILURE)
	}
}