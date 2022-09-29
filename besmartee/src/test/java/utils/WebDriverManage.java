package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverManage 
{	
	private WebDriver driver;
	private static String userDirectory = System.getProperty("user.dir");
	private static boolean startDriver = true;
	
	public WebDriver createDriver() throws IOException 
	{	
		FileInputStream fis;
		Properties prop = new Properties();
		
		fis = new FileInputStream(userDirectory + "/src/test/resources/global.properties");
		prop.load(fis);
	
		String brower = prop.getProperty("broswer");
		
		if(driver != null) { driver.quit(); }
		
		if( brower.equalsIgnoreCase("firefox") ) {
			return createFirefoxDriver();
		}
		
		if( brower.equalsIgnoreCase("chrome") ) {
			return createChromeDriver();			
		}
		
		throw new IOException("No support this dirver" + brower);
		
	}
	
	public void closeDriver() {
        if(driver == null) {
            startDriver = true;
            return;
        }
		driver.quit();
		driver = null;
        startDriver = true;
	}
	
	private WebDriver createFirefoxDriver() 
	{
		System.setProperty("webdriver.gecko.driver", userDirectory + "/webdrivers/geckodriver.exe");
        return new FirefoxDriver();
    }
	
	
	private WebDriver createChromeDriver() 
	{	
		System.setProperty("webdriver.gecko.driver", userDirectory + "/webdrivers/chromedriver.exe");
        return new ChromeDriver();
    }	
	
}
