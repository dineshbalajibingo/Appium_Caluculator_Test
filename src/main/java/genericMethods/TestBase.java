package genericMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static Properties CONFIG = new Properties();
	public static WebDriver driver = null;
	String path = System.getProperty("user.dir")+"//src//main//java//config//config.properties";
	public static String operatingSystem;
			
	public static WebDriver launch() throws IOException
	{
		
								 DesiredCapabilities cap=new DesiredCapabilities();
						        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
						        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
						        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 24");
						        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
						        cap.setCapability("appPackage", "com.android.calculator2");
						        cap.setCapability("appActivity", "Calculator");
	   					        cap.setCapability("noReset", true);
						        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
						        return driver;
		
		
	}
	
	public void navigatePage()
	{
		
	//driver.get(url);

	}
}

