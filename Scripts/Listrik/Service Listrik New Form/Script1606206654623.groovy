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

Mobile.verifyElementExist(findTestObject('Listrik New Form/XCUIElementTypeStaticText - Beli atau Bayar Listrik'), 0)

Mobile.tap(findTestObject('Object Repository/Listrik New Form/XCUIElementTypeButton - Pilih Produk Listrik'), 0)

switch (listrikType.toString()) {
    case 'Tagihan':
        Mobile.tap(findTestObject('Object Repository/Listrik New Form/XCUIElementTypeStaticText - Tagihan Listrik'), 0)

        break
    case 'Token':
        Mobile.tap(findTestObject('Object Repository/Listrik New Form/XCUIElementTypeStaticText - Token Listrik'), 0)

        break
    default:
        break
}

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Listrik New Form/XCUIElementTypeTextField - Nomor Tujuan'), listrikNumber.toString(), 
    0)

Mobile.tap(findTestObject('Listrik New Form/XCUIElementTypeStaticText - Beli atau Bayar Listrik'), 0)

height = Mobile.getDeviceHeight()

weight = Mobile.getDeviceWidth()

Mobile.tapAtPosition(weight / 2, height / 2)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

switch (listrikType.toString()) {
    case 'Tagihan':
        Mobile.tap(findTestObject('Object Repository/Listrik New Form/XCUIElementTypeButton - Bayar'), 0)

        break
    case 'Token':
        Mobile.tap(findTestObject('Object Repository/Listrik New Form/XCUIElementTypeButton - Beli'), 0)

        break
    default:
        break
}

