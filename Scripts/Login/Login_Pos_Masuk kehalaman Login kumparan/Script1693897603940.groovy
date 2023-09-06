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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Alert

//user directed to kumparan page
WebUI.openBrowser("https://kumparan.com/")
String JudulTestCase = "Login_Neg_Masuk kehalaman Login kumparan_1.png"

try {
	//initialization alert = button tidak
	def alert = findTestObject("Login/Alert/btn_tdk")
	// If the alert is present, click button tidak
	if (alert != null) {
		WebUI.click(alert)
	} else {
		// Handle the case where no alert is present
		// This could be logging a message or taking alternative actions
		println("No alert found.")
	}
} catch (Exception e) {
	// Handle any exceptions that may occur during alert dismissal
	println("An error occurred while dismissing the alert: " + e.getMessage())
}
//user click button login
WebUI.click(findTestObject("Login/Button/btn_Login"))
WebUI.takeScreenshot("C:/Users/user/Documents/Latihan Testing/Report katalon/Kumparan Evidance/"+ JudulTestCase)