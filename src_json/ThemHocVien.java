import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;


public class ThemHocVien {

	public static void main(String[] args) throws InterruptedException, IOException, ParseException {
		// TODO Auto-generated method stub
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
		//Nạp dữ liệu từ file json
//	
		  String jsonString = "[\r\n"
		  		+ "  {\r\n"
		  		+ "    \"Name\": \"Mai Thanh Tài\",\r\n"
		  		+ "    \"ID\": \"24211tt3287\",\r\n"
		  		+ "    \"Email\": \"ta34i1SiBithw@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0888658856\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"HundredD\",\r\n"
		  		+ "    \"ID\": \"22211tt8854\",\r\n"
		  		+ "    \"Email\": \"hdHHH@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0987786848\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"Kindred\",\r\n"
		  		+ "    \"ID\": \"22211tt6553\",\r\n"
		  		+ "    \"Email\": \"kr@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"8769059595\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"hungnguyen\",\r\n"
		  		+ "    \"ID\": \"22211tt6552\",\r\n"
		  		+ "    \"Email\": \"Nguyen@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"9879099999\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"Mai Thanh Tài\",\r\n"
		  		+ "    \"ID\": \"22211tt6551\",\r\n"
		  		+ "    \"Email\": \"mt@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0987567567\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"Tài\",\r\n"
		  		+ "    \"ID\": \"22211tt6550\",\r\n"
		  		+ "    \"Email\": \"tm@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0585645123\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ "{\r\n"
		  		+ "    \"Name\": \"NguyenlONG\",\r\n"
		  		+ "    \"ID\": \"22211tt6559\",\r\n"
		  		+ "    \"Email\": \"nglog@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0987654321\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"NguyenHau\",\r\n"
		  		+ "    \"ID\": \"22211tt6558\",\r\n"
		  		+ "    \"Email\": \"nghau@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0585958676\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"haung\",\r\n"
		  		+ "    \"ID\": \"22211tt6557\",\r\n"
		  		+ "    \"Email\": \"haung@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0917777065\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  },\r\n"
		  		+ " {\r\n"
		  		+ "    \"Name\": \"ngtrang\",\r\n"
		  		+ "    \"ID\": \"22211tt6556\",\r\n"
		  		+ "    \"Email\": \"trangng@gmail.com\",\r\n"
		  		+ "    \"Phone\": \"0686787868\",\r\n"
		  		+ "    \"DateOfBirth\": \"02112004\",\r\n"
		  		+ "    \"Address\": \"51 VDV BD\",\r\n"
		  		+ "  }\r\n"
		  		+ "\r\n"
		  		+ "  ]\r\n"
		  		+ "\r\n"
		  		+ "";
	        JSONParser parser = new JSONParser();
	       
	            JSONArray jsonArray = (JSONArray) parser.parse(jsonString);

	            
	            for (Object obj : jsonArray) {
	            	
	                JSONObject jsonObject = (JSONObject) obj;
	                String name = (String) jsonObject.get("Name");
	                String id = (String) jsonObject.get("ID");
	             
	                String email = (String) jsonObject.get("Email");
	                String phone = (String) jsonObject.get("Phone");
	                String dateOfBirth = (String) jsonObject.get("DateOfBirth");
	                String address = (String) jsonObject.get("Address");

	                System.out.println("Name: " + name);
	                System.out.println("ID: " + id);
	                System.out.println("Email: " + email);
	                System.out.println("Name: " + phone);
	                System.out.println("ID: " + dateOfBirth);
	                System.out.println("Email: " + address);
	               
	                driver.findElement(By.name("full_name")).sendKeys(name.toString());
	                Thread.sleep(1000);
	                driver.findElement(By.name("student_code")).sendKeys(id.toString());
	                Thread.sleep(1000);
	                driver.findElement(By.name("email")).sendKeys(email.toString());
	                Thread.sleep(1000);
	                driver.findElement(By.name("phone")).sendKeys(phone.toString());
	                Thread.sleep(1000);
	                driver.findElement(By.name("dob")).sendKeys(dateOfBirth.toString());
	                Thread.sleep(1000);
	                driver.findElement(By.name("address")).sendKeys(address.toString());
	                Thread.sleep(1000);
//	                driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span")).submit();

//	                
                driver.findElement(By.name("full_name")).clear();
//
               driver.findElement(By.name("student_code")).clear();

	                driver.findElement(By.name("email")).clear();

	                driver.findElement(By.name("phone")).clear();
//
	                driver.findElement(By.name("dob")).clear();

	                driver.findElement(By.name("address")).clear();
//	         		thêm
	         		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/form/div[2]/button[2]/span"));
	        		submit.submit();
	        		Thread.sleep(1000);

//nút ok
driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
	         		Thread.sleep(1000);
//	         		NÚT THÊM
	         		 driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div/div/div/div[1]/header/div/button[1]")).click();
	           		Thread.sleep(1000);
	         
	             
	            }

	      
//		System.out.println("Size : " + jsonobject.size());
		
	}

}
