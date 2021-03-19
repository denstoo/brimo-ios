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
import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_user_account SET tbl_user_account.default = "0" WHERE username = "' + 
    username.toString()) + '"')

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_user_account SET tbl_user_account.default = "1" WHERE username = "' + 
    username.toString()) + '" and account = "020601000064301"')

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_user_account SET finansial_status = "0" WHERE username = "' + 
    username.toString()) + '" and account = "008301031142500"')

WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

def whatPayment = null

if (Mobile.verifyElementExist(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Total Pembayaran'), 5, FailureHandling.OPTIONAL) == 
true) {
    whatPayment = 'Open'
} else if (Mobile.verifyElementExist(findTestObject('Credit Nominal Close/XCUIElementTypeOther - Kartu Kredit'), 5, FailureHandling.OPTIONAL) == 
true) {
    whatPayment = 'Close'
} else {
}

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

switch (whatPayment.toString()) {
    case 'Open':
        Mobile.verifyElementExist(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Total Pembayaran'), 0)

        switch (totalInput.toString()) {
            case 'Penuh':
                Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeButton - Bayar Penuh'), 0)

                break
            case 'Minimal':
                Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeButton - Bayar Minimal'), 0)

                break
            case 'Manual':
                Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeButton - Input Nominal'), 0)

                text = '0'

                Mobile.setText(findTestObject('Credit Nominal Open/XCUIElementTypeTextField - Nominal', [('text') : "$text"]), 
                    amountCredit.toString(), 0)

                Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Nominal Pembayaran'), 0)

                break
            default:
                break
        }
        
        while (Mobile.verifyElementExist(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Sumber Dana'), 
            5) == false) {
            Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
        }

		Mobile.delay(3)
        
        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

        nowTime = today.format('hh_mm_ss').toString()

        Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + 
            '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

        String enable = Mobile.getAttribute(findTestObject('Credit Nominal Open/XCUIElementTypeButton - Bayar'), 'enabled', 0)

        Mobile.verifyMatch(enable, 'false', false)

        break
    case 'Close':
        Mobile.verifyElementExist(findTestObject('Credit Nominal Close/XCUIElementTypeOther - Kartu Kredit'), 0)

        text = '0'

        Mobile.setText(findTestObject('Credit Nominal Close/XCUIElementTypeTextField - Nominal', [('text') : "$text"]), 
            amountCredit.toString(), 0)

        Mobile.tap(findTestObject('Credit Nominal Close/XCUIElementTypeStaticText - Nominal Pembayaran'), 0)

		Mobile.delay(3)

        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

        nowTime = today.format('hh_mm_ss').toString()

        Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + 
            '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

        String enable = Mobile.getAttribute(findTestObject('Credit Nominal Close/XCUIElementTypeButton - Bayar'), 'enabled', 0)
		
		Mobile.verifyMatch(enable, 'false', false)

        break
    default:
        break
}

