package com.alert.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Confirmation_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		try{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(2) > a")).click();
			driver.findElement(By.cssSelector("#CancelTab > button")).click();
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			String string = alert.getText();
			System.out.println(string);
			Thread.sleep(5000);
			alert.accept();
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(driver!=null)
			driver.close();	
		}
	}

}
