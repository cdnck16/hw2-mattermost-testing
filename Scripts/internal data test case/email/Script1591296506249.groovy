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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-aut.herokuapp.com/login')

WebUI.setText(findTestObject('Data Driven/nickname/Page_Mattermost/input_All team communication in one place searchable and accessible anywhere_loginId'), 
    'phong1998')

WebUI.setEncryptedText(findTestObject('Data Driven/nickname/Page_Mattermost/input_All team communication in one place searchable and accessible anywhere_password'), 
    'X6RAMBNCYDQ8H8PMJNlsmQ==')

WebUI.click(findTestObject('Data Driven/nickname/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Data Driven/position/Page_Town Square - team1612499 Mattermost/span'))

WebUI.click(findTestObject('Page_Town Square - team1612499 Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Data Driven/email/Page_Town Square - team1612499 Mattermost/span_Edit'))

WebUI.setText(findTestObject('Data Driven/email/Page_Town Square - team1612499 Mattermost/input_New Email_primaryEmail'), 
    new_email)

WebUI.setText(findTestObject('Data Driven/email/Page_Town Square - team1612499 Mattermost/input_Confirm Email_confirmEmail'), 
    confirm_email)

WebUI.setEncryptedText(findTestObject('Data Driven/email/Page_Town Square - team1612499 Mattermost/input_Current Password_currentPassword'), 
    current_password)

WebUI.click(findTestObject('Data Driven/email/Page_Town Square - team1612499 Mattermost/span_Save'))

WebUI.closeBrowser()

