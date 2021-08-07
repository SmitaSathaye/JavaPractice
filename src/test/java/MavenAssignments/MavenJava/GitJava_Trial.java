package MavenAssignments.MavenJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TryJSON {
	WebDriver driver;
	
	@Test
	public void Run() throws IOException, ParseException {
		
    System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/");	
		
	JSONParser jsonParser= new JSONParser();
	FileReader reader=new FileReader("D:\\Study\\File\\input.json");
	Object obj=jsonParser.parse(reader);
	JSONArray empList = (JSONArray) obj;
	//System.out.println(empList); //This prints the entire json file
			
	for(int i=0;i<empList.size();i++) 
	{
	JSONObject emps = (JSONObject) empList.get(i);
	//System.out.println(emps);
	JSONObject emp = (JSONObject) emps.get("userlogins");
	//System.out.println(emp);
	String uname = (String) emp.get("username");
	String pwd = (String) emp.get("password");
	//System.out.println("The username is " + uname);
	//System.out.println("The password is " + pwd);
	
	
	
	if(uname.contains("s"))
	{
		driver.findElement(By.id("login-username")).sendKeys(uname);
	}
	
	
	}
	
	
	}
	
	
	
/*	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	}
	
	@AfterClass
	void close()
	{
		driver.close();
	}

	@Test
	void login()
	{
		
	}*/
	
	/*@DataProvider(name="dp")
	
	@Test
	public String[] readJson() throws IOException, ParseException
	{
		JSONParser jsonParser= new JSONParser();
		FileReader reader=new FileReader(".\\jsonfiles\\input.json");
		
		Object obj=jsonParser.parse(reader);
		
		JSONObject userloginsJsonobj=(JSONObject) obj;
		JSONArray userloginsArray=(JSONArray) userloginsJsonobj.get("userlogins");
		
		String arr[]= new String[userloginsArray.size()];
		
		for(int i=0; i<userloginsArray.size();i++)
		{
			JSONObject users=(JSONObject) userloginsArray.get(i);
			String user=(String) users.get("username");
			String pwd=(String) users.get("password");
			
			arr[i]=user+","+pwd;
			
		}
		
		return arr;
		
		
		
	}*/
	
}
