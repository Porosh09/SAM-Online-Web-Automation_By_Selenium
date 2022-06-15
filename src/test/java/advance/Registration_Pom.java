package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.Pom_Reg;
import base.driver;


public class Registration_Pom extends driver {
	
	String baseurl = "https://sam.rultest2.com/";
	
	@Test
	public void registration() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Pom_Reg pick = new Pom_Reg(driver);
		
		pick.uname(data0);


}
	
}
