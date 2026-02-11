package pst;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 3, 2, 6, 9};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
