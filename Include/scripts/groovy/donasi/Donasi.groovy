package donasi
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



class Donasi {
	@And('I want to donate')
	def I_want_to_donate(){
		Mobile.callTestCase(findTestCase('Donasi/Go To Donasi From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I choose (.*) donation for (.*) with (.*) and (.*)')
	def I_choose_donation_for_purpose_with_amount_and_total(String produk, String jenis, String nominal, String jumlah){
		Mobile.callTestCase(findTestCase('Donasi/Service Donasi Form'), [('produk') : produk, ('jenis') : jenis, ('nominal') : nominal, ('jumlah') : jumlah], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I choose account (.*) for donation')
	def I_choose_account_debit_for_donation(String debit){
		Mobile.callTestCase(findTestCase('Donasi/Service Donasi Rekening'), [('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm my donation')
	def I_confirm_donation(){
		Mobile.callTestCase(findTestCase('Donasi/Service Donasi Confirm'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Abnormal Saldo - I choose account debit for donation with (.*)')
	def Abnormal_saldo_i_choose_account_debit_for_donation_with_username(String username){
		Mobile.callTestCase(findTestCase('Donasi/Service Donasi Rekening - Abnormal Saldo'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}