import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.detroitlabs.katalonmobileutil.touch.Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

Mobile.toggleAirplaneMode('yes')

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) == true) {
	Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
	Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0) //    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeButton - Fitur Lainnya'), 0)
} else {
	Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
	Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
	Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
}

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

String tipe = 'XCUIElementTypeButton'; String value = "Baiklah :')"
Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(5)

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_history_purchase_ewallet SET value = "" WHERE username = "' +
	GlobalVariable.username) + '"')

CustomKeywords.'database.methods.executeUpdate'(('DELETE FROM tbl_list_purchase WHERE username = "' + GlobalVariable.username) +
	'" and group_id = "4"')

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) ==
true) {
	Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

	Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0) //    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeButton - Fitur Lainnya'), 0)
} else {
	Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

	Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

	Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
}

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeStaticText - Belum Ada'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeStaticText - Belum Ada Daftar'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet Form/Button Back'), 0)

String queryListPurchase = (((((((((((((((((('INSERT INTO tbl_list_purchase (username,purchase_number,purchase_nickname,status,purchase_type_id,group_id,favorite,F1) VALUES ' +
'(\'') + GlobalVariable.username) + '\',\'085559547821\',\'LinkAja\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'088218770335\',\'xyz 123 !@?\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'082299888040\',\'DANA\',1,27,4,0,null),') + //27 DANA
'(\'') + GlobalVariable.username) + '\',\'081288626368\',\'GoPay\',1,15,4,0,301342),') + //15 GoPay
'(\'') + GlobalVariable.username) + '\',\'081290825284\',\'ShopeePay\',1,26,4,0,null),') + //26 ShopeePay
'(\'') + GlobalVariable.username) + '\',\'081218022786\',\'OVO\',1,25,4,1,null),') + //25 OVO

CustomKeywords.'database.methods.executeUpdate'(('DELETE FROM tbl_list_purchase WHERE username = "' + GlobalVariable.username) +
	'" and group_id = "4"')

CustomKeywords.'database.methods.executeUpdate'(queryListPurchase)

String tbl_history_purchase_ewallet = '''[
	{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},
	{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"},
	{"number":"082299888040","name":"DANA","customer":"Syahrul Ramdhan","code":"27","type":"301341"},
	{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"},
	{"number":"081212341234","name":"GoPay","customer":"Bakti Pratama","code":"15","type":"301341"},
	{"number":"08567641510","name":"ShopeePay","customer":"kozo112233","code":"26","type":"null"}
]'''

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_history_purchase_ewallet set value = "'+ tbl_history_purchase_ewallet +'" WHERE username = "' + GlobalVariable.username) + '"')

WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) == 
true) {
    Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0) //    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeButton - Fitur Lainnya'), 0)
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
}

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeButton - Top Up Baru'), 0)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.callTestCase(findTestCase('Wallet/Validate/1 - Wallet Form/Validate Field Cari Daftar'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeStaticText - Jadikan Favorit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/Button Delete halaman awal dompet digital'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/Button edit halaman awal dompet digital text'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Wallet Form/Button Edit Halman Awal Dompet Digital'), 0)

Mobile.setText(findTestObject('Wallet Form/Field Simpan Sebagai Halaman Edit Dompet Digital'), '.Edit Daftar', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Wallet Form/Button Simpan Halaman Edit Dompet Digital (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Wallet Form/Pesan Daftar berhasil diedit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0)

Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeStaticText - Jadikan Favorit'), 0)

Mobile.verifyElementExist(findTestObject('Wallet Form/Pesan Berhasil menambahkan Favorit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet Form/button icon titik tiga'), 0)

Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeStaticText - Jadikan Favorit'), 0)

Mobile.verifyElementExist(findTestObject('Wallet Form/Pesan Berhasil dihapus dari Favorit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet Form/XCUIElementTypeButton - Top Up Baru'), 0)

Mobile.verifyElementVisible(findTestObject('Wallet New Form/XCUIElementTypeButton - Pilih Dompet Digital'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Wallet New Form/XCUIElementTypeTextField - Nomor Tujuan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Wallet/Validate/2 - Wallet New Form/Validate Button Lanjutkan (No Input)'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()
