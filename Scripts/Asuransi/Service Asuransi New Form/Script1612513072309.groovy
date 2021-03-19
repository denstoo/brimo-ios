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
import com.detroitlabs.katalonmobileutil.testobject.TextField as TextField

Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Dompet Digital'), 0)

switch (insuranceType.toString()) {
    case 'BRINS':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - BRI Insurance'), 0)

        break
    case 'Prudential':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Prudential'), 0)

        break
    default:
        break
}

switch (paymentType.toString()) {
    case 'Premi Pertama':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Jenis GoPay'), 0)

        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Premi Pertama (SPAJ)'), 
            0)

        break
    case 'Premi Lanjutan':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Jenis GoPay'), 0)

        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Premi Lanjutan'), 0)

        break
    case 'Top Up Premi':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Jenis GoPay'), 0)

        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Top Up Premi'), 0)

        break
    case 'Biaya Cetak Ulang Polis':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Jenis GoPay'), 0)

        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Biaya Cetak Ulang Polis'), 
            0)

        break
    case 'Biaya Perubahan Polis':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Jenis GoPay'), 0)

        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Biaya Perubahan Polis'), 
            0)

        break
    case 'Biaya Cetak Kartu':
        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Pilih Jenis GoPay'), 0)

        Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Biaya Cetak Kartu'), 
            0)

        break
    default:
        break
}

Mobile.setText(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeTextField - Nomor Tujuan'), insuranceNumber.toString(), 
    0)

Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeStaticText - Bayar Asuransi'), 0)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Asuransi New Form/XCUIElementTypeButton - Lanjutkan'), 0)

