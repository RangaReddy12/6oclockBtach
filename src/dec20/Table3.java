package dec20;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table3 {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
	//store table
		WebElement table=driver.findElement(By.className("dataTable"));	
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println("No of rows are::"+rows.size());
for(int i=1;i<rows.size();i++)
{
	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<cols.size();j++)
	{
		String celltext=cols.get(j).getText();
		System.out.print("\n"+celltext);
		
	}
	System.out.println();
	System.out.println("=========================================");
}
driver.close();
	}

}














