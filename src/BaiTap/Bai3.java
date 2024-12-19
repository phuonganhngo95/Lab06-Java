package BaiTap;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Chọn cách nhập:");
        System.out.println("1. Bằng tay");
        System.out.println("2. Tự động");
        int lc = sc.nextInt();

        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if (lc == 1) {
            System.out.println("Nhập mảng:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("a[" + i + "] = ");
                arr[i] = sc.nextInt();
            }
        } else if (lc == 2) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("a[" + i + "] = ");
                arr[i] = random.nextInt();
            }
        } else {
            System.out.println("Lựa chọn không phù hợp");
            return;
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
