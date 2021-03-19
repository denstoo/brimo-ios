package mutasi
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



class Mutasi {
	@And("I want to check my history transaction")
	def I_want_to_check_my_history_transaction(){
		Mobile.callTestCase(findTestCase('Mutasi/Go To Mutasi From Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I saw my history transaction default")
	def I_saw_my_history_transaction_default(){
		Mobile.callTestCase(findTestCase('Mutasi/Service Mutasi Default'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I saw my selection history transaction on (.*) with (.*) and (.*) until (.*)")
	def I_saw_my_selection_history_transaction_on_month_with_range_and_start_until_end(String month, String range, String start, String end){
		Mobile.callTestCase(findTestCase('Mutasi/Service Mutasi Select Date'), [('month') : month, ('range') : range, ('start') : start, ('end') : end], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I use fast menu to see my history transaction")
	def I_use_fast_menu_to_see_my_history_transaction(){
		Mobile.callTestCase(findTestCase('Mutasi/Service Mutasi Fast Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}