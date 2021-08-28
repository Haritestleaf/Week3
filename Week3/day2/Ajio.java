package Week3.day2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"))
				.click();
		List<WebElement> BrandOfBags = driver.findElementsByXPath("//div[@class='brand']");
		System.out.println(BrandOfBags.size());
		System.out.println("*************BrandNames************");
		for (WebElement webElement1 : BrandOfBags) {
			String name = webElement1.getText();
			System.out.println(name);
		}
		System.out.println("*************BagNames************");
		List<WebElement> NameOfBag = driver.findElementsByXPath("//div[@class='name']");
		for (WebElement webElement2 : NameOfBag) {

			String name1 = webElement2.getText();
			System.out.println(name1);

		}

	}

}
