package brizzi
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



class Brizzi {
	@And('I want top up brizzi with (.*) for (.*)')
	def I_want_top_up_brizzi_with_username(String condition, String username){
		Mobile.callTestCase(findTestCase('Brizzi/Go To Brizzi From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I write brizzi (.*) and choose (.*)')
	def I_write_brizzi_number_and_choose_amount(String brizziNumber, String amountBrizzi){
		Mobile.callTestCase(findTestCase('Brizzi/Service Brizzi Form'), [('brizziNumber') : brizziNumber, ('amountBrizzi') : amountBrizzi], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I choose account (.*) for top up brizzi')
	def I_choose_account_debit_for_top_up_brizzi(String debit){
		Mobile.callTestCase(findTestCase('Brizzi/Service Brizzi Rekening'), [('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm my top up brizzi')
	def I_confirm_my_top_up_brizzi(){
		Mobile.callTestCase(findTestCase('Brizzi/Service Brizzi Confirm'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Abnormal Saldo - I choose account debit for top up brizzi with (.*)')
	def Abnormal_saldo_i_choose_account_debit_for_top_up_brizzi_with_username(String username){
		Mobile.callTestCase(findTestCase('Brizzi/Service Brizzi Rekening - Abnormal Saldo'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try top up brizzi with (.*) from history')
	def I_try_top_up_brizzi_with_amount_from_history(String amountBrizzi){
		Mobile.callTestCase(findTestCase('Brizzi/Service Brizzi From History'), [('amountBrizzi') : amountBrizzi], FailureHandling.STOP_ON_FAILURE)
	}
}