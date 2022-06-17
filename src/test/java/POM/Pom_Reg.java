package POM;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class Pom_Reg {

	WebDriver driver=null;
	
    int phone1;
    int age1;
	
	public void Pom_Registration(WebDriver driver) throws Exception {
		
		this.driver = driver;
	}
	
	By regfld = By.xpath("//a[contains(text(),'Register')]");
	
	File src = new File("C:\\Users\\HP\\Desktop\\Test\\Data.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
	String data2 = sheet1.getRow(0).getCell(2).getStringCellValue();
	String data3 = sheet1.getRow(0).getCell(3).getStringCellValue();
	
	phone1 = (int) sheet1.getRow(0).getCell(4).getNumericCellValue();      
	String phone2 = String.valueOf(phone1);                                 
	age1 = (int) sheet1.getRow(0).getCell(5).getNumericCellValue();
	String age2 = String.valueOf(age1);
	
	String data6 = sheet1.getRow(0).getCell(6).getStringCellValue();

	
	By unamefield = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/form[1]/div[1]/span[1]/div[1]/div[1]/input[1]");
	By emailfield = By.name("email");
	By passwordfield = By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[1]/div/div/input");
	By confirmpassfield = By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[2]/div/div/input");
	By namefield = By.name("first_name");
	By phonefield = By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[4]/div/div/input");
	By genderfield = By.name("Gender");
	By agefield = By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[6]/div/div/input");
	By designationfield = By.name("Designation");
	By institutefield = By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[8]/div/div/input");
	
	By registerfield = By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[3]/div/div/button");
	
	
	
	public void clickreg() {

		driver.findElement(regfld).click();
	}
	
	
	public void uname(String data) {

		driver.findElement(unamefield).sendKeys(data0);
	}
	
	public void email(String data) {

		driver.findElement(emailfield).sendKeys(data1);
	}
	
	public void password(String data) {

		driver.findElement(passwordfield).sendKeys(data2);
	}
	
	public void confirmpass(String data ) {

		driver.findElement(confirmpassfield).sendKeys(data2);
	}
	
	public void name(String data) {

		driver.findElement(namefield).sendKeys(data3);
	}
	
	public void phone(String phone) {

		driver.findElement(phonefield).sendKeys(phone2);
	}
	
	public void gender() {

		driver.findElement(genderfield);
	}
	
	public void age(String age) {

		driver.findElement(agefield).sendKeys(age2);
	}
	
	public void designation() {

		driver.findElement(designationfield);
	}
	
	public void institute(String data) {

		driver.findElement(institutefield).sendKeys(data6);
	}
	
	public void clickregister() {

		driver.findElement(registerfield).click();
	}
	
	
}
