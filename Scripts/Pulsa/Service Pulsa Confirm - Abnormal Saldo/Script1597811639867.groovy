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

Mobile.verifyElementExist(findTestObject('Pulsa Confirm/XCUIElementTypeStaticText - Sumber Dana'), 0)

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_user_account SET tbl_user_account.default = "0" WHERE username = "' + 
    username.toString()) + '"')

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_user_account SET tbl_user_account.default = "1" WHERE username = "' + 
    username.toString()) + '" and account = "020601000064301"')

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_user_account SET finansial_status = "0" WHERE username = "' + 
    username.toString()) + '" and account = "008301031142500"')

WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

while (Mobile.verifyElementExist(findTestObject('Transfer Confirm/XCUIElementTypeStaticText - Total'), 5) == false) {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
}

Mobile.verifyElementExist(findTestObject('Transfer Confirm/XCUIElementTypeStaticText - Total'), 0)

switch (pulsa.toString()) {
    case 'Simpati':
        text = 'Rp3.000'

        break
    case 'AS':
        text = 'Rp1.500'

        break
    case 'XL':
        text = 'Rp1.500'

        break
    case 'IM3':
        text = 'Rp1.500'

        break
    case 'Mentari':
        text = 'Rp1.500'

        break
    case 'Axis':
        text = 'Rp1.500'

        break
    case 'Three':
        text = 'Rp0'

        break
    case 'Smartfren':
        text = 'Rp0'

        break
    default:
        break
}

tax = Mobile.getText(findTestObject('Pulsa Confirm/XCUIElementTypeStaticText - Biaya Admin'), 0)

Mobile.verifyMatch(tax, text, false)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + '-') + 
    nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

String enable = Mobile.getAttribute(findTestObject('Pulsa Confirm/XCUIElementTypeButton - Beli'), 'enabled', 0)

Mobile.verifyMatch(enable, 'false', false)

