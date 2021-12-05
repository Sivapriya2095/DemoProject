package com.adactin.Utilits;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void getUrlLink(String url) {
		driver.get(url);

	}



	public WebElement findByPartiallLinkText(String link) {
		WebElement element = driver.findElement(By.partialLinkText(link));
		return element;
	}

	public static void buttonClick(WebElement element) {
		element.click();

	}

	public static void insertValues(WebElement element, String values) {
		element.sendKeys(values);

	}

	public static String getTextValue(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttributeName(WebElement element, String attribute) {
		String attributeName = element.getAttribute(attribute);
		return attributeName;
	}

	public static void selectInDropDownByValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectInDropDownByIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void selectInDropDownByText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public void numOfOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);

	}

	public void printAllOptionsDropDown(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}

	}

	public void printAllValueInDropDown(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String text = x.getAttribute("value");
			System.out.println(text);
		}

	}

	public boolean canSelectMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void printSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			String text = x.getText();
			System.out.println(text);
		}
	}

	public void printUnSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		options.removeAll(allSelectedOptions);
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}
	}

	public void numberUnSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		options.removeAll(allSelectedOptions);
		int size = options.size();
		System.out.println(size);
	}

	public void printFirstSelected(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

	}

	public void navigateUrl(String url) {

		driver.navigate().to(url);

	}

	public void goToPreviousPage() {
		driver.navigate().back();

	}

	public void goToForwardPa() {
		driver.navigate().forward();

	}

	public static void refreshPage() {
		driver.navigate().refresh();

	}

	public void mouseOver(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public void rightClick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();

	}

	public void doubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	public void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void confirmAlert(String option) {
		Alert alert = driver.switchTo().alert();
		if (option == "accept")
			alert.accept();
		else
			alert.dismiss();

	}

	public void insertPromptAlert(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}

	public void promptAcceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void insertValuesUsingJavaScript(WebElement element, String values) {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].setAttribute('value','" + values + "')", element);
	}

	public void clickUsingJavaScript(WebElement element) {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click()", element);
	}
	

	
	public void printAttributeValueUsingJavaScript(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		Object executeScript = jk.executeScript("return arguments[0].getAttribute", element);
		String text = (String) executeScript;
		System.out.println(text);
	}

	public void scrollUp(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void screenShot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\Core Java Task" + name + ".png");
		FileUtils.copyFile(source, destination);
	}

	public void makeWait(long millisecond) throws InterruptedException {

		Thread.sleep(millisecond);

	}

	public void switchFrameUsingString(String text) {
		driver.switchTo().frame(text);

	}

	public void switchFrameUsingElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	public void switchFrameUsingName(String name) {
		driver.switchTo().frame(name);

	}

	public void switchFrameUsingIndex(int index) {
		driver.switchTo().frame(index);

	}

	public void iFrameCount() {
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int size = elements.size();
		System.out.println(size);

	}

	public void frameCount() {
		List<WebElement> elements = driver.findElements(By.tagName("frame"));
		int size = elements.size();
		System.out.println(size);

	}

	public void switchControlOfFrame(List<WebElement> elements, int frameNum) {
		driver.switchTo().frame(frameNum);

	}

	public void numOfTableRows() {
		List<WebElement> elements = driver.findElements(By.tagName("tr"));
		int size = elements.size();
		System.out.println(size);
	}

	public void numOfTableData() {
		List<WebElement> elements = driver.findElements(By.tagName("td"));
		int size = elements.size();
		System.out.println(size);
	}

	public void viewDataInTable() {
		List<WebElement> elements = driver.findElements(By.tagName("td"));
		for (WebElement x : elements) {
			String text = x.getText();
			System.out.println(text);
		}
	}

	public void ifDataInTable(String inputData) {
		List<WebElement> elements = driver.findElements(By.tagName("tr"));

		for (WebElement x : elements) {
			List<WebElement> data = driver.findElements(By.tagName("td"));
			for (WebElement y : data) {
				String text = y.getText();
				if (text.equals(inputData)) {
					System.out.println(text + "is Present");
				}
			}
		}

	}

	public void goToWindow(String url) {
		driver.switchTo().window(url);

	}

	public void goToWindowUsingTitle(String title) {
		driver.switchTo().window(title);

	}

	public void goToWindowUsingId(String id) {
		driver.switchTo().window(id);
		

	}

	public String getParentWindowId() {
		String parentId = driver.getWindowHandle();
		return parentId;

	}

	public void getAllWindowId() {

		Set<String> handles = driver.getWindowHandles();
		for (String id : handles) {
			System.out.println(id);
		}

	}

	public void goToParentWindow() {
		driver.switchTo().defaultContent();

	}

	public void goToChildWindow(int index) {
		Set<String> handles = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(handles);
		driver.switchTo().window(li.get(index));
	}


}
