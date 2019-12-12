package dec11;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class VerifyItem {
public static void main(String[] args) throws Throwable {
		String Expitem="india";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
Select element=new Select(driver.findElement(By.id("searchDropdownBox")));

List<WebElement>items=element.getOptions();
System.out.println("no of items are::"+items.size());
for(int i=0;i<items.size();i++)
{
	String itemlist=items.get(i).getText();
	Thread.sleep(2000);
	System.out.println(itemlist);
	//verify expcountry exist in itemlist
	if(Expitem.equalsIgnoreCase(itemlist))
	{
		itemexist=true;
		break;
	}
	}
if(itemexist)
{
System.out.println("Item found in listbox::"+Expitem);
}
else
{
	System.out.println("Item Not found in listbox::"+Expitem);
}
Thread.sleep(5000);
driver.close();
	}

}













