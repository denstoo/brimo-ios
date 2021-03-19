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

'Verify Credit Card Form Page'
Mobile.verifyElementExist(findTestObject('Credit Form/XCUIElementTypeOther - Kartu Kredit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_form0.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit Form/XCUIElementTypeButton - Pembayaran Baru'), 0)

'Verify Credit New Form Page'
Mobile.verifyElementExist(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Lanjutkan'), 0)

'Verify Button Lanjutkan Disable'
Mobile.verifyElementExist(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new_2.png', FailureHandling.STOP_ON_FAILURE)

text = 'Nomor Kartu Kredit'

Mobile.setText(findTestObject('Credit New Form/XCUIElementTypeTextField - Nomor Kartu Kredit', [('text') : "${text}"]), '12345', 
    0)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Lanjutkan'), 0)

'Verify Button Lanjutkan Disable When Credit Card Number Less Than 16'
Mobile.verifyElementExist(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new3.png', FailureHandling.STOP_ON_FAILURE)

text = '12345'

Mobile.setText(findTestObject('Credit New Form/XCUIElementTypeTextField - Nomor Kartu Kredit', [('text') : "${text}"]), '12345678901234567890', 
    0)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0, FailureHandling.STOP_ON_FAILURE)

text = '1234567890123456'

'Verify Max Length Credit Card Number is 16'
Mobile.verifyElementExist(findTestObject('Credit New Form/XCUIElementTypeTextField - Nomor Kartu Kredit', [('text') : "${text}"]), 
    0)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Lanjutkan'), 0)

alert_text = 'Transaksi gagal (Kode : KM491)'

'Verify Description Alert KM491'
Mobile.verifyElementExist(findTestObject('General/XCUIElementTypeStaticText - Alert Snack Bar', [('alert_text') : "${alert_text}"]), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new_form5.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Pilih Bank'), 0)

switch (creditBank.toString()) {
    case 'BRI':
        Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - BRI'), 0)

        break
    default:
        break
}

//text = '1234567890123456'
Mobile.setText(findTestObject('Credit New Form/XCUIElementTypeTextField - Nomor Kartu Kredit', [('text') : "${text}"]), creditNumber.toString(), 
    0)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new_form6.png', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Database/Delete Rekening Finansial'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Lanjutkan'), 0)

alert_text = 'Anda tidak mempunyai rekening yang bisa dilakukan untuk bertransaksi.'

'Verify Description Alert U1'
Mobile.verifyElementExist(findTestObject('General/XCUIElementTypeStaticText - Alert Snack Bar', [('alert_text') : "${alert_text}"]), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new_form7.png', FailureHandling.STOP_ON_FAILURE)

text = creditNumber.toString()

Mobile.setText(findTestObject('Credit New Form/XCUIElementTypeTextField - Nomor Kartu Kredit', [('text') : "${text}"]), creditNumber.toString(), 
    0)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeStaticText - Bayar Kartu Kredit'), 0)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_new_form8.png', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Database/Add Rekening Finansial'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit New Form/XCUIElementTypeButton - Lanjutkan'), 0)

'Verify Credit Card Inquiry Page'
Mobile.verifyElementExist(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Total Pembayaran'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeButton - Bayar'), 0)

'Verify Button Bayar Disable'
Mobile.verifyElementExist(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Total Pembayaran'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_nominal9.png', FailureHandling.STOP_ON_FAILURE)

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

        Mobile.setText(findTestObject('Credit Nominal Open/XCUIElementTypeTextField - Nominal', [('text') : "${text}"]), '1000000000000', 
            0)

        Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Nominal Pembayaran'), 0)

        alert_text = 'Saldo anda tidak mencukupi'

        'Verify Saldo'
        Mobile.verifyElementExist(findTestObject('General/XCUIElementTypeStaticText - Alert Snack Bar', [('alert_text') : "${alert_text}"]), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_nominal10.png', FailureHandling.STOP_ON_FAILURE)

        text = '100.000.000.000'

        nominal = Mobile.getText(findTestObject('Credit Nominal Open/XCUIElementTypeTextField - Nominal', [('text') : "${text}"]), 
            0)

        Mobile.verifyEqual(nominal.length(), 15, FailureHandling.STOP_ON_FAILURE)

        'Verify Length Saldo'
        Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_nominal11.png', FailureHandling.STOP_ON_FAILURE)

        text = '100.000.000.000'

        Mobile.setText(findTestObject('Credit Nominal Open/XCUIElementTypeTextField - Nominal', [('text') : "${text}"]), amountCredit.toString(), 
            0)

        Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeStaticText - Nominal Pembayaran'), 0)

        break
    default:
        break
}

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/credit_nominal12.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Credit Nominal Open/XCUIElementTypeButton - Bayar'), 0)

