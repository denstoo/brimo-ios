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

WebUI.callTestCase(findTestCase('IOS/Feature/Dompet Digital/1 Halaman Awal Dompet Digital/TC_BRImo_app_LinkAja_ios_dompet_digital_116'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IOS/Dompet Digital/2 Halaman Top Up Baru/Button Dropdown Pilih Dompet Digital'), 0)

Mobile.tap(findTestObject('IOS/Dompet Digital/2 Halaman Top Up Baru/Button LinkAja Dompet Digital'), 0)

Mobile.setText(findTestObject('IOS/Dompet Digital/2 Halaman Top Up Baru/Field Nomor Tujuan'), '085691335269', 0)

