package All_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		
		// Browser open
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.instagram.com/accounts/login/");
				driver.manage().window().maximize();
				
				String title=driver.getTitle();
				System.out.println(title);         //  Instagram -log in or sign up
				
				String url=driver.getCurrentUrl();    // https://www.instagram.com/accounts/login/
				System.out.println(url);
				
				driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-ISMq8uV-QIVT5pmAh0PBAeiEAAYASAAEgIPcPD_BwE");
				Thread.sleep(5000);     // 5 sec
				
			driver.navigate().back();
			Thread.sleep(5000);        // 5 sec
			
			driver.navigate().forward();
			Thread.sleep(5000);       // 5 sec
			
			driver.navigate().refresh();
			
			
			driver.close();

	}

}
