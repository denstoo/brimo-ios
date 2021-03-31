package common

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.detroitlabs.katalonmobileutil.touch.Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling


public class choiceSumberDana {
	@Keyword
	def choiceSumberDanaWithName(String text) {

		if (Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0, FailureHandling.OPTIONAL) == true) {

			Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)

			Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)
		}

		else {
			Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

			Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)

			Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)
		}
	}
}
