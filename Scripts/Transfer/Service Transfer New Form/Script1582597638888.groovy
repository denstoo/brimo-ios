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

Mobile.verifyElementExist(findTestObject('Transfer New Form/XCUIElementTypeOther - Transfer'), 0)

Mobile.tap(findTestObject('Transfer New Form/XCUIElementTypeButton - Bank Tujuan'), 0)

Mobile.setText(findTestObject('Transfer Bank List/XCUIElementTypeSearchField - Cari Bank'), destinationBank.toString(), 
    0)

Mobile.hideKeyboard()

switch (destinationBank.toString()) {
    case 'ATMB LSB':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - ATMB LSB'), 0)

        break
    case 'ACEH SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ACEH SYARIAH'), 0)

        break
    case 'AGRIS':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK AGRIS'), 0)

        break
    case 'ANTAR DAERAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ANTAR DAERAH'), 0)

        break
    case 'ANZ INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ANZ INDONESIA'), 0)

        break
    case 'ARTHA GRAHA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ARTHA GRAHA'), 0)

        break
    case 'ARTOS':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ARTOS'), 0)

        break
    case 'BCA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BCA'), 0)

        break
    case 'BCA SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BCA SYARIAH'), 0)

        break
    case 'BENGKULU':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BENGKULU'), 0)

        break
    case 'BJB':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BJB'), 0)

        break
    case 'BJB SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BJB SYARIAH'), 0)

        break
    case 'BKE':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BKE'), 0)

        break
    case 'BNI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BNI'), 0)

        break
    case 'BNP':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BNP'), 0)

        break
    case 'BOCI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BOCI'), 0)

        break
    case 'BRI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BRI'), 0)

        break
    case 'BRI SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BRI SYARIAH'), 0)

        break
    case 'BRIAGRO':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BRIAGRO'), 0)

        break
    case 'BSM':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BSM'), 0)

        break
    case 'BTN':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BTN'), 0)

        break
    case 'BTPN':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BTPN'), 0)

        break
    case 'BUKOPIN':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BUKOPIN'), 0)

        break
    case 'BUMI ARTA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK BUMI ARTA'), 0)

        break
    case 'CAPITAL':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK CAPITAL'), 0)

        break
    case 'CCB INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK CCB INDONESIA'), 0)

        break
    case 'CIMB NIAGA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK CIMB NIAGA'), 0)

        break
    case 'CTBC INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK CTBC INDONESIA'), 0)

        break
    case 'DANAMON':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK DANAMON'), 0)

        break
    case 'DBS':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK DBS'), 0)

        break
    case 'DINAR':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK DINAR'), 0)

        break
    case 'DKI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK DKI'), 0)

        break
    case 'GANESHA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK GANESHA'), 0)

        break
    case 'HSBC INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK HSBC INDONESIA'), 0)

        break
    case 'ICBC INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ICBC INDONESIA'), 0)

        break
    case 'INA PERDANA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK INA PERDANA'), 0)

        break
    case 'INDEX':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK INDEX'), 0)

        break
    case 'JAMBI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK JAMBI'), 0)

        break
    case 'JASA JAKARTA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK JASA JAKARTA'), 0)

        break
    case 'JATENG':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK JATENG'), 0)

        break
    case 'JATIM':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK JATIM'), 0)

        break
    case 'KALBAR':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK KALBAR'), 0)

        break
    case 'KALSEL':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK KALSEL'), 0)

        break
    case 'LAMPUNG':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK LAMPUNG'), 0)

        break
    case 'MALUKU':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MALUKU'), 0)

        break
    case 'MANDIRI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MANDIRI'), 0)

        break
    case 'MANTAP':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MANTAP'), 0)

        break
    case 'MASPION':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MASPION'), 0)

        break
    case 'MAYAPADA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MAYAPADA'), 0)

        break
    case 'MAYBANK INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MAYBANK INDONESIA'), 0)

        break
    case 'MAYORA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MAYORA'), 0)

        break
    case 'MEGA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MEGA'), 0)

        break
    case 'MEGA SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MEGA SYARIAH'), 0)

        break
    case 'MESTIKA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MESTIKA'), 0)

        break
    case 'MNC':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MNC'), 0)

        break
    case 'MUAMALAT':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MUAMALAT'), 0)

        break
    case 'MULTIARTA SENTOSA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK MULTIARTA SENTOSA'), 0)

        break
    case 'NAGARI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK NAGARI'), 0)

        break
    case 'NOBU':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK NOBU'), 0)

        break
    case 'NTT':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK NTT'), 0)

        break
    case 'OCBC NISP':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK OCBC NISP'), 0)

        break
    case 'INDIA INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK OF INDIA INDONESIA'), 0)

        break
    case 'PANIN':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK PANIN'), 0)

        break
    case 'PANIN SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK PANIN SYARIAH'), 0)

        break
    case 'PAPUA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK PAPUA'), 0)

        break
    case 'PERMATA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK PERMATA'), 0)

        break
    case 'PRIMA MASTER':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK PRIMA MASTER'), 0)

        break
    case 'QNB INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK QNB INDONESIA'), 0)

        break
    case 'RIAU':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK RIAU'), 0)

        break
    case 'ROYAL':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK ROYAL'), 0)

        break
    case 'SAHABAT SAMPOERNA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SAHABAT SAMPOERNA'), 0)

        break
    case 'SBI INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SBI INDONESIA'), 0)

        break
    case 'SHINHAN INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SHINHAN INDONESIA'), 0)

        break
    case 'SINARMAS':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SINARMAS'), 0)

        break
    case 'STANCHART':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK STANCHART'), 0)

        break
    case 'SULSELBAR':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SULSELBAR'), 0)

        break
    case 'SULTENG':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SULTENG'), 0)

        break
    case 'SULTRA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SULTRA'), 0)

        break
    case 'SUMSELBABEL':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK SUMSELBABEL'), 0)

        break
    case 'UOB INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK UOB INDONESIA'), 0)

        break
    case 'VICTORIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK VICTORIA'), 0)

        break
    case 'VICTORIA SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK VICTORIA SYARIAH'), 0)

        break
    case 'WOORI INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK WOORI INDONESIA'), 0)

        break
    case 'YUDHA BHAKTI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BANK YUDHA BHAKTI'), 0)

        break
    case 'BNI SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BNI SYARIAH'), 0)

        break
    case 'BPD BALI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD BALI'), 0)

        break
    case 'BPD BANTEN':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD BANTEN'), 0)

        break
    case 'BPD DIY':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD DIY'), 0)

        break
    case 'BPD KALTENG':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD KALTENG'), 0)

        break
    case 'BPD KALTIM KALTARA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD KALTIM KALTARA'), 0)

        break
    case 'BPD NTB':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD NTB'), 0)

        break
    case 'BPD SULUT':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD SULUT'), 0)

        break
    case 'BPD SUMUT':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPD SUMUT'), 0)

        break
    case 'BPR EKA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPR EKA'), 0)

        break
    case 'BPR KS':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BPR KS'), 0)

        break
    case 'BTPN SYARIAH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - BTPN SYARIAH'), 0)

        break
    case 'CITIBANK INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - CITIBANK INDONESIA'), 0)

        break
    case 'COMMONWEALTH INDONESIA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - COMMONWEALTH INDONESIA'), 0)

        break
    case 'FINNET':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - FINNET'), 0)

        break
    case 'INDOSAT':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - INDOSAT (PAYPRO)'), 0)

        break
    case 'JTRUST BANK':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - JTRUST BANK'), 0)

        break
    case 'KEB HANA':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - KEB HANA'), 0)

        break
    case 'MUFG':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - MUFG BANK LTD'), 0)

        break
    case 'RABOBANK':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - RABOBANK'), 0)

        break
    case 'SYARIAH BUKOPIN':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - SYARIAH BUKOPIN'), 0)

        break
    case 'TELKOM':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - TELKOM'), 0)

        break
    case 'TELKOMSEL TCASH':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - TELKOMSEL TCASH'), 0)

        break
    case 'XL TUNAI':
        Mobile.tap(findTestObject('Transfer Bank List/XCUIElementTypeStaticText - XL TUNAI'), 0)

        break
    default:
        break
}

Mobile.setText(findTestObject('Transfer New Form/XCUIElementTypeTextField - Masukan Nomor Rekening'), destinationAccount.toString(), 
    0)

Mobile.tap(findTestObject('Transfer New Form/XCUIElementTypeButton - Bank Tujuan'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot('/Users/tsi-psd/Katalon Studio/Brimo Native iOS/Screenshot/iOS/screenshot_'+ todaysDate + '-' + nowTime + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer New Form/XCUIElementTypeButton - Lanjutkan'), 0)

