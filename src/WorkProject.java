import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class WorkProject extends Parameter {
//run each test alone 
//if it nessery run the ssign in with the test 
	
	SoftAssert myassert =new SoftAssert();
	//1 pass 
//	 @Test( )
//	public void SignUpTest() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Raneem");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Emran");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("raneemyacoub1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("emran2002#*");
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("emran2002#*");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//	
//		////////////////////after its logged in 
//		WebElement classname = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
//		String expected="message-success";
//		String actual=classname.getAttribute("data-ui-id");
//		myassert.assertEquals(actual, expected);
//		myassert.assertAll();
//	
//       //or to verfiy creating account you can log in 
//  //driver.get("https://magento.softwaretestingboard.com/");	
//	driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("raneemyacoub1@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("emran2002#*");
//	driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//	Thread.sleep(3000);
//	String actual1=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span")).getAttribute("class");
//	String expected1="logged-in";
//	myassert.assertEquals(actual1, expected1);
//	myassert.assertAll();
//
//		
//	}
	

	
	// its pass // for log in
//	@Test(priority = 1)
//	public void AsignIn() {
//		
//		 WebElement login=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"));
//			//String str=login.getAttribute("class");
//			//if (str.equals("not-logged-in")==false) {
//				driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("raneemyacoub1@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("emran2002#*");
//				driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//	}


	
	
	
	
	
	//2 pass
//	@Test()
//	public void RandSearch() {
//		
//		
//		
//		String [] search={"Jacket", "t-shirt", "jeans for men", "jeans for women","pants"}; 
//		Random rand=new Random();
//		int randnum= rand.nextInt(5);
//		driver.findElement(By.cssSelector("#search")).sendKeys(search[randnum]+Keys.ENTER);
//		System.out.println(search[randnum]);
//		
//		
//	}
	
	
	
	
	//3 run this test with assign in
	//run each element alone
//	@Test (priority = 2)
//	public void addItems() throws InterruptedException {  
//
//		List <WebElement> element  =driver.findElements(By.className("product-item-info"));
//		//System.out.println(element.get(5).getText());//the last one 
//
//			String size[]= {
//					"#option-label-size-143-item-166",
//					"#option-label-size-143-item-167",
//					"#option-label-size-143-item-168",
//					"#option-label-size-143-item-169",
//					"#option-label-size-143-item-170"};
//			Random rand=new Random();
//	        int sizenum=rand.nextInt(0,4);
//	        // element 1
//	     element.get(0).click();
//    	 Thread.sleep(6000);
//
//	     for(int i=0;i<3;i++) {
//	    driver.findElement(By.cssSelector( size[sizenum])).click();
//	      String ar[]= {"//*[@id=\"option-label-color-93-item-50\"]",
//	    		 "//*[@id=\"option-label-color-93-item-56\"]",
//	    		 "//*[@id=\"option-label-color-93-item-57\"]"};
//	      int col=rand.nextInt(0,2);
//	      driver.findElement(By.xpath(ar[col])).click();
//	      driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//	      Thread.sleep(3000);
//	     
//	     }
//		driver.navigate().back();
//		
//		 //element
//		 element.get(1).click();
//    	 Thread.sleep(6000);
//
//	     for(int i=0;i<2;i++) {
//	    driver.findElement(By.cssSelector( size[sizenum])).click();
//	      String ar[]= {"//*[@id=\"option-label-color-93-item-57\"]",
//	    		 "//*[@id=\"option-label-color-93-item-59\"]",
//	    		 "//*[@id=\"option-label-color-93-item-60\"]"};
//	      int col=rand.nextInt(0,2);
//	      driver.findElement(By.xpath(ar[col])).click();
//	      driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//	      Thread.sleep(3000);
//	     
//	     }
//		driver.navigate().back();
//		
//		//element 3
//		 element.get(2).click();
//    	 Thread.sleep(6000);
//
//	     for(int i=0;i<4;i++) {
//	    driver.findElement(By.cssSelector( size[sizenum])).click();
//	      driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-52\"]")).click();
//	      driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//	      Thread.sleep(3000);
//	     
//	     }
//		driver.navigate().back();
//		
//		//element 4
//		element.get(3).click();
//   	 Thread.sleep(6000);
//     for(int i=0;i<1;i++) {
// 	    driver.findElement(By.cssSelector( size[sizenum])).click();
// 	      String ar[]= {"//*[@id=\"option-label-color-93-item-49\"]",
// 	    		 "//*[@id=\"option-label-color-93-item-52\"]",
// 	    		 "//*[@id=\"option-label-color-93-item-53\"]"};
// 	      int col=rand.nextInt(0,2);
// 	      driver.findElement(By.xpath(ar[col])).click();
// 	      driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
// 	      Thread.sleep(3000);
// 	     
// 	     }
// 		driver.navigate().back();
// 		//element 5
// 		element.get(4).click();
// 	   	 Thread.sleep(6000);
// 	     for(int i=0;i<5;i++) {
// 	 	      driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/form/div/div/div[2]/button/span")).click();
// 	 	      Thread.sleep(3000);
// 	 	     
// 	 	     }
// 	 		driver.navigate().back();
// 	 		
//	}
	
	
	
	
	//4
//	public void checkout() {
//
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("raneemyacoub1@gmail.com");
//     	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("emran2002#*");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click(); 
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
////		 JavascriptExecutor executor = (JavascriptExecutor) driver;
////		 executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")));
//
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/span[2]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//        
//		driver.findElement(By.cssSelector("input[name='street[0]']")).sendKeys("Jawa");
//		driver.findElement(By.name("street[1]")).sendKeys("shar3");
//		driver.findElement(By.name("street[2]")).sendKeys("34");
//
//		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Amman");
//		driver.findElement(By.cssSelector("input[name='postcode']")).sendKeys("11592");
//		
//	
//		Select myselect=new Select(driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")));   ////input[@name='region_id']
//		myselect.selectByIndex(3);
//		
//		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("00962776289700");
//		Select myselect2=new Select(driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select")));
//		myselect2.selectByIndex(3);
//
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input")).sendKeys(Keys.ENTER);
//
//		
//	}
		
	
	//5 ...run with test 4
//	@Test(priority=2)
//	public void checkprice() {
//		
//
//		String totaltext=driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/aside/div[2]/div/div/div[1]/table/tbody/tr[3]/td/strong/span")).getText();
//		double total=Double.parseDouble(totaltext.replace("$", ""));
//	//	System.out.println(total);
//		
//		String subtotaltext=driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/aside/div[2]/div/div/div[1]/table/tbody/tr[1]/td/span")).getText();
//		double subtotal=Double.parseDouble(subtotaltext.replace("$",""));
//		
//		String shippingtext=driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/aside/div[2]/div/div/div[1]/table/tbody/tr[2]/td/span")).getText();
//		double shipping=Double.parseDouble(shippingtext.replace("$", ""));
//		
//		myassert.assertEquals(total, subtotal+shipping, 0);
//		myassert.assertAll();
//	}
	
	
	
	//6
//	@Test()
//	public void ReOrder() {
//	    //note : i order 1 element cause the process of reorder isnt different if the orders alot or less ...just to try  
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("raneemyacoub1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("emran2002#*");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		
//	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//		//System.out.println(driver.getPageSource());
//		
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
//		
//		for(int i=0;i<5;i++) {
//			
//            driver.findElement(By.cssSelector("#my-orders-table > tbody > tr > td.col.actions > a.action.order > span")).click();
//           
//			driver.navigate().back();
//		}
//		driver.navigate().refresh();
//		String actual=driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/span[2]/span[1]")).getText();
//		String expected = "5";//can change 
//		myassert.assertEquals(actual, expected);
//		myassert.assertAll();
//	}
	
	
	//7
//	@Test()
//	public void invoices() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("roroem79@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("raneem2002#*");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
//		
//		String totaltext =driver.findElement(By.cssSelector("#my-orders-table > tbody > tr:nth-child(1) > td.col.total > span")).getText();
//		double total=Double.parseDouble(totaltext.replace("$", ""));
//		
//		driver.findElement(By.cssSelector("#my-orders-table > tbody > tr:nth-child(1) > td.col.actions > a.action.view")).click();
//		
//		double radiant=22.00;
//		double argus=22.00;
//		double hero=54.00;
//		double bag=45.00;
//		double breath=34.00;
//		double oneprice=radiant*3+argus*4+hero+bag*5+breath*2;
//		String subtotaltext=driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[2]/div[2]/table/tfoot/tr[1]/td/span")).getText();
//		double subtotal=Double.parseDouble(subtotaltext.replace("$", ""));
//		String shippingtext=driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[2]/div[2]/table/tfoot/tr[2]/td/span")).getText();
//		double shipping =Double.parseDouble(shippingtext.replace("$", ""));
//		String discounttext=driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[2]/div[2]/table/tfoot/tr[3]/td/span")).getText();
//		double discount=Double.parseDouble(discounttext.replace("$", ""));
//		myassert.assertEquals(subtotal, oneprice, 0.0);
//		subtotal+=(discount+shipping);
//	    myassert.assertEquals(total, subtotal, 0.0);
//		myassert.assertAll();
//		
//		//with discount .....if the same price of expected and actual then after discount is the same 
//		
//	}
	
	
	// :)
	
}
