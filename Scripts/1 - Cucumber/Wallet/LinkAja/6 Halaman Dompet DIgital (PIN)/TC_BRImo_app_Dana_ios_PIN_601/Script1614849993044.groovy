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

WebUI.callTestCase(findTestCase('IOS/Feature/Dompet Digital/4 Halaman Dompet Digital Konfirmasi/TC_BRImo_app_Dana_ios_Konfirmasi_401'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 1'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 2'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 3'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 4'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 6'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 7'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 8'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 9'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/PIN/Button 0'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconDelKeyboard'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - Lupa PIN'), 0)

Mobile.setText(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeSecureTextField - Password'), 'Jakarta123', 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconPasswordHintOff'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - BrimoIconPasswordHintOff (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Dompet Digital/PIN/XCUIElementTypeButton - OK'), 0)

