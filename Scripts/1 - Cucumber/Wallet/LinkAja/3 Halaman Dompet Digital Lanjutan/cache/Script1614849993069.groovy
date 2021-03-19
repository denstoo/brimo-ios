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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('IOS/Feature/Dompet Digital/2 Halaman Top Up Baru/TC_BRImo_app_LinkAja_ios_dompet_digital_211'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IOS/Dompet Digital/3 Halaman Lanjutkan/cache/CheckBox off SImpan untuk selanjutnya'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/3 Halaman Lanjutkan/cache/CheckBox on SImpan untuk selanjutnya'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/3 Halaman Lanjutkan/cache/CheckBox off SImpan untuk selanjutnya'), 0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeTextField - Nama'), 
    'DeDeN tAuFaN', 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeStaticText - Nomor Tujuan'), 
    0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeTextField - 0'), 
    '25000', 0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeTextField - 25.000'), 
    '5000', 0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeTextField'), 
    '0000000', 0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeKey - 9'), 
    '999999999999', 0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeTextField - 999.999.999.999'), 
    '35000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeStaticText - Nomor Tujuan'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeImage - BrimoIconArrowDownOutline'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeStaticText - 0206 0100 2751 302'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/3 Halaman Lanjutkan/cache/XCUIElementTypeButton - Top Up'), 
    0)

Mobile.closeApplication()

