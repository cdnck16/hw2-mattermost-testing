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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('UI/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Use loop/Edit-message/Page_Town Square - team1 Mattermost/span_phatvo2'))

for (def index : (0..3)) {
	
	WebUI.mouseOver(findTestObject('Use loop/Edit-message/Page_phatvo2 - team1 Mattermost/p_hi'))
	
	WebUI.click(findTestObject('Use loop/Edit-message/Page_phatvo2 - team1 Mattermost/button_phatvo_CENTER_button_9b3ky3ts37n7pf9jx3b63j6b9w'))
	
	WebUI.click(findTestObject('Use loop/Edit-message/Page_phatvo2 - team1 Mattermost/button_Edit'))
	
	WebUI.setText(findTestObject('Use loop/Edit-message/Page_phatvo2 - team1 Mattermost/textarea_hi'), message)
	
	WebUI.click(findTestObject('Use loop/Edit-message/Page_phatvo2 - team1 Mattermost/button_Save'))

}

WebUI.closeBrowser()

