package All_Projects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Sheet {

	public static void main(String[] args) throws Exception 
	{
		// Browser OPen
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify WebElement
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		
		// Add data from ExcelSheet
		String path="C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Excel_Data\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String email=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();		//0,0 ---->Test12@gmail.com
		System.out.println(email);
		
		String pass=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();		//0,1 ---->12345
		System.out.println(pass);
		
		// Sending Test Data from Excel to WebElement
		txt_email.sendKeys(email);
		txt_pass.sendKeys(pass);
		
		// we can add numeric value only by using following code :
		double num=wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();     //0,2------>123
		System.out.println(num);    //123.0
		
		// convert String value into Numeric way1
		String str1=String.valueOf(num);
		System.out.println(str1);
		
		String str2=str1.replace(".0", "");       //123
		System.out.println(str2);
		
		// convert String value into Numeric way2 add single quote in excel data frome of data it makes numeric value as String 
		//String str=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();		//0,1 ---->12345
		//System.out.println(str);
		
		//txt_email.sendKeys(email);
		//txt_pass.sendKeys(str2);
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
		driver.close();	
	}
}
