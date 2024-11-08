
package assigement6;

import java.util.Scanner;
import java.util.Arrays;

public class SorttheArray {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(array));
    }
}