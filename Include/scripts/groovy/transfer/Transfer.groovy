package transfer
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



class Transfer {
	@And('I want to transfer money with (.*) for (.*)')
	def I_want_to_transfer_money(String condition, String username){
		Mobile.callTestCase(findTestCase('Transfer/Go To Transfer From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I saw my money transfer history')
	def I_saw_my_money_transfer_history(){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I want to add recipient of money transfer')
	def I_want_to_add_recipient_of_money_transfer(){
		Mobile.callTestCase(findTestCase('Transfer/Go To Transfer New From Transfer Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try adding recipient of money transfer in condition with (.*) and (.*)')
	def I_try_adding_recipient_of_money_transfer_in_condition_with_destinationBank_and_destinationAccount(String destinationBank, String destinationAccount){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer New Form'), [('destinationBank') : destinationBank, ('destinationAccount') : destinationAccount], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I inputting (.*) for the transfer amount and (.*) with (.*) , then choose account (.*)')
	def I_inputting_amount_for_the_transfer_amount(String amountTransfer, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer Nominal'), [('amountTransfer') : amountTransfer, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I confirm transfer bill with (.*) and (.*)')
	def I_confirm_transfer_bill_with_detail(String detail, String destinationBank){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer Confirm'), [('detail') : detail, ('destinationBank') : destinationBank], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try transfer from my list')
	def I_try_transfer_from_my_list(){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer From List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I try transfer from my history')
	def I_try_transfer_from_my_history(){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer From History'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Abnormal Saldo - I inputting (.*) for the transfer amount with (.*)')
	def Abnormal_saldo_i_inputting_amount_for_the_transfer_amount(String amountTransfer, String username){
		Mobile.callTestCase(findTestCase('Transfer/Service Transfer Nominal - Abnormal Saldo'), [('amountTransfer') : amountTransfer, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@And('I want to transfer money from fast menu with (.*) for (.*)')
	def I_want_to_transfer_money_from_fast_menu(String condition, String username){
		Mobile.callTestCase(findTestCase('Transfer/Go To Transfer From Fast Menu'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Validate Transfer Form")
	def validate_transfer_form(){
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/1 - Transfer Form/Validate Toolbar Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/1 - Transfer Form/Validate TextView Transfer Terakhir'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/1 - Transfer Form/Validate TextView Daftar Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/1 - Transfer Form/Validate Button Tambah Penerima'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Transfer New Form")
	def validate_transfer_new_form(){
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/2 - Transfer New Form/Validate Toolbar Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/2 - Transfer New Form/Validate TextView Bank Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/2 - Transfer New Form/Validate TextView Nomor Tujuan atau Nama Alias'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/2 - Transfer New Form/Validate EditText Pilih Bank Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/2 - Transfer New Form/Validate EditText Masukkan No Rek'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/2 - Transfer New Form/Validate Button Lanjutkan (No Input)'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Transfer Inquiry")
	def validate_transfer_inquiry(){
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/3 - Transfer Inquiry/Validate Toolbar Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/3 - Transfer Inquiry/Validate TextView Nominal'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/3 - Transfer Inquiry/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/3 - Transfer Inquiry/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/3 - Transfer Inquiry/Validate EditText Nominal'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/3 - Transfer Inquiry/Validate Button Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Transfer Confirm")
	def validate_transfer_confirm(){
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate Toolbar Konfirmasi'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Keterangan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Detail'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Nominal Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Admin Bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate TextView Total'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate EditText Keterangan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Transfer/Validate/4 - Transfer Confirm/Validate Button Transfer'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
}