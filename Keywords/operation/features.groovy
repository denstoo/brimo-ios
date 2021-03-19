package operation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection
import com.detroitlabs.katalonmobileutil.touch.Scroll as Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor as ScrollFactor
import com.detroitlabs.katalonmobileutil.testobject.Finder as Finder

public class features {
	@Keyword
	def clickNumber(String number) {
		def digits = getDigits(number)
		for (def digit : digits) {
			digit = Integer.parseInt(String.valueOf(digit))
			switch (digit) {
				case 0:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 0'), 0)
					break
				case 1:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 1'), 0)
					break
				case 2:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 2'), 0)
					break
				case 3:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 3'), 0)
					break
				case 4:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 4'), 0)
					break
				case 5:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 5'), 0)
					break
				case 6:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 6'), 0)
					break
				case 7:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 7'), 0)
					break
				case 8:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 8'), 0)
					break
				case 9:
					Mobile.tap(findTestObject('Pin/XCUIElementTypeButton - 9'), 0)
					break
			}
		}
	}

	def getDigits(String number) {
		return number.toCharArray()
	}

	@Keyword
	def clickAmountPulsa(String amount){
		switch (amount) {
			case '10000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp10.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp10.000'), 0)

				break
			case '15000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp15.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp15.000'), 0)

				break
			case '20000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp20.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp20.000'), 0)

				break
			case '25000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp25.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp25.000'), 0)

				break
			case '30000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp30.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp30.000'), 0)

				break
			case '40000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp40.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp40.000'), 0)

				break
			case '50000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp50.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp50.000'), 0)

				break
			case '75000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp75.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp75.000'), 0)

				break
			case '100000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp100.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp100.000'), 0)

				break
			case '150000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp150.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp150.000'), 0)

				break
			case '200000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp200.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp200.000'), 0)

				break
			case '300000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp300.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp300.000'), 0)

				break
			case '500000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp500.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp500.000'), 0)

				break
			case '1000000':
				while (Mobile.verifyElementExist(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp1.000.000'), 0, FailureHandling.OPTIONAL) == false) {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}

				Mobile.tap(findTestObject('Pulsa Form/XCUIElementTypeStaticText - Rp1.000.000'), 0)

				break
			default:
				break
		}
	}
}
