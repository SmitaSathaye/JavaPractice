package MavenAssignments.MavenJava;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RunTest {
	
WebDriver driver;
	
	@Test
	public void Run() throws IOException, ParseException {
	JSONParser jsonParser= new JSONParser();
	FileReader reader=new FileReader("D:\\Study\\File\\input.json");
	Object obj=jsonParser.parse(reader);
	JSONArray empList = (JSONArray) obj;
	System.out.println(empList); //This prints the entire json file
	}

}
