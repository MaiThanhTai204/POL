import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XoaHocVien {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		NhanVaoNutHuyThanhCong();
//		NhanVaoNutXoaThanhCong();
		NhanVaoNutXacNhanXoaThanhCong();

	}
	public static void NhanVaoNutHuyThanhCong() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//đăng nhập
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/trang-chu");
		
		driver.findElement(By.id("input-10")).sendKeys("admin@elearning.plt");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-13")).sendKeys("plt-solutions-admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/div/div[3]/form/div[2]/button/span")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"v-main-app\"]/div/div/div/div[1]/div[1]/table/tbody/tr[1]/td[10]/button[2]/span/i")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/button[1]/span")).click();
	    System.out.println("Hủy thành công");
	}
	public static void NhanVaoNutXoaThanhCong() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//đăng nhập
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/trang-chu");
		
		driver.findElement(By.id("input-10")).sendKeys("admin@elearning.plt");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-13")).sendKeys("plt-solutions-admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/div/div[3]/form/div[2]/button/span")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"v-main-app\"]/div/div/div/div[1]/div[1]/table/tbody/tr[1]/td[10]/button[2]/span/i")).click();
	    System.out.println("Nhấn vào nút xóa thành công");
	}
	public static void NhanVaoNutXacNhanXoaThanhCong() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//đăng nhập
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/trang-chu");
		
		driver.findElement(By.id("input-10")).sendKeys("admin@elearning.plt");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-13")).sendKeys("plt-solutions-admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/div/div[3]/form/div[2]/button/span")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"v-main-app\"]/div/div/div/div[1]/div[1]/table/tbody/tr[2]/td[10]/button[2]")).click();
		   Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/button[2]/span")).click();
	    System.out.println("Nhấn vào nút xác nhận xóa thành công");
	}

}
