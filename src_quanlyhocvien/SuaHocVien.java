
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SuaHocVien {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		TruongHopNhapHopLe();
//		TruongHopDeTrongBatKyTruongDuLieuBatBuoc();
//		TruongHopNhapItHon6KyTu();
		
//		TruongHopNhapKyTuSoHoacKyTuDacBietOTruongHoVaTen();
//		TruongHopNhapSaiDinhDangEmail();
//		TruongHopNhapSaiSoDienThoai();
		
//		TruongHopNhapMSSVVuotQua12KyTu();
//		TruongHopNhapMSSVDuoi6KyTu();
//		TruongHopNhapMSSVDaTonTai();
//		TruongHopNhapSoDienThoaiDaTonTai();
		TruongHopNhapEmailDaTonTai();
	}
	public static void TruongHopNhapMSSVVuotQua12KyTu() throws InterruptedException {
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
		Actions actions= new Actions(driver);
//		click vào ô họ và tên
		driver.findElement(By.name("student_code")).click();
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
		driver.findElement(By.name("student_code")).sendKeys("22211TT29522222");
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span")).click();
		
		Thread.sleep(1000);
		
	}
	public static void TruongHopNhapMSSVDuoi6KyTu() throws InterruptedException {
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
		Actions actions= new Actions(driver);
//		click vào ô họ và tên
		driver.findElement(By.name("student_code")).click();
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
		driver.findElement(By.name("student_code")).sendKeys("22212");
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span")).click();
		
		Thread.sleep(1000);
		
	}
	public static void TruongHopNhapMSSVDaTonTai() throws InterruptedException {
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
		Actions actions= new Actions(driver);
//		click vào ô họ và tên
		driver.findElement(By.name("student_code")).click();
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
		driver.findElement(By.name("student_code")).sendKeys("22211TT0752");
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span")).click();
		
		Thread.sleep(1000);
		
	}
	
	public static void TruongHopNhapSoDienThoaiDaTonTai() throws InterruptedException {
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
		Actions actions= new Actions(driver);
//		click vào ô họ và tên
		driver.findElement(By.name("phone")).click();
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
		driver.findElement(By.name("phone")).sendKeys("05857675946");
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span")).click();
		
		Thread.sleep(1000);
		
	}
	public static void TruongHopNhapEmailDaTonTai() throws InterruptedException {
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
		Actions actions= new Actions(driver);
//		click vào ô họ và tên
		driver.findElement(By.name("email")).click();
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
		driver.findElement(By.name("email")).sendKeys("tthm@gmail.com");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span")).click();
		
		Thread.sleep(1000);
		
	}
	
	public static void TruongHopNhanNutHuyThanhCong() throws InterruptedException {
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
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/form/div[2]/button[1]/span")).click();
	Thread.sleep(1000);
	
		
		
	}
	public static void TruongHopNhapHopLe() throws InterruptedException {
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
	
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		System.out.println("Cập nhật dữ liệu thành công!");
	}
	
	public static void TruongHopDeTrongBatKyTruongDuLieuBatBuoc() throws InterruptedException {

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
	
	driver.findElement(By.name("student_code")).click();
	Thread.sleep(1000);
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("A");
	actions.keyUp(Keys.CONTROL);
	actions.build().perform();
//	ctrl x để xóa
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("X");
	actions.keyUp(Keys.CONTROL);
	actions.build().perform();
	driver.findElement(By.name("email")).click();
	Thread.sleep(1000);
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("A");
	actions.keyUp(Keys.CONTROL);
	actions.build().perform();
//	ctrl x để xóa
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("X");
	actions.keyUp(Keys.CONTROL);
	actions.build().perform();
	driver.findElement(By.name("phone")).click();
	Thread.sleep(1000);
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("A");
	actions.keyUp(Keys.CONTROL);
	actions.build().perform();
//	ctrl x để xóa
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("X");
	actions.keyUp(Keys.CONTROL);
	actions.build().perform();
//	
	System.out.println("Không được để trống thông tin này");
	
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		
	}
	public static void TruongHopNhapItHon6KyTu() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//đăng nhập
		driver.navigate().to("https://elearning.plt.pro.vn/quan-tri-vien/trang-chu");
		
		driver.findElement(By.id("input-10")).sendKeys("admin@elearning.plt");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-13")).sendKeys("plt-solutions-admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div/div[3]/form/div[2]/button")).click();
		Thread.sleep(1000);
		//nhập dữ liệu để thêm học viên
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"v-main-app\"]/div/div/div/div[1]/div[1]/table/tbody/tr[1]/td[10]/button[1]/span/i")).click();
		Thread.sleep(1000);
	 WebElement full_name = driver.findElement(By.name("full_name"));
	 full_name.click();
	 Actions actions= new Actions(driver);
	 actions.keyDown(Keys.CONTROL);
		actions.sendKeys("A");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		Thread.sleep(1000);
//		ctrl x để xóa
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("X");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();	
		Thread.sleep(1000);
//		nhập vào ít hơn 6 ký tự
		full_name.sendKeys("thanh");
		Thread.sleep(1000);
		 System.out.println("Tối thiểu có 6 ký tự cho thông tin này");
	 
	 
		Thread.sleep(1000);
		
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		
	}
	public static void TruongHopNhapKyTuSoHoacKyTuDacBietOTruongHoVaTen() throws InterruptedException {

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
		 WebElement full_name = driver.findElement(By.name("full_name"));
		 full_name.click();
		 Actions actions= new Actions(driver);
		 actions.keyDown(Keys.CONTROL);
			actions.sendKeys("A");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(1000);
//			ctrl x để xóa
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("X");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();	
			Thread.sleep(1000);
//			nhập vào ít hơn 6 ký tự
			full_name.sendKeys("thanh1n2@");
			Thread.sleep(1000);
			 System.out.println("Họ và tên không đúng");
		 
		 
			Thread.sleep(1000);
			
		
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		
	}
	public static void TruongHopNhapSaiDinhDangEmail() throws InterruptedException {

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
	
		 WebElement email = driver.findElement(By.name("email"));
		 email.click();
		 Actions actions= new Actions(driver);
		 actions.keyDown(Keys.CONTROL);
			actions.sendKeys("A");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(1000);
//			ctrl x để xóa
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("X");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();	
			Thread.sleep(1000);
//			nhập vào ít hơn 6 ký tự
			email.sendKeys("ttmgmail.com");
			Thread.sleep(1000);
		
	
	
		 System.out.println("Địa chỉ email không hợp lệ");
	 
	
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		
	}
	public static void TruongHopNhapSaiSoDienThoai() throws InterruptedException {

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
	

		 WebElement phone = driver.findElement(By.name("phone"));
		 phone.click();
		 Actions actions= new Actions(driver);
		 actions.keyDown(Keys.CONTROL);
			actions.sendKeys("A");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(1000);
//			ctrl x để xóa
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("X");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();	
			Thread.sleep(1000);
//			nhập vào ít hơn 6 ký tự
			phone.sendKeys("05857");
			Thread.sleep(1000);
		
	
	phone.sendKeys("058576754");
	
		 System.out.println("Số điện thoại không hợp lệ (xin vui lòng nhập đúng 10 hoặc 11 số");
	
	WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		
	}
}
