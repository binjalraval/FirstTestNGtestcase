import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class HomeworkScript_1 {
    WebDriver driver;


    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser");
        System.setProperty("webdriver.edge.driver", "/Users/binjalraval/Downloads/driver/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 2)
    void selectProduct() {
        System.out.println("Select Product");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/thead/tr/th[5]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 3)
    void  billingAddress(){
        System.out.println("Billing Address");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]")).sendKeys("Chikadu");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]")).sendKeys("Raval");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("birvira@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Company\"]")).sendKeys("UnifyTesting");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("Leicester");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("9-London Road");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("Le18 1ft");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("07878787877");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"shippingoption_0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"paymentmethod_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"CreditCardType\"]")).sendKeys("Visa");
        driver.findElement(By.xpath("//*[@id=\"CardholderName\"]")).sendKeys("Binjal Raval");
        driver.findElement(By.xpath("//*[@id=\"CardNumber\"]")).sendKeys("4921819597957466");
        driver.findElement(By.xpath("//*[@id=\"ExpireMonth\"]")).sendKeys("06");
        driver.findElement(By.xpath("//*[@id=\"ExpireYear\"]")).sendKeys("2026");
        driver.findElement(By.xpath("//*[@id=\"CardCode\"]")).sendKeys("359");
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();

    }
}


    //    driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")).click();
     //   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
     //   driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
      //  driver.findElement(By.xpath("//*[@id=\"itemquantity11229\"]")).click();
      //  driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")).click();
      //  driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
      //  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();


//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select")).sendKeys("United Kingdom");



