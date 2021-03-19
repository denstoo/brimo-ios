package wallet
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



class Wallet {
	@Given ("Costum")
	def Costum() {
		Mobile.startExistingApplication('id.co.bri.brimo')
		Mobile.tap(findTestObject('Fast Menu/XCUIElementTypeButton - Login'), 0)
		Mobile.setText(findTestObject('Login Form/XCUIElementTypeTextField - Username'), "brimosv004", 0)
		Mobile.tap(findTestObject('Login Form/XCUIElementTypeImage - BrimoLoginIlustration'), 0)
		Mobile.setText(findTestObject('Login Form/XCUIElementTypeSecureTextField - Password'), "Jakarta123", 0)
		Mobile.tap(findTestObject('Login Form/XCUIElementTypeImage - BrimoLoginIlustration'), 0)
		Mobile.tap(findTestObject('Login Form/XCUIElementTypeButton - Login'), 0)
		Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
		Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeButton - Top Up Baru'), 0)
		Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - BrimoIconArrowDownOutline'), 0)
//		Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - LinkAja'), 0)
		Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - OVO'), 0)
//		Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), '085691335269', 0)
		Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), '081218022786', 0)
		Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)
		Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - Lanjutkan'), 0)
	}
	
	@And('I want to top up my wallet in account (.*)')
	def I_want_to_top_up_my_wallet_in_account(String username){
		Mobile.callTestCase(findTestCase('Wallet/Go To Wallet From Dashboard'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw my top up wallet history')
	def I_saw_my_top_up_wallet_history(){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I can search my wallet list')
	def I_can_search_my_wallet_list(){
		Mobile.callTestCase(findTestCase('Wallet/Validate/1 - Wallet Form/Validate Field Cari Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I want to add recipient of wallet')
	def I_want_to_add_recipient_of_wallet(){
		Mobile.callTestCase(findTestCase('Wallet/Go To Wallet New From Wallet Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try adding recipient of wallet in condition with (.*), (.*) and (.*)')
	def I_try_adding_recipient_of_wallet_in_condition_with_wallet_type_and_walletNumber(String wallet, String type, String walletNumber){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet New Form'), [('wallet') : wallet, ('type') : type, ('walletNumber') : walletNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I inputting (.*) for the wallet amount and (.*) with (.*) , then choose account (.*)')
	def I_inputting_amount_for_the_transfer_amount(String amountWallet, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet Nominal'), [('amountWallet') : amountWallet, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm top up wallet with (.*) and (.*)')
	def I_confirm_top_up_wallet_with_detail(String detail, String wallet){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet Confirm'), [('detail') : detail, ('wallet') : wallet], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I top up wallet from my list')
	def I_top_up_wallet_from_my_list(){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet From List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I top up wallet from my history')
	def I_top_up_wallet_from_my_history(){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Abnormal Saldo - I inputting (.*) for the wallet amount with (.*)')
	def Abnormal_saldo_i_inputting_amount_for_the_transfer_amount(String amountWallet, String username){
		Mobile.callTestCase(findTestCase('Wallet/Service Wallet Nominal - Abnormal Saldo'), [('amountWallet') : amountWallet, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}
}