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

WebUI.callTestCase(findTestCase('UI/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('UI/Create_private_channel/Page_Town Square - hp Mattermost/span_'))

WebUI.click(findTestObject('UI/Create_private_channel/Page_Town Square - hp Mattermost/input_- Anyone can join this channel_channelType'))

WebUI.setText(findTestObject('UI/Create_private_channel/Page_Town Square - hp Mattermost/input_Name_newChannelName'), name)

WebUI.setText(findTestObject('UI/Create_private_channel/Page_Town Square - hp Mattermost/textarea_(optional)_newChannelPurpose'), 
    purpose)

WebUI.setText(findTestObject('UI/Create_private_channel/Page_Town Square - hp Mattermost/textarea_(optional)_newChannelHeader'), 
    header)

if (name == 'private channel') {
	
	WebUI.closeBrowser()
	
	System.out.printfln('This name have existed	')
	
} else {

	WebUI.click(findTestObject('UI/Create_private_channel/Page_Town Square - hp Mattermost/span_Create Channel'))
	
}

WebUI.closeBrowser()

