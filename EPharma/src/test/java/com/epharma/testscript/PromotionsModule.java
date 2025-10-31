package com.epharma.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PromotionsModule {
	@Test
public void doPromotions() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	Reporter.log("Promotions are being made",true);
	Reporter.log(driver.getTitle(),true);
	driver.quit();
}
}
