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

Mobile.verifyElementExist(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Bayar Cicilan Finance'), 0)

Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeButton - Pilih Jenis Cicilan'), 0)

Mobile.delay(3)

switch (installmentType.toString()) {
    case 'BAF':
        Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Cicilan BAF'), 0)

        break
    case 'FIF':
        Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Cicilan FIF'), 0)

        break
    case 'FINANSIA':
        Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Cicilan FINANSIA'), 0)

        break
    case 'OTO':
        Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Cicilan OTO'), 0)

        break
    case 'VERENA':
        Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Cicilan VERENA'), 0)

        break
    case 'WOM':
        Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Cicilan WOM'), 0)

        break
    default:
        break
}

Mobile.setText(findTestObject('Cicilan New Form/XCUIElementTypeTextField - Nomor Pelanggan'), installmentNumber.toString(), 
    0)

Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeStaticText - Bayar Cicilan Finance'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cicilan New Form/XCUIElementTypeButton - Lanjut'), 0)

