package mappingCode;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstap
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","F:\\Application Suport\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='login']")).click();	
		
	}
	}

