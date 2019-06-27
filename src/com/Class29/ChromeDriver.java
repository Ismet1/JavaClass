package com.Class29;

public class ChromeDriver extends Browser implements WebDriver, Report{

	//class'tan class'a ve interfaceten interface'e extends yapiyoruz
	//classtan interface'e yada interface'ten class'a implement kullaniyoruz. Uzanti yapmak icin.
	//extend bir classtan class'a bagda bir class icin kullanilir sadece
	//implement biirden fazla class yada interface icin kullanilabilir.
	
	@Override
	public void openBrowser() {
		System.out.println("Opening chrome browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing chrome browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing chrome browser");
	}

	@Override
	public void findElement() {
		System.out.println("Find element in chrome browser");
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh firefox browser");
	}

	@Override
	public void getReport() {
		System.out.println("Report from chrome browser");
	}

	@Override
	public void takesScreenShot() {
		System.out.println("Takin schreenshot in chrome browser");
	}

	@Override
	public void execute() {
		System.out.println("executing code in chrome browser");
	}
}
