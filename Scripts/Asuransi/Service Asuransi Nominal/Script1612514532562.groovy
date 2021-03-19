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

def whatPayment = null

if (Mobile.verifyElementExist(findTestObject('Briva Open Payment Service/XCUIElementTypeStaticText - Nomor Tujuan'), 10, 
    FailureHandling.OPTIONAL) == true) {
    whatPayment = 'Open'
} else if (Mobile.verifyElementExist(findTestObject('Briva Close Payment Service/XCUIElementTypeStaticText - Total Pembayaran'), 
    10, FailureHandling.OPTIONAL) == true) {
    whatPayment = 'Close'
}

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

switch (whatPayment.toString()) {
    case 'Open':
        Mobile.verifyElementExist(findTestObject('Briva Open Payment Service/XCUIElementTypeOther - BRIVA'), 0)

        Mobile.setText(findTestObject('Briva Open Payment Service/XCUIElementTypeTextField - Nominal'), amountBriva.toString(), 
            0)

        Mobile.tap(findTestObject('Briva Open Payment Service/XCUIElementTypeStaticText - Nominal Bayar'), 0)

        Mobile.tap(findTestObject('Briva Open Payment Service/XCUIElementTypeImage - Pilih Rekening'), 0)

        text = debit.toString()

        if (Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', 
                [('text') : "$text"]), 0, FailureHandling.OPTIONAL) == true) {
            Mobile.delay(5)

            Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', 
                    [('text') : "$text"]), 0)

            Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
                0)
        } else {
            Mobile.delay(5)

            Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

            Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', 
                    [('text') : "$text"]), 0)

            Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
                0)
        }
        
        if (decision.toString() == 'Save') {
            Mobile.tap(findTestObject('Briva Open Payment Service/XCUIElementTypeButton - Simpan'), 0)

            Mobile.setText(findTestObject('Briva Open Payment Service/XCUIElementTypeTextField - Nama'), name.toString(), 
                0)

            Mobile.tap(findTestObject('Briva Open Payment Service/XCUIElementTypeStaticText - Nomor Tujuan'), 0)
        }

		Mobile.delay(3)
        
        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

        nowTime = today.format('hh_mm_ss').toString()

        Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + 
            '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Briva Open Payment Service/XCUIElementTypeButton - Bayar'), 0)

        break
    case 'Close':
        Mobile.verifyElementExist(findTestObject('Briva Close Payment Service/XCUIElementTypeStaticText - Total Pembayaran'), 
            0)

        Mobile.tap(findTestObject('Briva Close Payment Service/XCUIElementTypeImage - Pilih Rekening'), 0)

        text = debit.toString()

        if (Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', 
                [('text') : "$text"]), 0, FailureHandling.OPTIONAL) == true) {
            Mobile.delay(5)

            Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', 
                    [('text') : "$text"]), 0)

            Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
                0)
        } else {
            Mobile.delay(5)

            Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

            Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', 
                    [('text') : "$text"]), 0)

            Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
                0)
        }

		Mobile.delay(3)
        
        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

        nowTime = today.format('hh_mm_ss').toString()

        Mobile.takeScreenshot(((('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_' + todaysDate) + 
            '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Briva Close Payment Service/XCUIElementTypeButton - Bayar'), 0)

        break
}

