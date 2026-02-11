package pst;
public class AsciiValues {

    public static void main(String[] args) {
        printAscii(); 
        
        
    }

    
    public static void printAscii() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
        
    }
   /* public static void printascii(ch) {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
        
    }*/
    
}
