package tarik_tunai
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



class Tarik_Tunai {
	@And("I want to cash withdrawal without card")
	def I_want_to_cash_withdrawal_without_card(){
		Mobile.callTestCase(findTestCase('Tarik Tunai/Go To Tarik Tunai From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I choose (.*) for withdrawal, then choose account (.*)")
	def I_choose_nominal_for_withdrawal_then_choose_account(String amountWithdraw, String debit){
		Mobile.callTestCase(findTestCase('Tarik Tunai/Service Tarik Tunai Form'), [('amountWithdraw') : amountWithdraw, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I confirm of cash withdrawal")
	def I_confirm_of_installment_payment(){
		Mobile.callTestCase(findTestCase('Tarik Tunai/Service Tarik Tunai Confirm'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Withdrawal success")
	def Withdrawal_succes(){
		Mobile.callTestCase(findTestCase('Tarik Tunai/Service Tarik Tunai Receipt'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}