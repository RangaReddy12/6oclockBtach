package dec13;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButtonsCounting {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().window().maximize();	
		
//get collection of radio buttons
List<WebElement>rdlist=driver.findElements(By.xpath("//form/nav/ul/li/label/strong"));
System.out.println("no of radio buttons are::"+rdlist.size());
for(int i=0;i<rdlist.size();i++)
{
	System.out.println(rdlist.get(i).getText());
	if(!rdlist.get(i).isSelected())
	{
	rdlist.get(i).click();
	}
Thread.sleep(5000);
	}
Thread.sleep(5000);
driver.close();
	}

	}








