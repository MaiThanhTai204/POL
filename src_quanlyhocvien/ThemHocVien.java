
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThemHocVien {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TruongHopNhapHopLe();
		TruongHopDeTrongBatKyTruongDuLieuBatBuoc();
		TruongHopNhapItHon6KyTu();
		TruongHopNhapKyTuSoHoacKyTuDacBietOTruongHoVaTen();
		TruongHopNhapSaiDinhDangEmail();
		TruongHopNhapSaiSoDienThoai();

		TruongHopNhanNutHuyThanhCong();
		TruongHopNhapEmailDaTonTai();
		TruongHopNhapSoDienThoaiDaTonTai();
		TruongHopNhapMSSVDaTonTai();
		TruongHopNhapMSSVDuoi6KyTu();
		TruongHopNhapMSSVVuotQua12KyTu();
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
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[1]/span")).click();
	Thread.sleep(1000);
	
		
		
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtuuii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
		driver.findElement(By.name("student_code")).sendKeys("22211TT29522222");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttdrhjdsm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("05857621946");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtuuii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
		driver.findElement(By.name("student_code")).sendKeys("22211");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttdrhjdsm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("05857621946");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtuuii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
		driver.findElement(By.name("student_code")).sendKeys("22211TT2952");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttdrhjdDSsm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("05857621446");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtuuii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
		driver.findElement(By.name("student_code")).sendKeys("22211TT2952");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttdrhjdsm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("05857621946");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtuuii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
		driver.findElement(By.name("student_code")).sendKeys("22211TT2952");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("tthjm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("05857621946");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 driver.findElement(By.name("full_name")).sendKeys("thanhtuuii");
		Thread.sleep(1000);
		WebElement full_name = driver.findElement(By.name("full_name"));
		driver.findElement(By.name("student_code")).sendKeys("22211TT9952");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("tthjm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("05857671946");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 WebElement full_name = driver.findElement(By.name("full_name"));
	 full_name.sendKeys("");
	 
	 
		Thread.sleep(1000);
		
		WebElement scode=driver.findElement(By.name("student_code"));
		scode.sendKeys("");
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("");
		Thread.sleep(1000);
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.name("dob")).sendKeys("02112004");
		Thread.sleep(1000);
		if(full_name.getText()=="" || scode.getText()=="" || email.getText() =="" || phone.getText()=="") {
			 System.out.println("Không được để trống thông tin này");
		 }
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/form/div[1]/div/div[6]/div/div/div[1]/div/div[1]/div/div")).click();
		Thread.sleep(1000);
		//gioi tinh nu
//	driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/form/div[1]/div/div[6]/div/div/div[1]/div/div[2]/div/div")).click();
//		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys("An Duong Vuong");
		Thread.sleep(1000);
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
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/div/div[3]/form/div[2]/button/span")).click();
		Thread.sleep(1000);
		//nhập dữ liệu để thêm học viên
		driver.findElement(By.linkText("Quản lý học viên")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 WebElement full_name = driver.findElement(By.name("full_name"));
	 full_name.sendKeys("thanh");
	
		 System.out.println("Tối thiểu có 6 ký tự cho thông tin này");
	 
	 
		Thread.sleep(1000);
		
		driver.findElement(By.name("student_code")).sendKeys("22211TT0752");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("0585767546");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 WebElement full_name = driver.findElement(By.name("full_name"));
	 full_name.sendKeys("error@1234");
	 
		 System.out.println("Họ và tên không đúng");
	 
	 
		Thread.sleep(1000);
		
		driver.findElement(By.name("student_code")).sendKeys("22211TT0752");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("ttm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("0585767546");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	 WebElement full_name = driver.findElement(By.name("full_name"));
	 full_name.sendKeys("error@1234");
	 if(full_name.getText()=="error@1234") {
		 System.out.println("Họ và tên không đúng");
	 }
	 
		Thread.sleep(1000);
		
		driver.findElement(By.name("student_code")).sendKeys("22211TT0752");
		Thread.sleep(1000);
	WebElement email=	driver.findElement(By.name("email"));
	email.sendKeys("ttmgmail.com");
	
		 System.out.println("Địa chỉ email không hợp lệ");
	 
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("0585767546");
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
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
		Thread.sleep(1000);
	
	WebElement email=	driver.findElement(By.name("email"));
	email.sendKeys("ttmgmail.com");
	 if(email.getText()=="ttmgmail.com") {
		 System.out.println("Địa chỉ email không hợp lệ");
	 }
		Thread.sleep(1000);
	WebElement phone=	driver.findElement(By.name("phone"));
	phone.sendKeys("058576754");
	
		 System.out.println("Số điện thoại không hợp lệ (xin vui lòng nhập đúng 10 hoặc 11 số");
	
	WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
		submit.submit();
		
	}
}
