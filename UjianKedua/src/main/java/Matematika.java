
public class Matematika {
	
	public int addExpect (int a, int b) {
		int total = a + b;
		System.out.println("Menguji method addExpect " + a + "+" + b + "= " + total );
		return total;
	}
	
	public int addActual (int a, int b) {
		int total = ((a*a)/a) + ((b+0)*1) ;
		System.out.println("Menguji method addActual " + a + "+" + b + "= " + total );
		return total;
	}
	
	public int minusExpect (int a, int b) {
		int total = a - b ;
		System.out.println("Menguji method minusExpect " + a + "-" + b + "= " + total );
		return total;
	}
	
	public int minusActual (int a, int b) {
		int total = (a*b)/b - (b*100/100) ;
		System.out.println("Menguji method minusActual " + a + "-" + b + "= " + total );
		return total;
	}
	
	public double divisionExpect (double a, double b) {
		double total = a/b ;
		System.out.println("Menguji method divisionActual " + a + "/" + b + "= " + total );
		return total;
	}
	
	public double divisionActual (double a, double b) {
		double total = (a+b-b) / (b*a*1/a) ;
		System.out.println("Menguji method divisionExpect " + a + "/" + b + "= " + total );
		return total;
	}
	
	public int modulusExpect (int a, int b) {
		int total =  a%b;
		if(a%b==0) {
			System.out.println("Menguji method modulusExpect " + a + "%" + b + "= " + total );
		}else {
			System.out.println("Menguji method modulusExpect " + a + "%" + b + " = 1");
		}
		
		return total;
	}
	
	public int modulusActual (int a, int b) {
		int total = a/b-1 ;
		if(a/b <= 1) {
			System.out.println("Menguji method modulusActual " + a + "%" + b + "= 0"  );
		}else {
			System.out.println("Menguji method modulusActual " + a + "%" + b + "= 1");
		}
		return total;
	}
	
	
}
