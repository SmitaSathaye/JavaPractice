package MavenAssignments.MavenJava;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MMT_Booking {

	@Test
	public static void Booking () throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	MMT_Details MMT = PageFactory.initElements(driver, MMT_Details.class); 
	/*Thread.sleep(10000);
	
	if(MMT.BestText()==true)
	{
		MMT.Log();
		MMT.Pack();
	}
	
	else
	{	
	MMT.Pack();	
	}*/
	MMT.Pack();	
	Thread.sleep(5000);
	MMT.Dest();
	MMT.Inter();
	Thread.sleep(5000);
	MMT.Swissz();
	
	
	
	
	// Below code will find out window id to switch between tabs
String mainHandle = driver.getWindowHandle();
	System.out.println(mainHandle);
	
	Set <String> allHandles = driver.getWindowHandles();
	System.out.println(allHandles.size());
	
	for(String windowHandle : allHandles)
	{
		if(mainHandle.equals(windowHandle))
		{
			System.out.println("window1" + windowHandle + driver.getCurrentUrl() + driver.getTitle());
		}
		
		else
		{
			driver.switchTo().window(windowHandle);
			System.out.println("window2" + windowHandle + driver.getCurrentUrl() + driver.getTitle());
		}
	}
	
	
	Thread.sleep(5000);
	MMT.SkipBtn();
	//MMT.ClosePops();
	Thread.sleep(3000);
	MMT.Expl();
	
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");
	
	Thread.sleep(3000);
	driver.switchTo().window(mainHandle);
	
	//MMT.BookHotel();
	
	
	
	
	//driver.navigate().to("https://holidayz.makemytrip.com/holidays/international/search?dest=Switzerland&redirectionPage=grouping");
	
	//ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
    //driver.switchTo().window(tab.get(1));
	
	}
}
