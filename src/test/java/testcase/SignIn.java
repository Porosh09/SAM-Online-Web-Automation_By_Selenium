package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.driver;

public class SignIn extends driver{
	@Test
	public void SignIn() throws InterruptedException
	{
		String baseurl = "https://sam.rultest2.com/account/";
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).sendKeys("fuadal");
		driver.findElement(By.name("password")).sendKeys("abirbhai");
	
		
	
		driver.findElement(By.xpath("//*[@id=\"stm-lms-login\"]/span/form/div/div/a")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/div[3]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/a")).click();
		Thread.sleep(2000);
	}
}
