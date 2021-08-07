package MavenAssignments.MavenJava;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OcrDetails_POMWay {

	@Test
	public static void Login() throws IOException, InterruptedException{

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ocr2edit.com/login");
		OcrHomePage_POMWay Hp = PageFactory.initElements(driver, OcrHomePage_POMWay.class); 
		
		Hp.Uname("automatesoftware02@gmail.com");
		Hp.Pwd("Auto@123");
		Hp.Lgsubmit();	
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Thread.sleep(5000);
		Hp.PW();
		Hp.CF();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);	
		Runtime.getRuntime().exec("D:\\Study\\Selenium\\AutoIt\\file.exe");
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//Thread.sleep(10000);	
		
		WebDriverWait w =new WebDriverWait(driver, 13); 
		w.until(ExpectedConditions.visibilityOf(Hp.locator));
		
		Hp.STRT();
		
	
	}
}
