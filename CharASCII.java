package pst;

import java.util.Scanner;

public class CharASCII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        method1(ch);

        sc.close();
    }

    public static void method1(char ch) {
        System.out.println("The character: " + ch);
        int ascii = ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}

