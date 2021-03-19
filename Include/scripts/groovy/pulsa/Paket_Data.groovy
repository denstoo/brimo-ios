package pulsa
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



class Paket_Data {
	@When("I choose data package and write my (.*) phone and (.*)")
	def I_write_my_number_phone_and_amount_for_data_package(String numberPhone, String amountPaketData){
		Mobile.callTestCase(findTestCase('Paket Data/Service Paket Data Form'), [('numberPhone') : numberPhone, ('amountPaketData') : amountPaketData], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I choose account (.*) for data package')
	def I_choose_account_debit_for_data_package(String debit){
		Mobile.callTestCase(findTestCase('Paket Data/Service Paket Data Rekening'), [('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I confirm data package bill cause (.*)")
	def I_confirm_data_package_bill_cause_provider(String provider){
		Mobile.callTestCase(findTestCase('Paket Data/Service Paket Data Confirm'), [('provider') : provider], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I buy data package from my history with (.*)')
	def I_buy_data_package_from_my_history_with_amount(String amountPaketData){
		Mobile.callTestCase(findTestCase('Paket Data/Service Paket Data From History'), [('amountPaketData') : amountPaketData], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Abnormal Saldo - I choose account debit for data package with (.*)")
	def Abnormal_saldo_i_choose_account_debit_for_data_package_with_username(String username){
		Mobile.callTestCase(findTestCase('Paket Data/Service Paket Data Rekening - Abnormal Saldo'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}