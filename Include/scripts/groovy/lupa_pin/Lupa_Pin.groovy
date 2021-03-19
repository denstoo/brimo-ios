package lupa_pin
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



class Lupa_Pin {
	@And("I forgot my pin")
	def I_forgot_my_pin(){
		Mobile.callTestCase(findTestCase('Lupa Pin/Go To Lupa Pin From Pin Validate'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input (.*) user info from feature inside")
	def I_input_password_user_info_from_feature_inside(String password){
		Mobile.callTestCase(findTestCase('Lupa Pin/Service Input Info User Info Inside For Lupa Pin'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input (.*) and (.*) user info from feature outside")
	def I_input_username_and_password_user_info_from_feature_outside(String username, String password){
		Mobile.callTestCase(findTestCase('Lupa Pin/Service Input Info User Info In Outside Lupa Pin'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input otp for verification forgot pin on (.*)")
	def I_input_otp_for_verification_forgot_pin(String username){
		Mobile.callTestCase(findTestCase('Lupa Pin/Service Input Verifkasi OTP For Lupa Pin'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I create new pin with (\\d+) for forgot pin")
	def I_create_new_pin_with_pin_for_forgot_pin(int pin){
		Mobile.callTestCase(findTestCase('Lupa Pin/Service Input Create Pin From Lupa Pin'), [('pin') : pin], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I confirm pin with (\\d+) for forgot pin")
	def I_confirm_pin_with_pin_for_forgot_pin(int pin){
		Mobile.callTestCase(findTestCase('Lupa Pin/Service Input Confirm Pin From Lupa Pin'), [('pin') : pin], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I want reset pin cause forgot current pin")
	def I_want_reset_pin(){
		Mobile.callTestCase(findTestCase('Test Cases/Lupa Pin/Go To Lupa Pin From Pin Confirm Before Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I validate born date for reset pin")
	def I_validate_born_date_for_reset_pin(){
		Mobile.callTestCase(findTestCase('Test Cases/Lupa Pin/Service Input Born Date From Reset Pin'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input otp for verification reset pin on (.*)")
	def I_input_otp_for_verification_reset_pin(String username){
		Mobile.callTestCase(findTestCase('Test Cases/Lupa Pin/Service Input Verifkasi OTP For Reset Pin'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}