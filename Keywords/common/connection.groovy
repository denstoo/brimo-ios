package common

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

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.connection.ConnectionState
import io.appium.java_client.android.connection.ConnectionStateBuilder
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import io.appium.java_client.AppiumDriver
import internal.GlobalVariable

import internal.GlobalVariable

public class connection {
	@Keyword
	def offlineMode() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		ConnectionState cs = new ConnectionStateBuilder().withWiFiDisabled().build()
		driver.setConnection(cs)
	}

	@Keyword
	def onlineMode() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		ConnectionState cs = new ConnectionStateBuilder().withWiFiDisabled().build()
		cs = new ConnectionStateBuilder().withWiFiEnabled().build()
		driver.setConnection(cs)
	}
}
