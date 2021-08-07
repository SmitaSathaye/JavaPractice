package MavenAssignments.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OcrLoginDetails {
	
	@Test
	public static void Login()
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ocr2edit.com/login");
		OcrHomePage hp=new OcrHomePage(driver);
		hp.EmailId().sendKeys("automatesoftware02@gmail.com");
		hp.Pass().sendKeys("Auto@123");
		hp.Login().click();
		hp.PDF().click();
		
		
		
	}
	
	

}
