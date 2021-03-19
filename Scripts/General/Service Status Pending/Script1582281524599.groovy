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
import java.util.*
import java.sql.*
import java.sql.ResultSet as ResultSet

//WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.delay(GlobalVariable.timeoutMiddle, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Status Pending/XCUIElementTypeStaticText - Pembayaran Anda sedang Diverifikasi'), 
    0)

//refnum_pending = Mobile.getText(findTestObject('Status Pending/XCUIElementTypeStaticText - Refnum'), 0)
//
//Mobile.comment(refnum_pending)
//ResultSet response_pending = CustomKeywords.'database.methods.executeQuery'(('SELECT * FROM tbl_trx_log WHERE reference_num = "' + 
//    refnum_pending) + '"')
//
//response_pending.next()
//
//refnum_pending = response_pending.getString('reference_num')
//
//String username_pending = response_pending.getString('username')
//
//String object_pending = response_pending.getString('trx_object')
//
//String status_pending = response_pending.getString('trx_status')
//
//Mobile.comment(((((((('refnum = ' + refnum_pending) + ', username = ') + username_pending) + ', trx_object = ') + object_pending) + 
//    ' & ') + 'trx_status = ') + status_pending)
Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Status Pending/XCUIElementTypeButton - Cek Status'), 0)

