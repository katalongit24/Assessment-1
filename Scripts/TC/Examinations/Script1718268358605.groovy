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

WebUI.navigateToUrl('https://btu.ac.in/home/')

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Time Table'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/li_B.Design'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_B.Design'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_B.Arch'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_M.Tech'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Exam Centers'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Notices  Orders'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Results'))

WebUI.switchToWindowTitle('Bikaner Technical University')

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/div_University_media'))

WebUI.click(findTestObject('Object Repository/Examination/Page_/a_College Login'))

WebUI.switchToWindowTitle('Bikaner Technical University')

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Conduct Forms'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Conduct Forms'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Question Bank'))

WebUI.click(findTestObject('Object Repository/Examination/Page_Bikaner Technical University/a_Question Paper 2018'))

