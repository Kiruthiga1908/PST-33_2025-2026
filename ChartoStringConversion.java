package pst;



/*import java.util.Scanner;

public class ChartoStringConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character value:");
        char ch = sc.next().charAt(0);
        method1(ch);
        sc.close();
    }

    public static void method1(char ch) {
        String str = String.valueOf(ch);
        System.out.println("The string is: " + str);
    }

}*/
import java.util.Scanner;

public class ChartoStringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        
        int ascii = (int) ch;

        
        char newChar = (char) ascii;

        
        char[] arr = new char[1];
        arr[0] = newChar;

        String str = new String(arr); 

        System.out.println("String is: " + str);

        sc.close();
    }
}
