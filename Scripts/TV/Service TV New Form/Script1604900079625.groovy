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

Mobile.verifyElementExist(findTestObject('TV New Form/XCUIElementTypeStaticText - Bayar TV'), 0)

Mobile.tap(findTestObject('TV New Form/XCUIElementTypeButton - Pilih Jenis TV'), 0)

Mobile.delay(3)

switch (tvType.toString()) {
    case 'Indosat':
        Mobile.tap(findTestObject('TV New Form/XCUIElementTypeStaticText - Indosat GIG'), 0)

        break
    case 'MyRepublic':
        Mobile.tap(findTestObject('TV New Form/XCUIElementTypeStaticText - MyRepublic Retail'), 0)

        break
    case 'Transvision':
        Mobile.tap(findTestObject('TV New Form/XCUIElementTypeStaticText - Transvision'), 0)

        break
    default:
        break
}

Mobile.setText(findTestObject('TV New Form/XCUIElementTypeTextField - Nomor Pelanggan'), tvNumber.toString(), 0)

Mobile.tap(findTestObject('TV New Form/XCUIElementTypeStaticText - Bayar TV'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + '-') + 
    nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TV New Form/XCUIElementTypeButton - Lanjutkan'), 0)

