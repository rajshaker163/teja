package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.utility.Log;

public class General extends Global {
	//	@BeforeClass
	public void open()
	{
System.setProperty("webdriver.chrome.driver","C:\\GD\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get(url);
    //    Reporter.log("open");
        Log.info("opened");
		
	}
	//@AfterClass
public void close()
{
	driver.close();
	//Reporter.log("closed");
	Log.info("closed");
}
	//@Test
public void log1in()
{
	driver.findElement(By.name(txt_username)).sendKeys(un);
	driver.findElement(By.name(txt_Password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	//Reporter.log("log1in");
	Log.info("log1in");
}
public void log1out()
{
	driver.findElement(By.linkText(bt_Logout)).click();
}
public void Frames()
{
	driver.switchTo().frame( Frames);
	//Reporter.log("entered");
	Log.info("entered");
}
public void Exit()
{
	driver.switchTo().defaultContent();
//	Reporter.log("exit");
	Log.info("exit");
}
//@Test
public void SearchBy()
{
	driver.findElement(By.name(btn_SearchBy)).sendKeys(SearchBy);
	//Reporter.log("search");
	Log.info("seearch");
}
//@Test
public void Add()
{
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_code)).sendKeys( Code);
	driver.findElement(By.name(txt_FName)).sendKeys(FName);
	driver.findElement(By.name(txt_LName)).sendKeys(LName);
	driver.findElement(By.name(txt_NName)).sendKeys(NName);
	driver.findElement(By.name(txt_MName)).sendKeys(MName);
	WebElement element=driver.findElement(By.name(Photo));
	element.sendKeys(photo1);
	//Reporter.log("enterd details"); 
	Log.info("entered details sucessfully");
}
public void save()
{
	driver.findElement(By.id(btn_save)).click();
}
public void searchfor()
{
	driver.findElement(By.name(searchfor1)).sendKeys(Searchfor);
}

public void radiobutton()
{
	driver.findElement(By.name(btn_Radio)).click();
}
public void detele()
{
	driver.findElement(By.xpath(btn_delete)).click();
}
public void Search_btn()
{
	driver.findElement(By.xpath(btn_Search)).click();
}
}

