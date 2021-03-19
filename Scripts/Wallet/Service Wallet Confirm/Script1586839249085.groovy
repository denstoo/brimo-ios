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

//Mobile.verifyElementExist(findTestObject('Wallet Confirm/XCUIElementTypeOther - Konfirmasi'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//not_run: Mobile.setText(findTestObject('Wallet Confirm/XCUIElementTypeTextField - Kode Promo'), detail.toString(), 0)

//Mobile.tap(findTestObject('Wallet Confirm/XCUIElementTypeStaticText - Nomor Tujuan'), 0)

tax = 'Rp0'

switch (wallet.toString()) {
    case 'Gopay':
        if (GlobalVariable.typeGopay == 'Customer') {
            tax = 'Rp1.000'
        } else if (GlobalVariable.typeGopay == 'Driver') {
            tax = 'Rp0'
        } else {
            tax = 'Rp0'
        }
        
        break
    case 'OVO':
        tax = 'Rp1.000'

        break
    case 'ShopeePay':
        tax = 'Rp0'

        break
    case 'DANA':
        tax = 'Rp0'

        break
    case 'LinkAja':
        tax = 'Rp0'

        break
    default:
        break
}

text = Mobile.getText(findTestObject('Wallet Confirm/XCUIElementTypeStaticText - Admin Wallet'), 0)

Mobile.verifyMatch(text, tax, false)

//Mobile.delay(3)
Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_Dana_iOS_Konfirmasi_402	Menekan icon back
//TC_BRImo_app_Dana_iOS_Konfirmasi_403	Melakukan konfirmasi saat tidak ada internet
//TC_BRImo_app_Dana_iOS_Konfirmasi_401	Menekan button top up
Mobile.tap(findTestObject('Wallet Confirm/XCUIElementTypeButton - Top Up'), 0)

