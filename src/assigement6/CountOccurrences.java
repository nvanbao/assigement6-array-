package assigement6;

import java.util.Scanner;

public class CountOccurrences {

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
        System.out.print("Nhap so nguyen can dem: ");
        int target = scanner.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("So " + target + " xuat hien " + count + " lan trong mang.");
    }
}
