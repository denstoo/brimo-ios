import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//TC_BRImo_app_LinkAja_ios_dompet_digital_116 User dapat melakukan Top Up baru
Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeButton - Top Up Baru'), 0)

Mobile.verifyElementVisible(findTestObject('Wallet New Form/XCUIElementTypeButton - Pilih Dompet Digital'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

WebUI.callTestCase(findTestCase('Wallet/Validate/2 - Wallet New Form/Validate Button Lanjutkan (No Input)'), [:], FailureHandling.STOP_ON_FAILURE)
