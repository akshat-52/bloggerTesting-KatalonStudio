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

WebUI.navigateToUrl('https://www.blogger.com/about/?bpli=1')

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger.com - Create a unique and beau_ce24a0/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/bloggertest1/Page_Blogger/input_to continue to Blogger_identifier'), 'swe2005demo')

WebUI.sendKeys(findTestObject('Object Repository/bloggertest1/Page_Blogger/input_to continue to Blogger_identifier'), Keys.chord(
        Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/bloggertest1/Page_Blogger/input_Too many failed attempts_password'), 
    '/gGZGwewcf4G9e0aZ5780SSpvR1Vy/w9')

WebUI.sendKeys(findTestObject('Object Repository/bloggertest1/Page_Blogger/input_Too many failed attempts_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Google Account/span_Not now'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Posts/a_articlePosts'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Posts/a_Stats'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Stats/div_Comments'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Comments/div_Earnings'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Earnings/div_Pages'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Pages/div_Comments'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Comments/div_Theme'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Theme/div_Settings'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Settings/div_Settings'))

WebUI.click(findTestObject('Object Repository/bloggertest1/Page_Blogger Settings/div_Reading List'))

