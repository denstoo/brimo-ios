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

//Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeOther - Dompet Digital'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//TC_BRImo_app_LinkAja_ios_dompet_digital_105 User dapat melihat action Hapus dari daftar, Edit, Jadikan Favorit
Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeStaticText - Jadikan Favorit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/Button Delete halaman awal dompet digital'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/Button edit halaman awal dompet digital text'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_ios_dompet_digital_106 User dapat hapus daftar dompet digital
today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.tap(findTestObject('Wallet Form/Button Hapus dari daftar'), 0)

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//TC_BRImo_app_LinkAja_ios_dompet_digital_107 User dapat Edit daftar dompet digital
Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Wallet Form/Button Edit Halman Awal Dompet Digital'), 0)

Mobile.setText(findTestObject('Wallet Form/Field Simpan Sebagai Halaman Edit Dompet Digital'), '.Edit Daftar', 0)

Mobile.hideKeyboard()

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

WebUI.delay(2)

Mobile.tap(findTestObject('Wallet Form/Button Simpan Halaman Edit Dompet Digital (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Wallet Form/Pesan Daftar berhasil diedit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_ios_dompet_digital_108 User dapat daftar dompet digital di jadikan favorit
Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0)

Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeStaticText - Jadikan Favorit'), 0)

Mobile.verifyElementExist(findTestObject('Wallet Form/Pesan Berhasil menambahkan Favorit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//TC_BRImo_app_LinkAja_ios_dompet_digital_109 User dapat hapus favorit daftar dompet digital
Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0)

Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeStaticText - Jadikan Favorit'), 0)

Mobile.verifyElementExist(findTestObject('Wallet Form/Pesan Berhasil dihapus dari Favorit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

today = new Date()

todaysDate = today.format('MM_dd_yy')

nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

