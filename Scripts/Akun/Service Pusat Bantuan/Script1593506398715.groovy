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
import com.detroitlabs.katalonmobileutil.touch.Scroll as Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor as ScrollFactor
import com.detroitlabs.katalonmobileutil.testobject.Finder as Finder
import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection

Mobile.verifyElementExist(findTestObject('Pusat Bantuan/XCUIElementTypeOther - Pusat Bantuan'), 0)

Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

Mobile.verifyElementExist(findTestObject('Pusat Bantuan/XCUIElementTypeStaticText - Lihat Lebih'), 0)

Mobile.tap(findTestObject('Pusat Bantuan/XCUIElementTypeStaticText - Lihat Lebih'), 0)

Mobile.verifyElementExist(findTestObject('Pusat Bantuan/XCUIElementTypeStaticText - Lihat Lebih Sedikit'), 0)

Mobile.verifyElementExist(findTestObject('Pusat Bantuan/XCUIElementTypeStaticText - Akun'), 0)

Swipe.swipe(SwipeDirection.TOP_TO_BOTTOM)

text = title.toString()

Mobile.tap(findTestObject('Pusat Bantuan/XCUIElementTypeStaticText - Question', [('text') : "$text"]), 0)

Mobile.verifyElementExist(findTestObject('Pusat Bantuan/XCUIElementTypeStaticText - Question', [('text') : "$text"]), 0)

Scroll.scrollListToElementWithText('Tidak menemukan informasi yang kamu butuhkan ?', 0)

Mobile.verifyElementExist(findTestObject('Pusat Bantuan/XCUIElementTypeButton - Hubungi Kami'), 0)

Mobile.delay(3)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.takeScreenshot(((((GlobalVariable.screenshot + 'screenshot_') + todaysDate) + '-') + nowTime) + '.png', FailureHandling.STOP_ON_FAILURE)

