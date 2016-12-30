import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MyTestCase {
	WebDriver driver;
	@Test
	
	public void MyTest()
	{
		System.setProperty("webdriver.gecko.driver",".//ExeFiles//geckodriver.exe");

         driver = new FirefoxDriver();

        driver.get("http://testng.org/doc/maven.html");
	System.out.println("My name is GitHub");
	
	
	}
	

}
