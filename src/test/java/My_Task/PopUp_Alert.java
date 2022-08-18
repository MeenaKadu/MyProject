package My_Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp_Alert {

public static void main(String[] args) throws Exception {
// Browser Opening 
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
        // Identify WebElement
		WebElement txt_FirstName= driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement txt_LastName= driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement txt_Phone= driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement txt_Email= driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement txt_Address= driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement txt_City= driver.findElement(By.xpath("//input[@name='city']"));
		WebElement txt_State= driver.findElement(By.xpath("//input[@name='state']"));
		WebElement txt_Postal= driver.findElement(By.xpath("//input[@name='postalCode']"));
		WebElement txt_Country= driver.findElement(By.xpath("//select[@name='country']"));
		WebElement txt_UserName= driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txt_Password= driver.findElement(By.xpath("//input[@name='password']"));
		WebElement txt_ConfirmPass= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		
        // Add data from ExcelSheet		
        String path="C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Excel_Data\\Data.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        String fn=wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
        txt_FirstName.sendKeys(fn);
     
        String ln=wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
        txt_LastName.sendKeys(ln);
        
        String pn=wb.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
        txt_Phone.sendKeys(pn);
        
        String eml=wb.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
        txt_Email.sendKeys(eml);
        
        String add=wb.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();
        txt_Address.sendKeys(add);
        
        String ct=wb.getSheet("Sheet2").getRow(1).getCell(5).getStringCellValue();
        txt_City.sendKeys(ct);
        
        String st=wb.getSheet("Sheet2").getRow(1).getCell(6).getStringCellValue();
        txt_State.sendKeys(st);
        
        double d=wb.getSheet("Sheet2").getRow(1).getCell(7).getNumericCellValue();
        String s1=String.valueOf(d);
        String s2=s1.replace(".0", "");
        txt_Postal.sendKeys(s2);
        
       
        String cntry=wb.getSheet("Sheet2").getRow(1).getCell(8).getStringCellValue();
        txt_Country.sendKeys(cntry);
        
        String user=wb.getSheet("Sheet2").getRow(1).getCell(9).getStringCellValue();
        txt_UserName.sendKeys(user);
       
        String pass=wb.getSheet("Sheet2").getRow(1).getCell(10).getStringCellValue();
        txt_Password.sendKeys(pass);
        
        String cnpass=wb.getSheet("Sheet2").getRow(1).getCell(11).getStringCellValue();
        txt_ConfirmPass.sendKeys(cnpass);
       
WebElement bt_Submit=driver.findElement(By.xpath("//input[@name='submit']"));
bt_Submit.click();
Thread.sleep(3000);
String str=driver.findElement(By.xpath("(//td)[31]")).getText();
System.out.println(str);

WebElement btn_sign=driver.findElement(By.xpath("//a[text()=' sign-in ']"));
btn_sign.click();
Thread.sleep(3000);

WebElement txt_un=driver.findElement(By.xpath("//input[@name='userName']"));
WebElement txt_pas=driver.findElement(By.xpath("//input[@name='password']"));

String user1=wb.getSheet("Sheet2").getRow(1).getCell(9).getStringCellValue();
txt_un.sendKeys(user1);
 
String pass1=wb.getSheet("Sheet2").getRow(1).getCell(10).getStringCellValue();
txt_pas.sendKeys(pass1);
 
WebElement bt_Submit1=driver.findElement(By.xpath("//input[@name='submit']"));
bt_Submit1.click();

String txt3=driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
System.out.println(txt3);
String txt4=driver.findElement(By.xpath("//b[text()=' Thank you for Loggin. ']")).getText();
System.out.println(txt4);

driver.close();

 	}

}

