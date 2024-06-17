package Mainmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class MainClass {


	public static void Login(String user,String pass,WebDriver driver) {
		
		WebElement Uname = driver.findElement(By.xpath("//input[@name='username']"));
		Uname.click();
		Uname.sendKeys(user);
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.click();
		Password.sendKeys(pass);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		if(!user.equals("Admin"))
		{
			Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed());
		}
	}
	
	public static void Login2(String user,String pass,WebDriver driver) {
		
		WebElement Uname = driver.findElement(By.xpath("//input[@name='username']"));
		Uname.click();
		Uname.sendKeys(user);
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.click();
		Password.sendKeys(pass);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		if(!user.equals("Admin"))
		{
			Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed());
		}
	}

	public  static void operation(WebDriver driver,String text){
		
		   driver.findElement(By.xpath("//span[text()='Admin']")).click();
		   driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		  

		   driver.findElement(By.xpath("//label[text()='User Role']//parent::div[@class='oxd-input-group__label-wrapper']//parent::div//div[@class='oxd-select-wrapper']")).click();
		   driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]")).click();
		   
		   WebElement auto =driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		   auto.click();
		   auto.sendKeys("r");
		   driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).click();
		   driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]")).click();
		   driver.findElement(By.xpath("//label[text()='Status']//parent::div[@class='oxd-input-group__label-wrapper']//parent::div//div[@class='oxd-select-wrapper']")).click();
		   driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]")).click();
		   WebElement Username= driver.findElement(By.xpath("//label[text()='Username']//parent::div[@class='oxd-input-group__label-wrapper']//parent::div//input"));
		   Username.click();
		   Username.sendKeys(text);
		   WebElement pass= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		   pass.sendKeys("pass123456");
		   WebElement conpass= driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		   conpass.sendKeys("pass123456");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
	}
	
	public static void check_delete(WebDriver driver,String text) throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='"+text+"']//parent::div//parent::div//div[@class='oxd-table-card-cell-checkbox']")).click();
        Thread.sleep(5000);
        
       if( driver.findElement(By.xpath("//button[text()=' Delete Selected ']")).isDisplayed())
       {
     	
     	System.out.println("$$$$$$$$$$$$");  

       }
  	 driver.findElement(By.xpath("//button[text()=' Delete Selected ']")).click();
  	 driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
	}
	
	public static void logout(WebDriver driver) {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
