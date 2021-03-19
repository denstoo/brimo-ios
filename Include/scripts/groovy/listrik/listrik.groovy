package listrik
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



class listrik {
	@And("I want pay electricity with (.*) for (.*)")
	def I_want_pay_electricity(String condition, String username){
		Mobile.callTestCase(findTestCase('Listrik/Go To Listrik From Dashboard'), [('condition') : condition, ('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I saw my payment of electricity history")
	def I_saw_my_payment_of_electricity_history(){
		Mobile.callTestCase(findTestCase('Listrik/Service Listrik Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to add payment bill of electricity")
	def I_want_to_add_payment_bill_of_electricity(){
		Mobile.callTestCase(findTestCase('Listrik/Go To Listrik New From Listrik Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I write payment bill of electricity in condition with (.*) and (.*)")
	def I_write_payment_bill_of_electricity_in_condition_with_listrikType_and_listrikNumber(String listrikType, String listrikNumber){
		Mobile.callTestCase(findTestCase('Listrik/Service Listrik New Form'), [('listrikType') : listrikType, ('listrikNumber') : listrikNumber], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I inputting (.*) for bill of electricity and (.*) with (.*) , then choose account (.*)")
	def I_inputting_amount_for_bill_of_electricity(String amountListrik, String decision, String name, String debit){
		Mobile.callTestCase(findTestCase('Listrik/Service Listrik Nominal'), [('amountListrik') : amountListrik, ('decision') : decision, ('name') : name, ('debit') : debit], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I confirm electricity transaction with (.*)")
	def I_confirm_electricity_transaction_with_detail(String listrikType){
		Mobile.callTestCase(findTestCase('Listrik/Service Listrik Confirm'), [('listrikType') : listrikType], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Validate Listrik Form")
	def validate_listrik_form(){
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/1 - PLN Form/Validate Toolbar Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/1 - PLN Form/Validate TextView Transaksi Terakhir'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/1 - PLN Form/Validate TextView Daftar Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/1 - PLN Form/Validate Button Tambah Daftar Baru'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Listrik New Form")
	def validate_listrik_new_form(){
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate Toolbar Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate TextView Beli atau Bayar Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate DropDown Pilih Produk Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate Button Lanjutkan (No Input)'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		//Postpaid
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Choose One of Produk Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate TextView ID Pelanggan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate Button Bayar (No Input)'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Postpaid Nomor Tujuan 10 Character'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Postpaid Nomor Tujuan 12 Character'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Postpaid Nomor Tujuan 20 Character'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		//Prepaid
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Choose One of Produk Listrik (2)'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate TextView ID Pelanggan atau Nomor Meter'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate Button Beli (No Input)'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Prepaid Nomor Tujuan 10 Character'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Prepaid Nomor Tujuan 12 Character'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/2 - PLN New Form/Validate EditText Prepaid Nomor Tujuan 20 Character'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Listrik Prepaid Inquiry")
	def validate_listrik_prepaid_inquiry(){
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate Toolbar Listrik'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate TextView Nominal'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate TextView Simpan Untuk Selanjutnya'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Click CheckBox Simpan Untuk Selanjutnya'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate EditText Nama'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Choose One of Nominal'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate TextView Total Pembayaran'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Prepaid/Validate Button Beli'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Listrik Postpaid Inquiry")
	def validate_listrik_postpaid_inquiry(){
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate Toolbar Tagihan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Total Bayar'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Jumlah Tagihan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Admin Bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView IDPEL'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Nama'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Total Lembar Tagihan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView BL atau TH'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate TextView Simpan Untuk Selanjutnya'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Click CheckBox Simpan Untuk Selanjutnya'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate EditText Nama'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/3 - PLN Inquiry/Postpaid/Validate Button Bayar'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Listrik Prepaid Cofirm")
	def validate_listrik_prepaid_confirm(){
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate Toolbar Konfirmasi'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Detail'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Nominal'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Admin Bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Total'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate Button Beli'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Then("Validate Listrik Postpaid Cofirm")
	def validate_listrik_postpaid_confirm(){
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate Toolbar Konfirmasi'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Nomor Tujuan'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Sumber Dana'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Detail'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Nominal'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Admin Bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate TextView Total'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Test Cases/Listrik/Validate/4 - PLN Confirm/Validate Button Bayar'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
}