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

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(GlobalVariable.timeoutMiddle, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Status Receipt/Old/XCUIElementTypeStaticText - Transaksi Berhasil'), 0)

//String refnum_receipt
//
//switch (GlobalVariable.deviceHeight) {
//    case '667':
//        refnum_receipt = Mobile.getText(findTestObject('Status Receipt/XCUIElementTypeStaticText - Ip6 Refnum Transaksi'), 
//            0)
//
//        break
//    case '812':
//        refnum_receipt = Mobile.getText(findTestObject('Status Receipt/Old/XCUIElementTypeStaticText - IpX Refnum Transaksi'), 
//            0)
//
//        break
//    default:
//        break
//}
refnum_receipt = Mobile.getText(findTestObject('Status Receipt/XCUIElementTypeStaticText - Refnum'), 0)

Mobile.comment(refnum_receipt)

ResultSet response_receipt = CustomKeywords.'database.methods.executeQuery'(('SELECT * FROM tbl_trx_log WHERE reference_num = "' + 
    refnum_receipt) + '"ORDER BY id DESC')

response_receipt.next()

refnum_receipt = response_receipt.getString('reference_num')

String username_receipt = response_receipt.getString('username')

String object_receipt = response_receipt.getString('trx_object')

String status_receipt = response_receipt.getString('trx_status')

Mobile.comment(((((((('refnum = ' + refnum_receipt) + ', username = ') + username_receipt) + ', trx_object = ') + object_receipt) + 
    ' & ') + 'trx_status = ') + status_receipt)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Status Receipt/Old/XCUIElementTypeButton - OK'), 0)

WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

