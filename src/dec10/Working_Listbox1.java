package dec10;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Working_Listbox1 {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/r.php");
		driver.manage().window().maximize();
	//store month listbox into select class
Select monthlist=new Select(driver.findElement(By.id("month")));
//verify month list is single or multi selection
boolean value=monthlist.isMultiple();
System.out.println(value);
//store year listbox into select class
Select yearlist=new Select(driver.findElement(By.id("year")));
//verify month list is single or multi selection
boolean value1=yearlist.isMultiple();
System.out.println(value1);
//select one item in month listbox
monthlist.selectByVisibleText("Jul");
Thread.sleep(5000);
//select one item in year listbox
yearlist.selectByVisibleText("1989");
Thread.sleep(5000);
//select one item in year listbox using value
yearlist.selectByValue("1978");
Thread.sleep(5000);
//select one item in month listbox using index
monthlist.selectByIndex(10);//selecting tenth item
System.out.println(monthlist.getFirstSelectedOption().getText());
Thread.sleep(5000);
//select one item in year listbox using index
yearlist.selectByIndex(78);//selecting 78 item in listbox
System.out.println(yearlist.getFirstSelectedOption().getText());
driver.close();
	}
}
















