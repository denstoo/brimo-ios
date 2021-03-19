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

Mobile.verifyElementExist(findTestObject('Donasi Form/XCUIElementTypeOther - Donasi'), 0)

Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeButton - Pilih Produk Donasi'), 0)

switch (produk.toString()) {
    case 'YBM BRI':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - YBM BRI'), 0)

        break
    case 'Dompet Dhuafa':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Dompet Dhuafa'), 0)

        break
    default:
        break
}

Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeButton - Pilih Jenis'), 0)

switch (jenis.toString()) {
    case 'Zakat':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Zakat'), 0)

        break
    case 'Infaq':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Infaq  Kurban'), 0)

        break
    default:
        break
}

Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeButton - Pilih Nominal'), 0)

switch (nominal.toString()) {
    case '10000':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp10.000'), 0)

        break
    case '20000':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp20.000'), 0)

        break
    case '50000':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp50.000'), 0)

        break
    case '70000':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp70.000'), 0)

        break
    case '100000':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp100.000'), 0)

        break
    case '150000':
        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp150.000'), 0)

        break
    case '200000':
        Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

        Mobile.verifyElementExist(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp200.000'), 0)

        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp200.000'), 0)

        break
    case '300000':
        Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

        Mobile.verifyElementExist(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp300.000'), 0)

        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp300.000'), 0)

        break
    case '500000':
        Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

        Mobile.verifyElementExist(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp500.000'), 0)

        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp500.000'), 0)

        break
    case '1000000':
        Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

        Mobile.verifyElementExist(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp1.000.000'), 0)

        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Rp1.000.000'), 0)

        break
    case 'Masukkan Nominal Sendiri':
        Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

        Mobile.verifyElementExist(findTestObject('Donasi Form/XCUIElementTypeStaticText - Masukkan Nominal Sendiri'), 0)

        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Masukkan Nominal Sendiri'), 0)

        Mobile.setText(findTestObject('Donasi Form/XCUIElementTypeTextField - Nominal'), jumlah.toString(), 0)

        Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeStaticText - Bayar Donasi'), 0)

        break
    default:
        break
}

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Donasi Form/XCUIElementTypeButton - Lanjutkan'), 0)

