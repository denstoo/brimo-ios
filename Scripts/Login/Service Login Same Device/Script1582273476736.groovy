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

GlobalVariable.username = username.toString()

GlobalVariable.password = password.toString()

Mobile.setText(findTestObject('Login Form/XCUIElementTypeTextField - Username'), username.toString(), 0)

Mobile.tap(findTestObject('Login Form/XCUIElementTypeImage - BrimoLoginIlustration'), 0)

Mobile.setText(findTestObject('Login Form/XCUIElementTypeSecureTextField - Password'), password.toString(), 0)

Mobile.tap(findTestObject('Login Form/XCUIElementTypeImage - BrimoLoginIlustration'), 0)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Login Form/XCUIElementTypeButton - Login'), 0)

