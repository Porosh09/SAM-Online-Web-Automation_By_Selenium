package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.driver;

public class SignIn extends driver{
	
	@Test(priority=0)
	public void SignIn() throws InterruptedException
	{
		String baseurl = "https://sam.rultest2.com/account/";
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).sendKeys("fuadal");
		driver.findElement(By.name("password")).sendKeys("fuadbhai1");
		driver.findElement(By.xpath("//*[@id=\"stm-lms-login\"]/span/form/div/div/a")).click();
		Thread.sleep(2000);
		
		
		//course
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/div[3]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/a")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void profile() throws InterruptedException
	{
		
		//setting
		driver.findElement(By.xpath("(//span[@class='float_menu_item__title heading_font'])[2]")).click();
		Thread.sleep(2000);
		
		//clearname
		WebElement toClear = driver.findElement(By.xpath("//*[@id=\"stm_lms_edit_account\"]/span/form/div[1]/div/div/span[1]/div/div/input"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		
		
		driver.findElement(By.xpath("//*[@id=\"stm_lms_edit_account\"]/span/form/div[1]/div/div/span[1]/div/div/input")).sendKeys("arnabal");
		Thread.sleep(1000);
		
		//reset & set pass
		//driver.findElement(By.xpath("//*[@id=\"stm_lms_edit_account\"]/span/form/div[2]/div[2]/div/span[1]/div/div/div/input")).sendKeys("fuadbhai1");
		//driver.findElement(By.xpath("//*[@id=\"stm_lms_edit_account\"]/span/form/div[2]/div[2]/div/span[2]/div/div/div/input")).sendKeys("fuadbhai1");
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"stm_lms_edit_account\"]/span/form/div[3]/div/div/div[1]/button/span")).click();
		
		//click home
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		
		//scroll
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
		WebElement scroll=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/section[4]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(3000);
		
	
		WebElement scroll1=driver.findElement(By.xpath("//a[contains(text(),'Module 2: Assessment of Nutritional status and pri')]"));
	    js.executeScript("arguments[0].scrollIntoView();",scroll1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Module 3: Initial Management')]")).click();
		Thread.sleep(3000);
		
		//Scroll to Top
	    js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(1000);
		
	}
	
	
}
