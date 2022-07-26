package bai3;

import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo
        System.out.printf("Nhap size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Nhập giá trị cho các phần tử mảng
        int i = 0;
        while (i < array.length) {
            System.out.printf("Nhap phan tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // In ra mảng đã nhập
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
        }

        // Tìm max
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("\n Gia tri lon nhat la: " + max);

    }
}
