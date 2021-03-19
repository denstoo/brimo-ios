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

Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeOther - Mutasi'), 0)

Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeButton - Pilih Tanggal'), 0)

Mobile.delay(3)

String text = ''

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

switch (range.toString()) {
    case 'Hari Ini':
        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeStaticText - Hari ini'), 0)

        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeButton - Cari'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeCell - 1'), 0)

		Mobile.delay(3)
		
		today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

		nowTime = today.format('hh_mm_ss').toString()

		Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)


        break
    case 'Kemarin':
        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeStaticText - Kemarin'), 0)

        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeButton - Cari'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeCell - 1'), 0)

		Mobile.delay(3)

        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

		nowTime = today.format('hh_mm_ss').toString()

		Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

        break
    case 'Minggu Ini':
        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeStaticText - Minggu ini'), 0)

        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeButton - Cari'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeCell - 1'), 0)

		Mobile.delay(3)

        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

		nowTime = today.format('hh_mm_ss').toString()

		Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

        break
    case 'Bulan Ini':
        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeStaticText - Bulan ini'), 0)

        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeButton - Cari'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeCell - 1'), 0)

		Mobile.delay(3)

        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

		nowTime = today.format('hh_mm_ss').toString()

		Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

        break
    case 'Pilih Tanggal Sendiri':
        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeStaticText - Pilih Tanggal Sendiri'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Select Date/XCUIElementTypeOther - Pilih Tanggal'), 0)

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeButton - Tanggal Awal'), 0)

        if (month.toString() == 'YES') {
            Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeButton - Previous Month'), 0)
        }
        
        text = start.toString()

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeStaticText - Tanggal Pilihan', [('text') : "${text}"]), 
            0)

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeButton - Pilih Tanggal'), 0)

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeButton - Tanggal Akhir'), 0)

        text = end.toString()

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeStaticText - Tanggal Pilihan', [('text') : "${text}"]), 
            0)

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeButton - Pilih Tanggal'), 0)

		Mobile.delay(3)

        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

		nowTime = today.format('hh_mm_ss').toString()

		Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Mutasi Select Date/XCUIElementTypeButton - Pilih'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeOther - Mutasi'), 0)

        Mobile.tap(findTestObject('Mutasi Form/XCUIElementTypeButton - Cari'), 0)

        Mobile.verifyElementExist(findTestObject('Mutasi Form/XCUIElementTypeCell - 1'), 0)

		Mobile.delay(3)

        today = new Date()

        todaysDate = today.format('MM_dd_yy').toString()

		nowTime = today.format('hh_mm_ss').toString()

		Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

        break
    default:
        break
}

