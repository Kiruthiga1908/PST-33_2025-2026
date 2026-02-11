package pst;

public class CountEvenOddArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 7, 6, 2};
        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}

