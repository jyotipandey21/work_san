package TEST;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Page.LoginPage;
import Util.BrowserFactory;
import Util.ExcelReader;

public class LoginTest {
	WebDriver driver;
	ExcelReader reader = new ExcelReader("DATA\\OpenSource.xlsx");

	@BeforeTest
	public void openbrowser() {
		driver = BrowserFactory.Browser();
	}

	@DataProvider(name = "openSource1")
	public String[][] opensourcetest() {
		String[][] data = reader.getAllData("Login");
		return data;
	}
	

	

	@Test(dataProvider = "openSource1")
	public void ValidUserAbleToLogin(String Name, String Password) {
		LoginPage logon = PageFactory.initElements(driver, LoginPage.class);
		logon.Usernameboy(Name);

		logon.UserPassword(Password);
		logon.signin();
		logon.newuser();
		logon.addnewuser();
	}
		@DataProvider(name="openSourceAddUser")
		public  String [][] addnewtest(){
			String [][] data=reader.getAllData("adduser");
			return data;
		}
		@Test(dependsOnMethods="ValidUserAbleToLogin",dataProvider="openSourceAddUser")
	public void addcontact(String name1,String email,String name,String name2,String website) throws InterruptedException {
			LoginPage addnew=PageFactory.initElements(driver, LoginPage.class);
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			addnew.loginusername(name1);
			Thread.sleep(3000);
			addnew.emailuser(email);
			Thread.sleep(3000);
			addnew.firstname(name);
			Thread.sleep(3000);
			addnew.lastname(name2);
			Thread.sleep(3000);
			addnew.websitename(website);
			Thread.sleep(3000);
			addnew.rolemodel();
			Thread.sleep(3000);
			addnew.atlastnewuseradded();
			
		}		
			
		
		

		 
	}

