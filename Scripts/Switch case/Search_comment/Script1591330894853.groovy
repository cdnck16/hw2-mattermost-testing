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

WebUI.navigateToUrl('http://localhost:8065/')

WebUI.setText(findTestObject('Use switch case/Page_Mattermost/input_All team communication in one place s_703ef5'), 'phatvo')

WebUI.setEncryptedText(findTestObject('Use switch case/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject('Use switch case/Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Use switch case/Page_Town Square - My Team Mattermost/svg'))

WebUI.setText(findTestObject('Use switch case/Page_Town Square - My Team Mattermost/input_System Console_sbrSearchBox'), 
    VarA)

WebUI.sendKeys(findTestObject('Use switch case/Page_Town Square - My Team Mattermost/input_System Console_sbrSearchBox'), 
    Keys.chord(Keys.ENTER))

switch (VarA) {
    case 'hello':
        WebUI.sendKeys(findTestObject('Use switch case/Page_Town Square - My Team Mattermost/input_System Console_sbrSearchBox'), 
            Keys.chord(Keys.ENTER))

        break
    default:
        system.out.printfln('Not found')

        break
}

WebUI.closeBrowser()

