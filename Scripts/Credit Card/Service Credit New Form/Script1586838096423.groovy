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

Mobile.verifyElementExist(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Pilih Bank'), 0)

switch (creditBank.toString()) {
    case 'BRI':
        Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - BRI'), 0)

        break
    case 'Standard Chartered Card':
        Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Standard Chartered Card'), 0)

        break
    case 'ANZ Panin':
        Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - ANZ Panin'), 0)

        break
    case 'HSBC Card':
        Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - HSBC Card'), 0)

        break
    case 'DBS Card':
        Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - DBS Card'), 0)

        break
    default:
        break
}

text = 'Nomor Kartu Kredit'

Mobile.setText(findTestObject('Credit New Form/XCUIElementTypeTextField - Nomor Kartu Kredit', [('text') : "${text}"]), creditNumber.toString(), 
    0)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Lanjutkan'), 0)

