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

//Initialization input email textfield
String txtEmail = "tryadi@gmail.com"
//Initialization expected text present
String expectedText = "Tidak boleh kosong"


//calling test form test case login_Pos_masuk kehalaman login kumparan
WebUI.callTestCase(findTestCase("Login/Login_Pos_masuk kehalaman Login kumparan"), [:], FailureHandling.CONTINUE_ON_FAILURE)
//set input text field email
WebUI.setText(findTestObject("Login/TxtField/Field_email"), txtEmail)
//click button login
WebUI.click(findTestObject("Login/Button/Btn_Masuk_Dashboard"))
//set for expected result text present
WebUI.verifyTextPresent(expectedText, false)
