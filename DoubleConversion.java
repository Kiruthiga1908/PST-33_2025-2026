package pst;
/*import java.util.Scanner;
public class DoubleConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the double value:");
		double d =sc.nextDouble();
		method1(d);
		sc.close();

	}
	public static void method1(double d) {
		 String str= Double.toString(d);
		System.out.println("the  string number is:" + str );
		
	}

*/
import java.util.Scanner;

public class DoubleConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double num = sc.nextDouble();

        int intValue = (int) num;   

        System.out.println("Converted int value: " + intValue);

        sc.close();
    }
}
