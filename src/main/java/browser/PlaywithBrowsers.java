package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import read_data.Read_File_input;

public class PlaywithBrowsers {

	WebDriver driver;
@Test
public void chrombrowers () throws Throwable
{
	Read_File_input.read();
	
	
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\Drivers\\Chrome driver\\chromedriver.exe");
	
	driver = new ChromeDriver(); 
	
	

	
}

//@Test
public void firefoxbrowers ()
{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\Drivers\\geckodriver.exe"); 
			 driver = new FirefoxDriver(); 
			 
			 driver.get("https://www.google.com/");
}



}