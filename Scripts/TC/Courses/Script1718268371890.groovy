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

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_M.TECH'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_POWER SYSTEMS'))

WebUI.switchToWindowTitle('Electrical Engineering - CET Bikaner')

WebUI.click(findTestObject('Object Repository/Courses/Page_Electrical Engineering - CET Bikaner/li_Course Structure'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Electrical Engineering - CET Bikaner/li_Faculties'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Electrical Engineering - CET Bikaner/li_Notices'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Electrical Engineering - CET Bikaner/li_Online Learning'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_MBA'))

WebUI.switchToWindowTitle('Management Studies - CET Bikaner')

WebUI.click(findTestObject('Object Repository/Courses/Page_Management Studies - CET Bikaner/li_Faculties'))

WebUI.switchToWindowTitle('Bikaner Technical University')

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_B.TECH'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_Artificial Intelligence and Data Science'))

WebUI.switchToWindowTitle('Electronics and Communication Engineering - CET Bikaner')

WebUI.click(findTestObject('Object Repository/Courses/Page_Electronics and Communication Engineer_80e6f3/li_Notices'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Electronics and Communication Engineer_80e6f3/li_Online Learning'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Electronics and Communication Engineer_80e6f3/li_Faculties'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Electronics and Communication Engineer_80e6f3/a_View Profile'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_Computer Science and Engineering (Cyber S_56dfb1'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Bikaner Technical University/a_Computer Science and Engineering'))

WebUI.switchToWindowTitle('Computer Science and Engineering - CET Bikaner')

WebUI.click(findTestObject('Object Repository/Courses/Page_Computer Science and Engineering - CET_498d7c/li_Course Structure'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Computer Science and Engineering - CET_498d7c/li_Faculties'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Computer Science and Engineering - CET_498d7c/li_Notices'))

WebUI.click(findTestObject('Object Repository/Courses/Page_Computer Science and Engineering - CET_498d7c/li_Online Learning'))

