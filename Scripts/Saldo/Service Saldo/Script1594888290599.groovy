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

Mobile.verifyElementExist(findTestObject('Saldo/XCUIElementTypeOther - Info Saldo'), 0)

if ((Mobile.verifyElementNotExist(findTestObject('Saldo/XCUIElementTypeStaticText - -'), 5, FailureHandling.OPTIONAL) == 
true) && (Mobile.verifyElementNotExist(findTestObject('Saldo/XCUIElementTypeStaticText - Gagal Memuat'), 5, FailureHandling.OPTIONAL) == 
true)) {
    Mobile.comment('Done')
}

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + '-') + 
    nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

if (checkValas.toString() == 'Yes') {
    Mobile.tap(findTestObject('Saldo/XCUIElementTypeButton - Currency'), 0)

    switch (valas.toString()) {
        case 'Rp':
            text = 'Rp (Rupiah)'

            Mobile.tap(findTestObject('Saldo/XCUIElementTypeStaticText - Type Valas', [('text') : "$text"]), 0)

            text = 'Rp'

            Mobile.verifyElementExist(findTestObject('Saldo/XCUIElementTypeStaticText - Currency', [('text') : "$text"]), 
                0)

            if ((Mobile.verifyElementNotExist(findTestObject('Saldo/XCUIElementTypeStaticText - -'), 5, FailureHandling.OPTIONAL) == 
            true) && (Mobile.verifyElementNotExist(findTestObject('Saldo/XCUIElementTypeStaticText - Gagal Memuat'), 5, 
                FailureHandling.OPTIONAL) == true)) {
                Mobile.comment('Done')
            }
            
            Mobile.delay(3)

            today = new Date().call(String)

            todaysDate = today.format('MM_dd_yy').toString()

            nowTime = today.format('hh_mm_ss').toString()

            Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + 
                '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

            break
        case 'JPY':
            text = 'JPY'

            Mobile.tap(findTestObject('Saldo/XCUIElementTypeStaticText - Type Valas', [('text') : "$text"]), 0)

            text = 'JPY'

            Mobile.verifyElementExist(findTestObject('Saldo/XCUIElementTypeStaticText - Currency', [('text') : "$text"]), 
                0)

            if ((Mobile.verifyElementNotExist(findTestObject('Saldo/XCUIElementTypeStaticText - -'), 5, FailureHandling.OPTIONAL) == 
            true) && (Mobile.verifyElementNotExist(findTestObject('Saldo/XCUIElementTypeStaticText - Gagal Memuat'), 5, 
                FailureHandling.OPTIONAL) == true)) {
                Mobile.comment('Done')
            }
            
            Mobile.delay(3)

            today = new Date()

            todaysDate = today.format('MM_dd_yy').toString()

            nowTime = today.format('hh_mm_ss').toString()

            Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + 
                '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

            break
        default:
            break
    }
}

