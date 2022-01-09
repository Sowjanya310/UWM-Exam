package Exam.UWM;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class registrationForm {
	
	
	@Test
    public void fillForm() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.jotform.com/formtemplates/class-registration-3");
		
       By studentFirstName= By.id("first_4");
       By studentMiddleName= By.id("middle_4");
       By studentLastName= By.id("last_4");
       By email=By.id("input_6");
       By coursesid=By.id("input_46");
       By submit=By.id("input_20");
       
       if(driver.findElement(studentFirstName).isDisplayed())
       {
    	   driver.findElement(studentFirstName).sendKeys("Sowjanya");
       }
       if(driver.findElement(studentMiddleName).isDisplayed())
       {
    	   driver.findElement(studentMiddleName).sendKeys("Chowdary");
       }
       if(driver.findElement(studentLastName).isDisplayed())
       {
    	   driver.findElement(studentLastName).sendKeys("Namala");
       }
       if(driver.findElement(email).isDisplayed())
       {
    	   driver.findElement(email).sendKeys("sowjanyanamala3@gmail.com");
       }
       if(driver.findElement(coursesid).isDisplayed())
       {
       Select courses= new Select(driver.findElement(coursesid));
        courses.selectByValue("Math 101");
       }
       
       driver.findElement(submit).click();
       
       String actualTitle=driver.getTitle();
       String expectedTitle=" https://www.jotform.com/formtemplates/class-registration-3";
       
       Thread.sleep(20000);
       
       Assert.assertEquals(expectedTitle, actualTitle);
       
       
		
	
	}

}
