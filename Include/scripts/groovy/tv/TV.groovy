
package tv
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



class TV {
	@And("I want pay tv with (.*) for (.*)")
	def I_want_pay_tv(String condition, String username){
		Mobile.callTestCase(findTestCase('TV/Go To TV From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I saw my tv payment history")
	def I_saw_my_tv_payment_history(){
		Mobile.callTestCase(findTestCase('TV/Service TV Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to add payment of tv")
	def I_want_to_add_payment_of_tv(){
		Mobile.callTestCase(findTestCase('TV/Go To TV New From TV Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I write tv code in condition with (.*) and (.*)")
	def I_write_tv_code_in_condition_with_tvType_and_tvNumber(String tvType, String tvNumber){
		Mobile.callTestCase(findTestCase('TV/Service TV New Form'), [('tvType') : tvType, ('tvNumber') : tvNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I saw amount of tv payment and (.*) with (.*) , then choose account (.*)")
	def I_saw_amount_of_tv_payment(String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('TV/Service TV Nominal'), [('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I confirm of tv payment")
	def I_confirm_of_tv_payment(){
		Mobile.callTestCase(findTestCase('TV/Service TV Confirm'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I try pay tv from my list")
	def I_try_pay_tv_from_my_list(){
		Mobile.callTestCase(findTestCase('TV/Service TV From List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I try pay tv from my history")
	def I_try_pay_tv_from_my_history(){
		Mobile.callTestCase(findTestCase('TV/Service TV From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Abnormal Saldo - I saw amount of tv payment with (.*)")
	def Abnormal_saldo_i_saw_amount_of_tv_payment(String username){
		Mobile.callTestCase(findTestCase('TV/Service TV Nominal - Abnormal Saldo'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}