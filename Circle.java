package PST_JAVA;


import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        System.out.println("Area of circle");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius = sc.nextFloat();

        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("Area of circle: " + area);

        sc.close();
    }
}
