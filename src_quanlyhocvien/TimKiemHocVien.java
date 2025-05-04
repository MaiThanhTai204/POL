import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimKiemHocVien {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TimKiemTheoHoVaTen();
		TimKiemTheoMaHocVien();
		TimKiemTheoTenDem();
		TimKiemTheoSoDienThoai();
		TimKiemTheoEmail();
		TimKiemTheoNgaySinh();
		TimKiemTheoDiaChi();

	}
	public static void TimKiemTheoHoVaTen() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("thanhtaiii");
	    System.out.println("Tìm thành công theo họ và tên");
	}
	public static void TimKiemTheoMaHocVien() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("22211TT0752");
	}
	public static void TimKiemTheoTenDem() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("Le Tan");
	}
	public static void TimKiemTheoSoDienThoai() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("0585767546");
	}
	public static void TimKiemTheoEmail() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("ttm@gmail.com");
	}
	public static void TimKiemTheoNgaySinh() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("02-11-2004");
	}
	public static void TimKiemTheoDiaChi() throws InterruptedException {
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
	    driver.findElement(By.id("input-39")).sendKeys("An Duong VuongAn Duong Vuong");
	}
	
}
