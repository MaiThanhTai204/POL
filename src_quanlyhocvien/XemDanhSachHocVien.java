import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XemDanhSachHocVien {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		XemDSHVKhiThemThanhCong();
		XemDSHVKhiSuaThanhCong();
		XemDSHVKhiXoaThanhCong();
		XemDSHVKhiDangNhapThanhCong();
	}
	public static void XemDSHVKhiThemThanhCong() throws InterruptedException {
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
		//nhập dữ liệu để thêm học viên
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtaiii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
//		3-12 KÝ TỰ
		driver.findElement(By.name("student_code")).sendKeys("22211TT0739");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttym@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("0585767566");
		Thread.sleep(1000);
		driver.findElement(By.name("dob")).sendKeys("02112004");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/form/div[1]/div/div[6]/div/div/div[1]/div/div[1]/div/div")).click();
		Thread.sleep(1000);
		//gioi tinh nu
//	driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/form/div[1]/div/div[6]/div/div/div[1]/div/div[2]/div/div")).click();
//		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys("An Duong Vuong");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		Thread.sleep(2000);
//		quay lại xem dshv
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/hoc-vien");
		System.out.println("Xem Thành công");
	}
	public static void XemDSHVKhiSuaThanhCong() throws InterruptedException {
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
		//nhập dữ liệu để thêm học viên
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"v-main-app\"]/div/div/div/div[1]/div[1]/table/tbody/tr[1]/td[10]/button[1]/span/i")).click();
		Thread.sleep(1000);
//		sua tên
		Actions actions= new Actions(driver);
//		click vào ô họ và tên
		driver.findElement(By.name("full_name")).click();
//		ctrl a
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("A");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
//		ctrl x để xóa
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("X");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
	Thread.sleep(1000);
	WebElement fullName= driver.findElement(By.name("full_name"));
	fullName.sendKeys("thanhthanh");
	Thread.sleep(1000);
	
	
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		System.out.println("Cập nhật dữ liệu thành công!");
//		quay lại xem dshv
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/hoc-vien");
		System.out.println("Xem Thành công");
	}
	public static void XemDSHVKhiXoaThanhCong() throws InterruptedException {
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
		   driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/div[1]/table/tbody/tr[1]/td[10]/button[2]")).click();
		   Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/button[2]/span")).click();
//	    System.out.println("Nhấn vào nút xác nhận xóa thành công");
//		quay lại xem dshv
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/hoc-vien");
		System.out.println("Xem Thành công");
	}
	public static void XemDSHVKhiDangNhapThanhCong() throws InterruptedException {
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
	   
	    System.out.println("Xem thành công");
	}
}
