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

import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
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

import common.screenshot



class Common {
	@Given("I start application for first time")
	def I_start_application_for_first_time(){
		Mobile.callTestCase(findTestCase('General/Start Application - On Boarding'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I already have an account")
	def I_already_have_an_account(){
		Mobile.callTestCase(findTestCase('Login/Go To Login From On Boarding'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("I start application")
	def I_start_application(){
		Mobile.callTestCase(findTestCase('General/Start Application - Fast Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("I want login")
	def I_want_login(){
		Mobile.callTestCase(findTestCase('Login/Go To Login From Fast Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I verification deep link from account (.*)")
	def I_verification_deep_link_from_account_username(String username){
		Mobile.callTestCase(findTestCase('Login/Verification Deep Link'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I confirm pin with (\\d+)")
	def I_confirm_pin_with_pin(int pin){
		Mobile.callTestCase(findTestCase('Pin/Pin Confirm'), [('pin') : pin], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I successfully go to dashboard")
	def I_successfully_go_to_dashboard(){
		Mobile.callTestCase(findTestCase('Login/Go To Dashboard From Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I validate my pin with (.*) before transaction")
	def I_validate_my_pin_with_pin_before_transaction(String pin){
		Mobile.callTestCase(findTestCase('Pin/Pin Validate Before Transaction'), [('pin') : pin], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Transaction still on progress")
	def Transaction_still_on_progress(){
		Mobile.callTestCase(findTestCase('General/Service Status Pending'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Transaction success")
	def Transaction_succes(){
		Mobile.callTestCase(findTestCase('General/Service Status Receipt'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I want use account feature")
	def I_want_use_account_feature(){
		Mobile.callTestCase(findTestCase('Akun/Go To Akun From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I check fast menu")
	def I_check_fast_menu(){
		Mobile.callTestCase(findTestCase('General/Service Check Fast Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And ("I close application")
	def I_close_application() {
		Mobile.callTestCase(findTestCase('General/Close Application'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}