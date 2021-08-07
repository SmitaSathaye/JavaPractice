package MavenAssignments.MavenJava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OcrHomePage_POMWay {
	
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="functional-submit-btn")
	WebElement login;
	
	@FindBy(xpath="//*[text()='PDF to text']")
	WebElement pdftoword;
	
	@FindBy(id="fileUploadButton")
	WebElement choose;
	
	@FindBy(xpath="//i[@class='fa fa-chevron-right']")
	WebElement start;
	
	@FindBy(xpath="//i[@title='File upload']")
	WebElement locator;
			
	public void Uname(String usernm) {
		uname.sendKeys(usernm);
	}
	
	
	public void Pwd(String pass) 
	{
		
		pwd.sendKeys(pass);
	
	}
	
	public void Lgsubmit() 
	{
		
		login.click();
	
	}

	public void PW() 
	{
		
		pdftoword.click();
	
	}
	
	public void CF() 
	{
	    choose.click();
	}
	
	public void STRT() 
	{
	    start.click();
	}

}
