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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Wallet Form/Button Back'), 0)



Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), walletNumber.toString(), 0)

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

WebUI.callTestCase(findTestCase('Wallet/Validate/2 - Wallet New Form/Validate Button Lanjutkan (No Input)'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.clearText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), 0)

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

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

Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), '081456789', 0)

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

WebUI.callTestCase(findTestCase('Wallet/Validate/2 - Wallet New Form/Validate Button Lanjutkan (No Input)'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), '08145678901234', 0) //lebih dari 13 digit

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

tipe = 'XCUIElementTypeTextField'

value = '0814567890123'

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Value', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), '1234567890123', 0) //no tidak valid

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

tipe = 'XCUIElementTypeOther'

value = 'Format nomor handphone yang anda masukkan tidak tepat.'

Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - Lanjutkan'), 0)

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_ios_dompet_digital_210	Menginputkan nomor telepon yang tidak memiliki akun LinkAja
Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), '082223456512', 0)

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

tipe = 'XCUIElementTypeOther'

value = 'Tagihan atau nomor BRIVA tidak ditemukan. (Kode: FP2514)'

Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - Lanjutkan'), 0)

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - BrimoIconContact'), 0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

tipe = 'XCUIElementTypeStaticText'

value = 'LinkAja'

Mobile.tap(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.STOP_ON_FAILURE)

tipe = 'XCUIElementTypeStaticText'

value = '0856 91335269'

//Mobile.tap(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot((((('/Users/divapp/Documents/Brimo/Screenshot/' + todaysDate) + ' ') + nowTime) + '/') + '212 Top_Up_Baru pilih nomor kontak app.png', 
    FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_ios_dompet_digital_202 User dapat memasukan nomor handphone secara manual
Mobile.setText(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), walletNumber.toString(), 0)

Mobile.tap(findTestObject('Wallet New Form/Hide Keyboard halaman Top Up Baru'), 0)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet New Form/XCUIElementTypeButton - Lanjutkan'), 0)



