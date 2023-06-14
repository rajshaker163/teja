package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.utility.Log;

public class DeleteGeneral extends DeleteGlobal {
	
	
	public void openAppication()
	{
System.setProperty("webdriver.chrome.driver","C:\\GD\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get(url);
       // Reporter.log("open");
        Log.info("opened");
	}
	public void logindetails()
	{
		driver.findElement(By.name(username)).sendKeys(un);
		driver.findElement(By.name(Password)).sendKeys(pw);
		driver.findElement(By.name(login_btn)).click();
		Log.info("login sucessfully");
	}
 public void SearchFor()
 {
	 driver.findElement(By.name(searchBy1)).sendKeys(SearrchBy);
	 driver.findElement(By.name(SearchFor1)).sendKeys( SearchFor);
	 driver.findElement(By.xpath(Search_btn)).click();
	 driver.findElement(By.name(Radio_btn)).click();
	 Log.info("Search sucessfully");
	 
 }
	public void Delete()
	{
		driver.findElement(By.xpath(Delete_btn)).click();
		Log.info("delete Sucessfully");
	}
	public void Logout()
	{
		driver.findElement(By.linkText(Logout_btn)).click();
		Log.info("Logout Sucessfully");
	}
	
	public void Close()
	{
		driver.close();
		Log.info("closed");
	}
}
