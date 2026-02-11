package pst;

public class AutomorphicNumber {
	   public static boolean isAutomorphicUsingLoop(int number) {
	       int square = number * number;
	       while (number > 0) {
	           if (number % 10 != square % 10) {
	               return false; 
	           }
	           number /= 10; 
	           square /= 10;
	       }
	       return true; 
	   }
	   public static void main(String[] args) {
	       System.out.println(isAutomorphicUsingLoop(76)); 
	       System.out.println(isAutomorphicUsingLoop(9)); 
	   }
	}