package com.alert.example;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://seleniumwebdriverfaq.tumblr.com/");
		//driver.findElement(By.xpath("htlm/body/div[4]/div/a[1]/strong")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/a[1]/span")).click();
		Set<String> windows = driver.getWindowHandles();
		Collection<String> count = driver.getWindowHandles();
		System.out.println(count);
		System.out.println("Alphanumeric code of windows" + windows);
		for(String string1:driver.getWindowHandles()){
			driver.switchTo().window(string1);
			System.out.println("switch to next window"+string1);
			}
		for(String string2:driver.getWindowHandles()){
			driver.switchTo().window(string2);
			System.out.println("switch to next window"+string2);
			}
		driver.quit();
	}
}
