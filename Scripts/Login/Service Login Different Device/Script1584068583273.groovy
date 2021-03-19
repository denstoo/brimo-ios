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

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_brimo_activation SET status = "1", device_id = "movedevices" WHERE username = "' + 
    username.toString()) + '"')

Mobile.setText(findTestObject('Login Form/XCUIElementTypeTextField - Username'), username.toString(), 0)

Mobile.tap(findTestObject('Login Form/XCUIElementTypeImage - BrimoLoginIlustration'), 0)

Mobile.setText(findTestObject('Login Form/XCUIElementTypeSecureTextField - Password'), password.toString(), 0)

Mobile.tap(findTestObject('Login Form/XCUIElementTypeImage - BrimoLoginIlustration'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + '-') + 
    nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Form/XCUIElementTypeButton - Login'), 0)

Mobile.verifyElementExist(findTestObject('Move Device/XCUIElementTypeAlert - Pindah Device'), 0)

Mobile.delay(3)

today = new Date()

todaysDate = today.format('MM_dd_yy').toString()

nowTime = today.format('hh_mm_ss').toString()

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Move Device/XCUIElementTypeButton - Ya'), 0)

WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

