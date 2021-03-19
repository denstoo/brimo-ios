package kode_qr
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



class Kode_QR {
	@And("I want generate my own QR code")
	def I_want_generate_my_own_qr_code(){
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Go To Kode QR From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I choose account (.*) for money reception on my own QR code")
	def I_choose_account_debit_for_money_reception_on_my_own_qr_code(String debit){
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Service Kode QR Form'), [('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I see my own QR code and then (.*)")
	def I_see_my_own_QR_code_and_then_decision(String decision){
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Service Kode QR Receipt'), [('decision') : decision], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Validate Kode QR Form")
	def validate_kode_qr_form(){
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate Toolbar Kode QR'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate TextView Keterangan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate TextView 1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate TextView 2'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate TextView 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/1 - Kode QR Form/Validate Button Lanjutkan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	@Then("Validate Kode QR Receipt")
	def validate_kode_qr_receipt(){
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/2 - Kode QR Receipt/Validate Toolbar Kode QR'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/2 - Kode QR Receipt/Validate TextView Tunjukkan QR'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/2 - Kode QR Receipt/Validate TextView Minta Kode Baru'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/2 - Kode QR Receipt/Validate TextView Kode berlaku selama'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Kode QR/Validate/2 - Kode QR Receipt/Validate Button OK'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
}