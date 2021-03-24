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

//TC_BRImo_app_LinkAja_iOS_dompet_digital_314	User hanya dapat input angka di Field Norminal

Mobile.verifyElementExist(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), 0)
Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), 0)
Mobile.delay(3)
Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeStaticText - Nomor Tujuan'), 0)
//TC_BRImo_app_LinkAja_iOS_dompet_digital_321	Pembayaran Top Up LinkAja dengan Rekening Sumber Giro dengan Saldo Tidak Cukup
//TC_BRImo_app_LinkAja_iOS_dompet_digital_322	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Status Closed/Dormant/Freeze
//TC_BRImo_app_LinkAja_iOS_dompet_digital_323	Pembayaran Top Up LinkAja dengan Rekening Sumber Giro dengan Status Closed/Dormant/Freeze
//TC_BRImo_app_LinkAja_iOS_dompet_digital_324	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Status Closed/Dormant/Freeze
//TC_BRImo_app_LinkAja_iOS_dompet_digital_319	Pembayaran Top Up LinkAja dengan Rekening Sumber  Giro dengan Saldo Cukup
Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)
text = "Brigitta-Giro"
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

Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), '1000000000', 0)

tipe = 'XCUIElementTypeStaticText'

value = 'Saldo Anda tidak mencukupi'

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]),
	0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeStaticText - Nomor Tujuan'), 0)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_320	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Saldo Tidak Cukup
Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)
text = "GIRO SALDO TIDAK CUKUP"
text = "Buanyak"
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

tipe = 'XCUIElementTypeStaticText'

value = 'Saldo Anda tidak mencukupi'

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]),
	0, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)
Mobile.delay(5)
Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type', [('tipe') : "XCUIElementTypeCell",]), 0, FailureHandling.STOP_ON_FAILURE)
text = 'Brigitta-Giro'
//text = '0019 0100 1364 305'

if (Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)
    
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    if (Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [
                ('text') : "$text"]), 0, FailureHandling.OPTIONAL) == true) {
        Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [
                    ('text') : "$text"]), 0)

        Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
            0)
    }
}

Mobile.delay(5)

Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)
Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type', [('tipe') : "XCUIElementTypeCell",]), 0, FailureHandling.STOP_ON_FAILURE)
text = 'Buanyak'
//text = '0206 0100 2751 302'

if (Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
}

Mobile.delay(5)

Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)
Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type', [('tipe') : "XCUIElementTypeCell",]), 0, FailureHandling.STOP_ON_FAILURE)
text = 'Rekening Anda tidak aktif.'
//text = '0206 0100 0002 529'

if (Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
}

Mobile.delay(5)
text = 'Rekening sudah ditutup'

if (Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
} else {
    Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
}

Mobile.delay(5)

text = 'GIRO SALDO TIDAK CUKUP'
//text = '0019 0100 1364 305'

if (Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
} else {
    Swipe.swipe(SwipeDirection.TOP_TO_BOTTOM)

    Mobile.verifyElementVisible(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)

    Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 
        0)
}

//TC_BRImo_app_LinkAja_iOS_dompet_digital_303	User dapat melihat semua rekening
Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_304	User dapat mengganti Sumber Rekening
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

//TC_BRImo_app_LinkAja_iOS_dompet_digital_315	Field tidak Norminal terisi dan menekan button Top Up
WebUI.callTestCase(findTestCase('Wallet/Validate/3 - Wallet Inquiry/Validate Button Top Up'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Wallet Nominal Form/XCUIElementTypeStaticText - Nominal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_305	Nominal diisi 0
Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), '0', 0)

WebUI.callTestCase(findTestCase('Wallet/Validate/3 - Wallet Inquiry/Validate Button Top Up'), [:], FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_306	Nominal diisi lebih dari 12 digit
Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), '1234567890123', 0 //beda verify nya
    )

//TC_BRImo_app_LinkAja_iOS_dompet_digital_307	Memasukkan angka "0" terus terusan
Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), '000', 0 //beda
    )

WebUI.callTestCase(findTestCase('Wallet/Validate/3 - Wallet Inquiry/Validate Button Top Up'), [:], FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_308	Top up dibawah minimal nominal "10000"
Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), '5000', 0)

tipe = 'XCUIElementTypeStaticText'

value = 'Minimal Top Up Rp20.000' //Saldo Anda tidak mencukupi

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Wallet/Validate/3 - Wallet Inquiry/Validate Button Top Up'), [:], FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_309	Top up diatas saldo rekening default
Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), '2000000', 0 //saldo rekening Britama X 1.544.009,00
    )

tipe = 'XCUIElementTypeStaticText'

value = 'Saldo Anda tidak mencukupi'

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Wallet/Validate/3 - Wallet Inquiry/Validate Button Top Up'), [:], FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_302	User memasukan Nominal
Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), amountWallet.toString(), 0)

Mobile.verifyElementExist(findTestObject('Wallet Nominal Form/XCUIElementTypeStaticText - Nominal'), 0)

//TC_BRImo_app_LinkAja_ios_dompet_digital_301	User menyimpan nomor tujuan
if (decision.toString() == 'Save') {
    Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeButton - Simpan'), 0)

    Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nama'), name.toString(), 0)

    Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeStaticText - Nomor Tujuan'), 0)
}

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

//TC_BRImo_app_LinkAja_iOS_dompet_digital_316	Field Norminal terisi dan menekan button Top Up
Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeButton - Top Up'), 0)

