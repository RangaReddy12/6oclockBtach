package dec16;
import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAllwindows {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		String parent=driver.getWindowHandle();
//store collection of windows
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		Iterator<String>x=brw.iterator();
		while(x.hasNext())
		{
			String child=x.next();
		if(!parent.equals(child))
		{
		//swicht to child window
		String pagetitle=driver.switchTo().window(child).getTitle();
		System.out.println(pagetitle);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		}
		}
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		Thread.sleep(5000);
driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		Thread.sleep(5000);
		driver.close();	
	}

}












