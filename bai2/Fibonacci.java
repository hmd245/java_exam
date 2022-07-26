package bai2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Nhập vào số nguyên n <= 20
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap n <= 20: ");
            n = scanner.nextInt();
            if (n > 20) {
                System.out.println("Chu y dieu kien n <= 20");
            }
        } while (n > 20);

        System.out.println("So Fibonacci ung voi n = " + n +" la: " + FindFibonacci(n));

    }
    // Phương thức tìm số Fibonacci n
    public static int FindFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return FindFibonacci(n - 1) + FindFibonacci(n - 2);
        }
    }
}
