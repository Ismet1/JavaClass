package com.Class29;

//class'tan class'a ve interfaceten interface'e extends yapiyoruz
//classtan interface'e yada interface'ten class'a implement kullaniyoruz. Uzanti yapmak icin.
//extend bir class icin yada bir interface icin kullanilir sadece, implement biirden fazla class yada interface icin kullanilabilir.

public interface WebDriver extends TakesShreenShot, Executes{
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();

}
//Bu class'lar kumesinde webdriver iki yapinin icerisinde;
//WebDriver=ChromeDriver+FirefoxDriver(Hiearhical relation=1 parent 2 child)
//Browser=WebDriver>FirefoxDriver(Multiple relation=2 parent, 1 child)