package bai1;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        // Nhập vào 3 số a b c
        // Xử lý thêm điều kiện a b c > 0
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        // Kiểm tra a, b, c có là tam giác vuông

        if (a * a + b * b == c * c) {
            System.out.println("3 so a , b, c la mot tam giac vuong, canh huyen la a, b");
            System.out.println(ChuVi(a, b, c));
            System.out.println(DienTich(a, b));
        } else if (a * a + c * c == b * b) {
            System.out.println("3 so a , b, c la mot tam giac vuong, canh huyen la a, c");
            System.out.println(ChuVi(a, b, c));
            System.out.println(DienTich(a, c));
        } else if (b * b + c * c == a * a) {
            System.out.println("3 so a , b, c la mot tam giac vuong, canh huyen la b, c");
            System.out.println(ChuVi(a, b, c));
            System.out.println(DienTich(b, c));
        }

    }

    // Tính chu vi nếu vuông
    public static float ChuVi(float a, float b, float c) {
        float P = a + b + c;
        return P;
    }

    // Tính diện tích nếu vuông
    public static float DienTich(float a, float b) {
        float S = (a * b) / 2;
        return S;
    }
}
