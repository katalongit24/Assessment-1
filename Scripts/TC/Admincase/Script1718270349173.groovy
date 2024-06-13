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

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Administration'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Chancellor'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Vice Chancellor'))

WebUI.switchToWindowTitle('Bikaner Technical University')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Registrar'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/li_Dean Faculty Affairs'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Dean Faculty Affairs'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Dean Academic'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Controller of Examination'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Dean Research'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Dean of Students Welfare'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Dean Research'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/li_Public Relation Officer (PRO)'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/a_Dean Faculty of Human Value Education'))

WebUI.doubleClick(findTestObject('Object Repository/Administrator/Page_Bikaner Technical University/li_Vice Chancellor'))

