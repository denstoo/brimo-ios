import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.beans.Customizer

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

Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - BrimoIconArrowDownOutline'), 0)

switch (wallet.toString()) {
    case 'Gopay':
        Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - GoPay'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tapAndHoldAtPosition(250, 408, 2)

        Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - Pilih Jenis GoPay'), 0, FailureHandling.STOP_ON_FAILURE)

        switch (type.toString()) {
            case 'Customer':
                Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - Customer'), 0)

                GlobalVariable.typeGopay = 'Customer'

                break
            case 'Driver':
                Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - Driver'), 0)

                GlobalVariable.typeGopay = 'Driver'

                break
            case 'Merchant':
                Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - Merchant'), 0)

                GlobalVariable.typeGopay = 'Merchant'

                break
            default:
                break
        }
        
        break
    case 'LinkAja':
        Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - LinkAja'), 0)

        break
    case 'OVO':
        Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - OVO'), 0)

        break
    case 'ShopeePay':
        Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - ShopeePay'), 0)

        break
    case 'DANA':
        Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeStaticText - DANA'), 0)

        break
    default:
        break
}

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), walletNumber.toString(), 0)

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - Lanjutkan'), 0)

Mobile.verifyElementExist(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), 0)