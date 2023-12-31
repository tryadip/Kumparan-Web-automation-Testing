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


//initialization expected text
String ExpectedText = "Tidak boleh kosong"
String JudulTestCase = "Login_Neg_Login tanpa mengisi semua field_1.png"


//calling testcase from login_pos_masuk kehalaman login kumparan
WebUI.callTestCase(findTestCase("Login/Login_Pos_Masuk kehalaman Login Kumparan"), [:], FailureHandling.STOP_ON_FAILURE)
//user click button login at login page
WebUI.click(findTestObject("Login/Button/Btn_Masuk_Dashboard"))

//if expected result is true the comment will appear "text sudah sesuai"
if(WebUI.verifyTextPresent(ExpectedText, false) == true) {
	WebUI.comment("Text sudah sesuai =" +ExpectedText)
}

//if result is not as expected the comment will appear "text tidak sesuai"
else {
	WebUI.comment("inline tidak sesuai")
}

WebUI.takeScreenshot("C:/Users/user/Documents/Latihan Testing/Report katalon/Kumparan Evidance/"+ JudulTestCase)