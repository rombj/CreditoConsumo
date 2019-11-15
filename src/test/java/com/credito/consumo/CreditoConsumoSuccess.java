package com.credito.consumo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CreditoConsumoSuccess {
	private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@Test
	public void testCreditoConusmo() throws InterruptedException{
		driver.get("https://www.bancoestado.cl/imagenes/nuevo_form/11394_simulador_consumo/solicitud.asp");
		Thread.sleep(3000);
		driver.findElement(By.id("Rut")).sendKeys("26499127-7");
		Thread.sleep(2000);
		driver.findElement(By.id("monto")).sendKeys("1000000");
		Thread.sleep(2000);
		driver.findElement(By.id("plazo")).sendKeys("24");
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("10-12-2019");
		Thread.sleep(2000);
		driver.findElement(By.id("desgravamen")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("enviar")).click();
		Thread.sleep(6000);		
	
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
