package dec16;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingArrylist {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
//get collection of windows into arraylist
ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
//switch to any specific window and get title
String pagetitle1=driver.switchTo().window(brw.get(1)).getTitle();
System.out.println("page tiltle1::"+pagetitle1);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.close();
//switch to any specific window and get title
String pagetitle2=driver.switchTo().window(brw.get(2)).getTitle();
System.out.println("page tiltle2::"+pagetitle2);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.close();
//switch to parent
driver.switchTo().window(brw.get(0));
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
Thread.sleep(5000);
driver.close();
	}

}















