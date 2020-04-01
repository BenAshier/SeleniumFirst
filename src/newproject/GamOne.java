package newproject;


// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
// import org.openqa.selenium.support.ui.Select;
// import java.util.concurrent.TimeUnit;


public class GamOne {
    public static <string> void main(String[] args) throws InterruptedException {

     //System.setProperty("webdriver.gecko.driver","/Users/ben/Documents/firefoxdriver/geckodriver");
     System.setProperty("webdriver.chrome.driver", "/Users/ben/Documents/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        new Actions(driver);

       //open web page and enter access data
        driver.get("http://www.google.de");
        
        // driver.findElement(By.id("chooseSM")).click();

        /*  select a game from DropDown
        Select drpSlots = new Select(driver.findElement(By.id("chooseSM")));
        drpSlots.selectByVisibleText("Black Beauty");

        // click a link to launch a game

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Komplett-Auto-Erkennung")).click();

        // select cheat from DropDown

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Select drpCheat = new Select(driver.findElement(By.id("cheatModus")));

        System.out.println("dropCheat gefunden");

        try {
            Thread.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }



        try {
            Thread.sleep(1000); //1000 milliseconds is one second.

            drpCheat.selectByValue("1");

            System.out.println("Value 1 selected");

        } catch(InterruptedException ex) {
            System.out.println("Value 1 nicht selected");
        }
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // find SPIN Button by Xpath and click it

        try {
            // WebElement element = driver.findElement(By.xpath("//div[5]/div[2]/div/div/div[2]/div"));
            WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]"));
            element.click();
            System.out.println("Click SPIN");
            Thread.sleep(5000);


        } catch (Exception e) {
            System.out.println("Element by XPATH nicht gefunden");
        }



      //  WebElement element = driver.findElement(By.className("versionDisplay hidden"));
      //  System.out.println(element.getText());
*/
        driver.close();
        System.out.println("driver closed");


        System.out.println("bye");

        System.exit(0);



    }
}
