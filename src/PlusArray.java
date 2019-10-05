import java.util.Arrays;
import java.util.Scanner;

public class PlusArray {
    public static void main(String[] args) {
        int size1, size2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array 1: ");
        size1 = input.nextInt();
        System.out.print("Enter size of Array 2: ");
        size2 = input.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value of element " + (i + 1) + " (Array 1) \t");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter value of element " + (i + 1) + " (Array 2) \t");
            arr2[i] = input.nextInt();
        }
        int size3 = size1 + size2;
        int[] arr3 = new int[size3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < size3; i++) {
                arr3[i] = arr2[i-arr1.length];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }


    }

}
