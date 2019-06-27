package com.Class28;
/*
 * Create a WebDriver Interface that will have the following unimplemented behaviour: 
 * openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
 * Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {	
		System.out.println("Chrome open browser");
	}

	@Override
	public void closeBrowser() {	
		System.out.println("Chrome close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome maximize window");
	}

	@Override
	public void findElement() {	
		System.out.println("Chrome find element");
	}	
}

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox maximize window");
	}

	@Override
	public void findElement() {
		System.out.println("Firefox find element");
	}
	
}
