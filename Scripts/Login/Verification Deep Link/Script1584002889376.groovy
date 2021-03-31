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
import java.util.*
import java.sql.*
import java.sql.ResultSet as ResultSet
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.ios.IOSDriver as IOSDriver
import io.appium.java_client.remote.HideKeyboardStrategy as HideKeyboardStrategy
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(GlobalVariable.timeoutMiddle, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Link Activation/XCUIElementTypeStaticText - Cek Inbox'), 0)

Mobile.delay(3)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

ResultSet response = CustomKeywords.'database.methods.executeQuery'(('SELECT * FROM tbl_brimo_activation WHERE username = "' + 
    username.toString()) + '"')

response.next()

String sms_link = response.getString('sms_link')

//not_run: Mobile.startExistingApplication('com.apple.mobilenotes', FailureHandling.STOP_ON_FAILURE)
//
//not_run: if (Mobile.verifyElementExist(findTestObject('Notes/XCUIElementTypeStaticText - Notes'), GlobalVariable.timeoutShort, 
//    FailureHandling.OPTIONAL)) {
//    Mobile.tap(findTestObject('Notes/XCUIElementTypeButton - New note'), 0)
//} else if (Mobile.verifyElementExist(findTestObject('Notes/XCUIElementTypeButton - Back Notes'), GlobalVariable.timeoutShort, 
//    FailureHandling.OPTIONAL)) {
//    Mobile.tap(findTestObject('Notes/XCUIElementTypeButton - Back Notes'), 0)
//
//    Mobile.verifyElementExist(findTestObject('Notes/XCUIElementTypeStaticText - Notes'), 0)
//
//    Mobile.tap(findTestObject('Notes/XCUIElementTypeButton - New note'), 0)
//} else {
//    Mobile.comment('Do nothing')
//}
//not_run: Mobile.verifyElementExist(findTestObject('Notes/XCUIElementTypeButton - Done'), 0)
//
//not_run: Mobile.setText(findTestObject('Notes/XCUIElementTypeTextView - note'), sms_link, 0)
//
//not_run: Mobile.tap(findTestObject('Notes/XCUIElementTypeButton - Done'), 0)
Mobile.startExistingApplication('com.apple.mobilesafari', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Link Activation/XCUIElementTypeButton - URL'), 0)

Mobile.setText(findTestObject('Link Activation/XCUIElementTypeTextField - URL'), sms_link, 0)

//Mobile.sendKeys(findTestObject('Link Activation/XCUIElementTypeTextField - URL'), Keys.chord(sms_link, Keys.RETURN), FailureHandling.CONTINUE_ON_FAILURE)
IOSDriver<WebElement> driver = MobileDriverFactory.getDriver()

driver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, 'Go')

Mobile.verifyElementExist(findTestObject('Link Activation/XCUIElementTypeTextView - Open this page in BRImo'), 0)

Mobile.delay(3)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Link Activation/XCUIElementTypeButton - Open'), 0)

//not_run: Mobile.tap(findTestObject('Notes/XCUIElementTypeLink - Login Link'), 0)
WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

