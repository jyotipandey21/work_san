package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
WebDriver driver;
  
public  LoginPage(WebDriver driver) {
	this.driver=driver;
}

	  @FindBy(how = How.XPATH, using = "//input[@id=\"user_login\"]")
		WebElement UserName;
	  @FindBy(how=How.XPATH,using="//input[@id=\"user_pass\"]")
	  WebElement PassWord;
	  @FindBy(how=How.XPATH,using="//input[@id=\"wp-submit\"]")
	  WebElement LoginIn;
	  @FindBy(how=How.XPATH,using="//*[@id=\"menu-users\"]/a/div[2]")
		WebElement NEW_USER;
	  @FindBy(how=How.XPATH,using="//*[@id=\"menu-users\"]/ul/li[3]/a")
		WebElement ADD_NEW_BUTTON;
	  @FindBy(how=How.XPATH,using="//input[@id=\"user_login\"]")
		WebElement USER_NAME_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"email\"]")
		WebElement EMAIL_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"first_name\"]")
		WebElement FIRST_NAME_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"last_name\"]")
		WebElement LAST_NAME_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"url\"]")
		WebElement WEBSITE_NAME_BUTTON;
			@FindBy(how=How.XPATH,using="//*[@id=\"role\"]")
		WebElement ROLE_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"createusersub\"]")
		WebElement ADDED_USERSUBMIT_BUTTON;
		
		public void Usernameboy(String name) {
			UserName.sendKeys(name);
		}
		public void UserPassword(String password) {	
			PassWord.sendKeys(password);


		}
		public void signin() {
			LoginIn.click();	
			
		}
		public void newuser() {
			NEW_USER.click();	
		}
		public void addnewuser() {
			ADD_NEW_BUTTON.click();	
		}
		public void loginusername(String name1) {
			USER_NAME_BUTTON.sendKeys(name1);	
		}
		public void emailuser(String email) {
			EMAIL_BUTTON.sendKeys(email);	
		}
		public void firstname(String name) {
			FIRST_NAME_BUTTON.sendKeys(name);
		}
			public void lastname(String name2) {
			LAST_NAME_BUTTON.sendKeys(name2);
		}
		public void websitename(String website) {
			WEBSITE_NAME_BUTTON.sendKeys(website);	
		}
		public void rolemodel() {
			Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"role\"]")));
			sel.selectByVisibleText("Author");
			ROLE_BUTTON.click();
		}
		public void atlastnewuseradded() {
			ADDED_USERSUBMIT_BUTTON.click();
		}
	

}



