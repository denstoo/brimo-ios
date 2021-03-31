import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.detroitlabs.katalonmobileutil.touch.Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.tap(findTestObject('Wallet Nominal Form/XCUIElementTypeImage - Pilih Rekening (1)'), 0)

if (Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0, FailureHandling.OPTIONAL) == true) {
	
	Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)
	
	CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

	Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)
}

else {
	Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)

	Mobile.verifyElementExist(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)

	CustomKeywords.'common.screenshot.takeScreenshotAsCheckpoint'()

	Mobile.tap(findTestObject('Transfer Nominal Form/XCUIElementTypeStaticText - Pilihan Rekening', [('text') : "$text"]), 0)
}