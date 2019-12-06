package com.dec4;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Using_Firefox {
public static void main(String[] args)throws Throwable {
//launch chrome browser
FirefoxDriver driver=new FirefoxDriver();	
//launch url in a browser
driver.get("http://orangehrm.qedgetech.com");
driver.manage().window().maximize();
Thread.sleep(5000);
//enter username 
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
Thread.sleep(5000);
//enter password
driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
Thread.sleep(5000);
//click on login
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
driver.close();

	}

}








