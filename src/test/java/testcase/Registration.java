package testcase;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.driver;

public class Registration extends driver {
     int age;
     int phone;

	@Test
	public void login() throws  Exception
	{
		String baseurl = "https://sam.rultest2.com/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
		File src = new File("C:\\Users\\Rocky\\Desktop\\Test\\Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		String data2 = sheet1.getRow(0).getCell(2).getStringCellValue();
		String data3 = sheet1.getRow(0).getCell(3).getStringCellValue();
		
		phone = (int) sheet1.getRow(0).getCell(4).getNumericCellValue();  //casting
		String phone2 = String.valueOf(phone);                            // String pass
		age = (int) sheet1.getRow(0).getCell(5).getNumericCellValue();
		String age2 = String.valueOf(age);
		
		String data6 = sheet1.getRow(0).getCell(6).getStringCellValue();

		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/form[1]/div[1]/span[1]/div[1]/div[1]/input[1]")).sendKeys(data0);
		driver.findElement(By.name("email")).sendKeys(data1);
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[1]/div/div/input")).sendKeys(data2);
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[2]/div/div/input")).sendKeys(data2);
		driver.findElement(By.name("first_name")).sendKeys(data3);
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[4]/div/div/input")).sendKeys("0"+phone2);
		
		WebElement e = driver.findElement(By.name("Gender"));
		Select s = new Select(e);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[6]/div/div/input")).sendKeys(age2);
		Thread.sleep(2000);
		
	
		
		WebElement d = driver.findElement(By.name("Designation"));
		Select designation = new Select(d);
		Thread.sleep(1000);
		designation.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[8]/div/div/input")).sendKeys(data6);;
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[3]/div/div/button")).click();
		Thread.sleep(5000);
		
		
}
	
}
