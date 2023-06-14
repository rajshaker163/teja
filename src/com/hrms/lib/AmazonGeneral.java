package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utility.Log;

public class AmazonGeneral extends AmazonGlobal {
	
	public void open() 
	{
System.setProperty("webdriver.chrome.driver","C:\\GD\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get(url);
		Log.info("open");
	}
	public  void action()
	{
		driver.findElement(By.xpath(shop)).click();
		driver.findElement(By.xpath(signin)).click();
		driver.findElement(By.xpath(email)).sendKeys(email_txt);
		driver.findElement(By.xpath(continue_btn)).click();
		//driver.findElement(By.xpath(passsword)).sendKeys(password_txt);
		//driver.findElement(By.xpath(sign_btn)).click();
		//driver.findElement(By.xpath(refresh));

		
		driver.findElement(By.xpath(forgotpassword)).click();
		driver.findElement(By.xpath(Email1)).sendKeys(Email1);
		driver.findElement(By.xpath(continue_btn1)).click();
		driver.findElement(By.xpath(Otp)).sendKeys(otp_txt);
		driver.findElement(By.xpath(continue_btn2)).click();
		Log.info("actions");
		
		
		
		
		
	}
}

