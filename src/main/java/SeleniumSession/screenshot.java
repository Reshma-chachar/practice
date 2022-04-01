package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot 
{  static WebDriver driver;
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Application Suport\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		takescreenshot("Facebook_LoginPage");
		
	}
	
	public static void takescreenshot(String filename) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\SHREE\\Feb2022batch\\primusBank\\src\\main\\java\\SeleniumSession"+"src\\\\main\\\\java\\\\SeleniumSession\\"+filename+".jpg"));
	}

}
