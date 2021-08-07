package MavenAssignments.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OcrHomePage {
	
	WebDriver driver;
	
	public OcrHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email=By.id("username");
	
	By password=By.name("_password");
	By login=By.xpath("//strong[@class='text-uppercase']");
	
	By pdftoword=By.xpath("(//*[text()='PDF to Word'])[1]");
		
	public WebElement EmailId()
	{
	  return driver.findElement(email);
	}
	
	public WebElement Pass()
	{
		return driver.findElement(password);
	}	
	
	public WebElement Login()
	{
		return driver.findElement(login);

	}	
	
	public WebElement PDF()
	{
		return driver.findElement(pdftoword);

	}
		

}
