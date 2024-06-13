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

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Read More'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Vision  Mission'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_BTU Home'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Office order of Shifting of B.Tech VIII S_6f09cc'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_All Important Links'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_BTU Home'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Ph.D. Admission 2023-24'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_BTU Home'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Time Table'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Grievance'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Training  Placement'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Copy View B.Tech I,II,III,IV and VI Sem O_687dd4'))

WebUI.switchToWindowTitle('Bikaner Technical University')

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Payment Link for ARF - Affiliation Related Fees'))

WebUI.click(findTestObject('Object Repository/Home/Page_PayU Webfront/button_Close'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_All News'))

WebUI.switchToWindowTitle('Bikaner Technical University')

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_Statutes of Bikaner Technical Universiy'))

WebUI.click(findTestObject('Object Repository/Home/Page_Bikaner Technical University/a_BTU Home'))

