package dec13;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountingCheckboxes {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///D:/checkbox_1.html");
		driver.manage().window().maximize();
		//get collection of checkboxes
	List<WebElement>chklist=driver.findElements(By.tagName("input"));
	System.out.println("no of checkboxes are::"+chklist.size());
	for(int i=0;i<chklist.size();i++)
	{
	//verify checkbox is true or false
	boolean value=chklist.get(i).isSelected();
	System.out.println(value);
	String chkname=chklist.get(i).getAttribute("value");
	System.out.println("chk name::"+chkname);
	if(!chklist.get(i).isSelected())
	{
		//uncheck checkbox
		chklist.get(i).click();
	}
	else
	{
	//check checklbox
	chklist.get(i).click();
	}
	Thread.sleep(5000);
	}
	Thread.sleep(5000);
	driver.close();
	}

}













