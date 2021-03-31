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
import internal.GlobalVariable
import wallet.Wallet

import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection

//TC_BRImo_app_LinkAja_iOS_dompet_digital_314	User hanya dapat input angka di Field Norminal

Mobile.verifyElementExist(findTestObject('Wallet Nominal Form/XCUIElementTypeButton - Top Up'), 0)

Mobile.callTestCase(findTestCase('Wallet/Validate/3 - Wallet Inquiry/Choice Sumber Dana'), [('text') : wallet.toString()], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nominal'), amountWallet.toString(), 0)

if (decision.toString() == 'Save') {
    Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeButton - Simpan'), 0)

    Mobile.setText(findTestObject('Wallet Nominal Form/XCUIElementTypeTextField - Nama'), name.toString(), 0)

    Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeStaticText - Nomor Tujuan'), 0)
}

CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeButton - Top Up'), 0)