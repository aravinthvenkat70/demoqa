package org.stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Base {
	public static WebDriver driver;
	WebElement element;

	public  void browserlaunch(String browser, String url) {

		WebDriverManager.chromedriver().setup();
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		default:
			break;
		}

	}

	public void passtext(WebElement element, String txt) {
		element.sendKeys(txt);

	}

	public String gettextfromexcel(int rowno, int cellno) throws IOException {
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\FrameDemo\\testdata\\Sundaram finance payments.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		String value = null;
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				value = format.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
			break;
		default:
			break;
		}
		return value;
	}

	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void alertok() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	
	
	public void click(WebElement element) {
		element.click();

	}
	
	public String settexttoexcel(String sheetname, int rowno, int cellno,String bookid) throws IOException {
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\FrameDemo\\testdata\\Sundaram finance payments.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet createSheet = workbook.createSheet(sheetname);
		Row createRow = createSheet.createRow(rowno);
		Cell createCell = createRow.createCell(cellno);
		createCell.setCellValue(bookid);
		FileOutputStream stream2 = new FileOutputStream(file);
		workbook.write(stream2);
		
		return bookid;
	}	
public String attribute(WebElement element,String value) {
	  String attribute = element.getAttribute(value);
	return attribute;
	  
}
public void gettext(WebElement element ) {
	String text = element.getText();
}
public void implicity(int duration) {
	driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
}
public static void drapdown(WebElement element,int index) {
	Select select = new Select(element);
	select.selectByIndex(index);
	

}

public static void drapdownvisiblebyvalue(WebElement element,String string) {
	Select select = new Select(element);
	select.selectByValue(string);
	}
public static void drapdownselectbytext(WebElement element,String string) {
	Select select = new Select(element);
	select.selectByVisibleText(string);
	

}

	
}
	