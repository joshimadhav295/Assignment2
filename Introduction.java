package newAssignment2;


		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Introduction {

		    public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.myntra.com");
		        
		        Thread.sleep(3000);

		        driver.quit();
		    }
		
	}


