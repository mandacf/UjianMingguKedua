import java.util.Scanner;
public class Wrapper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String data = "";
        try{
            do{
               inputData(data);
            }while(true);
        }catch(Exception e){
           resultException(e,data);
        }
    }
    public static void inputData(String data){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan String : ");
        data = sc.next();
        System.out.println("String to Integer: "+dataTemp(data));
        System.out.println("---------------------------");
    }
    public static int dataTemp(String data){
        Integer objInt = new Integer(data);
        return objInt;
    }
    public static void resultException(Exception e, String data){
         System.out.println("---------------------------");
            System.out.println(e);
            System.out.println(data + " bukan merupakan sebuah integer");
            System.out.println("---------------------------");
    }
    
    public int luasSegitigaExpect (int a, int t) {
		int total = a*t/2;
		System.out.println("Menguji method luasSegitigaExpect" + a + "+" + t + "=" + total );
		return total;
	}

}
