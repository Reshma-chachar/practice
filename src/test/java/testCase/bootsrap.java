package testCase;
import org.openqa.selenium.chrome.ChromeDriver;
public class bootsrap 
{
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","F:\\Application Suport\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	
}
}


