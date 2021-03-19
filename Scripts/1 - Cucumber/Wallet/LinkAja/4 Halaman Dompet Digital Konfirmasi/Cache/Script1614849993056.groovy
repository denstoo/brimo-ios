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

WebUI.callTestCase(findTestCase('IOS/Feature/Dompet Digital/3 Halaman Dompet Digital Lanjutan/TC_BRImo_app_LinkAja_ios_dompet_digital_305'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/4 Halaman Konfirmasi/XCUIElementTypeButton - Top Up'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/4 Halaman Konfirmasi/XCUIElementTypeButton - BrimoBackButton'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/4 Halaman Konfirmasi/XCUIElementTypeButton - Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/4 Halaman Konfirmasi/XCUIElementTypeButton - Ya'), 0)

Mobile.closeApplication()

