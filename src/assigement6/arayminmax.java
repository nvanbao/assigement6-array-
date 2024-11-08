package assigement6;

import java.util.Scanner;

public class arayminmax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so luong phan tu thu " + i + ":");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
       System.out.println("Max: " +max );
       System.out.println("Min: "+min );
   }
}
