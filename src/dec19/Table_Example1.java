package dec19;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table_Example1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///D:/qedgetable.html");
	driver.manage().window().maximize();
	//get data from table
String tabletext=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
System.out.println(tabletext);
//store table into webelement
WebElement table=driver.findElement(By.name("qedgetech"));
//get collection of rows in a table
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println("No of Rows are::"+rows.size());
for(int i=1;i<rows.size();i++)
{
	//get collectiuon of columns in rows
List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
System.out.println("No of rows::"+i+"   "+"No of column in each row::"+cols.size());
}
driver.close();
	}
}

