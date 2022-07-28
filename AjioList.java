package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) {
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("https://www.ajio.com/");

		//Maximize the window
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");

		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();

		//To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-genderfilter')])[2]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();


		// Print the count of the items Found. 
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Items found: "+count);

		// Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> prod = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String>brandName = new ArrayList<String>();
		for (WebElement string : prod) {
			String brands = string.getText();
			brandName.add(brands);
		}
		System.out.println("List of Brand Names: "+brandName);

		// Get the list of names of the bags and print it
		List<WebElement> bagList = driver.findElements(By.className("nameCls"));
		System.out.println("BAG NAMES:");
		for (WebElement bag : bagList) {
			String bagName = bag.getText();
			System.out.println(bagName);
		}
	}

}
