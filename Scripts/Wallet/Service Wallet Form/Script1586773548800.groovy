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

Mobile.toggleAirplaneMode('yes')

Mobile.delay(5)

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) == true)
	{Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)}
else {Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP); Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)}
Mobile.delay(10)

Mobile.toggleAirplaneMode('no')

Mobile.delay(20)

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) == true)
	{Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)}
else {Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP); Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)}


WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_history_purchase_ewallet SET value = "" WHERE username = "' +
	GlobalVariable.username) + '"')

CustomKeywords.'database.methods.executeUpdate'(('DELETE FROM tbl_list_purchase WHERE username = "' + GlobalVariable.username) +
	'" and group_id = "4"')

Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeButton - Fitur Lainnya'), 0)

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) ==
true) {
	Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

	Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
} else {
	Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

	Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

	Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
}

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeStaticText - Belum Ada'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Form/XCUIElementTypeStaticText - Belum Ada Daftar'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshotAsCheckpoint(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

//INSERT DOMEPT DIGITAL
Mobile.tap(findTestObject('Wallet Form/Button Back'), 0)

WebUI.callTestCase(findTestCase('General/Database Connect'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_history_purchase_ewallet SET value = "" WHERE username = "' +
	GlobalVariable.username) + '"')

CustomKeywords.'database.methods.executeUpdate'(('DELETE FROM tbl_list_purchase WHERE username = "' + GlobalVariable.username) +
	'" and group_id = "4"')

String queryListPurchase = (((((((((((((((((((((((((((((((((((((('INSERT INTO tbl_list_purchase (username,purchase_number,purchase_nickname,status,purchase_type_id,group_id,favorite,F1) VALUES ' +
'(\'') + GlobalVariable.username) + '\',\'085559547821\',\'Acep Budi\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'081218022786\',\'Customer\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'088218770335\',\'Aja\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'081290825284\',\'Julian\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'082210112982\',\'ADE RISSA HELIZA\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'082299888040\',\'LingLung\',1,24,4,0,null),') + //24 LinkAja
'(\'') + GlobalVariable.username) + '\',\'082299888040\',\'Dono\',1,27,4,0,null),') + //27 DANA
'(\'') + GlobalVariable.username) + '\',\'081288626368\',\'Ojek Pengkolan\',1,15,4,0,301342),') + //15 GoPay
'(\'') + GlobalVariable.username) + '\',\'082210112982\',\'Gojek\',1,15,4,0,301341),') + //15 GoPay
'(\'') + GlobalVariable.username) + '\',\'081290825284\',\'sofi\',1,26,4,0,null),') + //26 ShopeePay
'(\'') + GlobalVariable.username) + '\',\'08567641510\',\'xyz 123 !@?\',1,26,4,0,null),') + //26 ShopeePay
'(\'') + GlobalVariable.username) + '\',\'081218022786\',\'ora opo\',1,25,4,1,null),') + //25 OVO
'(\'') + GlobalVariable.username) + '\',\'080012345123\',\'0V0\',1,25,4,0,null)' //25 OVO

CustomKeywords.'database.methods.executeUpdate'(('DELETE FROM tbl_list_purchase WHERE username = "' + GlobalVariable.username) +
	'" and group_id = "4"')

CustomKeywords.'database.methods.executeUpdate'(queryListPurchase)

//	String queryListPurchase = '''UPDATE tbl_history_purchase_ewallet set value = '[{"number":"081212341234","name":"GoPay","customer":"Bakti Pratama","code":"15","type":"301341"},{"number":"088218770335","name":"LinkAja","customer":"FEGA EKA WAHYUDIN","code":"24","type":"null"},{"number":"082299888040","name":"DANA","customer":"DNID 082299888040","code":"27","type":"null"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"},{"number":"082299888040","name":"DANA","customer":"Syahrul Ramdhan","code":"27","type":"301341"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"},{"number":"081212341234","name":"GoPay","customer":"Bakti Pratama","code":"15","type":"301341"},{"number":"08567641510","name":"ShopeePay","customer":"kozo112233","code":"26","type":"null"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085559547821","name":"LinkAja","customer":"MOHAMMAD IQBAL SUGANDHI","code":"24","type":"null"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"}]' WHERE username = "'''+GlobalVariable.username+'''"'''
CustomKeywords.'database.methods.executeUpdate'(('UPDATE tbl_history_purchase_ewallet set value = \'[{"number":"081212341234","name":"GoPay","customer":"Bakti Pratama","code":"15","type":"301341"},{"number":"088218770335","name":"LinkAja","customer":"FEGA EKA WAHYUDIN","code":"24","type":"null"},{"number":"082299888040","name":"DANA","customer":"DNID 082299888040","code":"27","type":"null"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"},{"number":"082299888040","name":"DANA","customer":"Syahrul Ramdhan","code":"27","type":"301341"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"},{"number":"081212341234","name":"GoPay","customer":"Bakti Pratama","code":"15","type":"301341"},{"number":"08567641510","name":"ShopeePay","customer":"kozo112233","code":"26","type":"null"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085559547821","name":"LinkAja","customer":"MOHAMMAD IQBAL SUGANDHI","code":"24","type":"null"},{"number":"08008008002","name":"OVO","customer":"OVO TE** D**","code":"25","type":"25"},{"number":"085691335269","name":"LinkAja","customer":"FIKRI ARDIANSYAH","code":"24","type":"null"}]\' WHERE username = "' + 
    GlobalVariable.username) + '"')

//}
WebUI.callTestCase(findTestCase('General/Database Close'), [:], FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 5, FailureHandling.OPTIONAL) == 
true) {
    Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0) 
	//    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeButton - Fitur Lainnya'), 0)
    //	Scroll.scrollListToElementWithText('Donasi', 0)
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

    Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)
}

Mobile.verifyElementExist(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)

Mobile.tap(findTestObject('Feature Dashboard Home/XCUIElementTypeStaticText - Dompet Digital'), 0)



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

