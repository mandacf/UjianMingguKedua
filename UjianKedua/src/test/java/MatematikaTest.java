import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MatematikaTest {
	
	Matematika mat;
	
	@BeforeTest
	public void instance() {
		System.out.println();
		mat= new Matematika();
		System.out.println("Mulai Lakukan Testing");
		System.out.println("=====================");
		
	}

  @Test
  public void addATest() {
	  int a = 5;
	  int b = 3;
	  System.out.println("Ini adalah Test Case Penjumlahan");
	  assertEquals(mat.addActual(a, b),(mat.addExpect(a, b))," KEDUA DATA TIDAK COCOK ");
  }
  
  @Test
  public void minusTest() {
	  int a = 5;
	  int b = 3;
	  System.out.println("Ini adalah Test Case Pengurangan");
	  assertEquals(mat.minusActual(a, b),(mat.minusExpect(a, b))," KEDUA DATA TIDAK COCOK ");
  }


  @Test
  public void divisionTest() {
	  double a = 5;
	  double b = 3;
	  System.out.println("Ini adalah Test Case Pembagian");
	  assertEquals(mat.divisionActual(a, b),(mat.divisionExpect(a, b))," KEDUA DATA TIDAK COCOK ");
  }

  
  @Test
  public void modulusTest() {
	  int a = 5;
	  int b = 3;
	  System.out.println("Ini adalah Test Case Modulis");
	  assertEquals(mat.modulusActual(a, b),(mat.modulusExpect(a, b))," KEDUA DATA TIDAK COCOK ");
  }
  
  @AfterTest
	public void aftTest()
	{
		System.out.println("TEST SUDAH SELESAI DILAKUKAN !! ");
	}
}
