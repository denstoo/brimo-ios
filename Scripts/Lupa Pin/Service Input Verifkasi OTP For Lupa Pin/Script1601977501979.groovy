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

Mobile.delay(30)

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Lupa Pin/XCUIElementTypeOther - Lupa PIN'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + '-') +
	nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

ResultSet response = CustomKeywords.'database.methods.executeQuery'(('SELECT * FROM tbl_brimo_activation WHERE username = "' +
	username.toString()) + '"')

response.next()

String otp = response.getString('sms_link')

CustomKeywords.'operation.features.clickNumber'(otp.toString())


WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

