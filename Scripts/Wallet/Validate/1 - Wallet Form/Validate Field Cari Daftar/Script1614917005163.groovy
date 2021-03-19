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

//TC_BRImo_app_LinkAja_ios_dompet_digital_110 User dapat mencari daftar Dompet Digital dengan 1 huruf
Mobile.setText(findTestObject('Wallet Form/Field Cari Daftar Dompet Digital'), 'a', 0)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//TC_BRImo_app_LinkAja_ios_dompet_digital_111 User dapat mencari daftar Dompet Digital dengan masukan lebih dari 1 huruf atau 1 kata
Mobile.setText(findTestObject('Wallet Form/Field Cari Daftar Dompet Digital'), 'acep', 0)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//TC_BRImo_app_LinkAja_ios_dompet_digital_112 User dapat mencari daftar Dompet digital lebih dari 1 kata atau 1 kalimat
Mobile.setText(findTestObject('Wallet Form/Field Cari Daftar Dompet Digital'), 'acep budi cecep', 
    0)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//TC_BRImo_app_LinkAja_ios_dompet_digital_113 User dapat mencari daftar Dompet Digital tanpa Case Sensitive
Mobile.setText(findTestObject('Wallet Form/Field Cari Daftar Dompet Digital'), 'aCEp', 0)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//TC_BRImo_app_LinkAja_ios_dompet_digital_114 User dapat mencari daftar Dompet Digital dengan angka
Mobile.setText(findTestObject('Wallet Form/Field Cari Daftar Dompet Digital'), '123', 0)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//TC_BRImo_app_LinkAja_ios_dompet_digital_115 User dapat mencari daftar Dompet Digital dengan simbol
Mobile.setText(findTestObject('Wallet Form/Field Cari Daftar Dompet Digital'), '!@?', 0)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.hideKeyboard()

