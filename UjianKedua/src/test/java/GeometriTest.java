import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GeometriTest {
	
	
	
	Geometri geo;
	
	@BeforeTest
	public void instance() {
		System.out.println();
		geo= new Geometri();
		System.out.println("Mulai Lakukan Testing");
		System.out.println("=====================");
		
	}
	

  @Test
  public void luasPersegiTest() {
	  int luasPersegi = 5;
	  System.out.println("Ini adalah Test Case Luas Persegi");
	  assertEquals(geo.luasPersegiActual(luasPersegi),(geo.luasPersegiExpect(luasPersegi))," KEDUA DATA TIDAK COCOK ");
  }


  @Test
  public void luasSegitigaTest() {
	  int alas = 10;
	  int tinggi = 5;
	  System.out.println("Ini adalah Test Case Luas Segitiga");
	  assertEquals(geo.luasSegitigaActual(alas, tinggi),(geo.luasSegitigaExpect(alas, tinggi))," KEDUA DATA TIDAK COCOK ");
  }


  @Test
  public void luasTrapesiumTest() {
	  int a = 10;
	  int b = 10;
	  int t = 2;
	  System.out.println("Ini adalah Test Case Luas Trapesium");
	  assertEquals(geo.luasTrapesiumActual(a, b, t),(geo.luasTrapesiumExpect(a, b, t))," KEDUA DATA TIDAK COCOK ");
  }
  
  @AfterTest
	public void aftTest()
	{
		System.out.println("TEST SUDAH SELESAI DILAKUKAN !! ");
	}

}
