package com.alert.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = null;
		try{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.cssSelector("#OKTab > button")).click();
			Thread.sleep(5000); 
			Alert alert = driver.switchTo().alert();
			String string = alert.getText();
			alert.accept();
			
		}
		catch(Exception e){
			
		}
		finally {
			if(driver!=null)
			driver.quit();
		}
	
	
	}

}
