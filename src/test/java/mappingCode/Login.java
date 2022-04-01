package mappingCode;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login
{
	public static ChromeDriver driver;
	@Given ("^user open chrome browser with exe as \"(.*)\"$")
	public static void launch(String exe)
	{
		System.setProperty("webdriver.chrome.driver",exe);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given ("^user enter url as \"(.*)\"$")	
	public static void openapp(String url)
	{
		driver.get(url);
	}
@When ("^use enter \"(.*)\" as username$")
public static void username(String uname)
{
	driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys(uname);
}
@When ("^User enter \"(.*)\" as password$")
public static void pass(String p)
{
	driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys(p);
}
@When ("^user click on Login button")
public static void login()
{
	driver.findElement(By.xpath("//*[@name='login']")).click();	
}
@When ("^User Click on search")
public static void searchcity()
{
	driver.findElement(By.xpath("//*[@height='24'])[2]")).click();
}
@When ("^user Select \"(.*)\" as country$")
public void user_Select_as_country(String string)
{
	Select co=new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
	co.selectByValue(string);
}
@When ("^User Select \"(.*)\" as state$")
public void user_Select_as_state(String string1)
{
	Select stat=new Select(driver.findElementByXPath("//*[@name='lst_stateS']"));
	stat.selectByValue(string1);
}
@When ("^user Select \"(.*)\" as city$")
public void user_Select_as_city(String string2) 
{
	Select cy=new Select(driver.findElementByXPath("//*[@name='lst_cityS']"));
	cy.selectByValue(string2);
}
@When ("^user Click on search")
public void user_Click_on_search()
{
	driver.findElementByXPath("//*[@name='btn_search']").click();
}

}