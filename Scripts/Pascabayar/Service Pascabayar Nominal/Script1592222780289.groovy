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

Mobile.verifyElementExist(findTestObject('Pascabayar Nominal/XCUIElementTypeStaticText - Total Pembayaran'), 0)

Mobile.tap(findTestObject('Pascabayar Nominal/XCUIElementTypeImage - Pilih Rekening'), 0)

text = debit.toString()

if (Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
}

if (decision.toString() == 'Save') {
    Mobile.tap(findTestObject('Pascabayar Nominal/XCUIElementTypeButton - Simpan'), 0)

    Mobile.setText(findTestObject('Pascabayar Nominal/XCUIElementTypeTextField - Nama'), name.toString(), 0)

    Mobile.tap(findTestObject('Pascabayar Nominal/XCUIElementTypeStaticText - Total Pembayaran'), 0)
}

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + '-') + 
    nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pascabayar Nominal/XCUIElementTypeButton - Bayar'), 0)

