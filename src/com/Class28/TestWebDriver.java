package com.Class28;

public class TestWebDriver {

	public static void main(String[] args) {
		WebDriver wb=new ChromeDriver();
		wb.openBrowser();
		wb.closeBrowser();
		wb.maximizeWindow();
		wb.findElement();
		
		WebDriver wb1=new FirefoxDriver();
		wb1.openBrowser();
		wb1.closeBrowser();
		wb1.maximizeWindow();
		wb1.findElement();
	}

}
