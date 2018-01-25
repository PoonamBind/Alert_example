package com.alert.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(3) > a")).click();
			driver.findElement(By.cssSelector("#Textbox>button")).click();
			/*
			driver.findElement(By.xpath(".//*[@class='active']/a[@class='analystic']")).click();
			driver.findElement(By.xpath(".//*[@id='Textbox']/button[@class='btn btn-info']")).click();
			*/
			Thread.sleep(5000); //TODO Poonam - will fix later
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("hello  poo");
			String AlertText = alert.getText();
			System.out.println(AlertText);
			Thread.sleep(5000);	
			alert.accept();
		}
		catch(Exception e){
			
		}
		finally {
			if(driver!=null)
			driver.close();	
		}
		
		
		
	}

}
