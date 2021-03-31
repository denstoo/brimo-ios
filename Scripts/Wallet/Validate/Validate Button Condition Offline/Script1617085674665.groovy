import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

String tipe = 'XCUIElementTypeButton'

String value = button.toString()

Mobile.toggleAirplaneMode('yes')

Mobile.verifyElementExist(findTestObject('1 - Custom Object/Required Type and Label', [('tipe') : "$tipe", ('value') : "$value"]),
	0, FailureHandling.STOP_ON_FAILURE)