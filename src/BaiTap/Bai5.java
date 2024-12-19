package BaiTap;

import java.util.Scanner;

public class Bai5 {
    private Scanner sc = new Scanner(System.in);
    private int n;
    private int[] arr;

    void input() {
        System.out.print("Nhập số phần tử: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    boolean ktr(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    void isPrime() {
        System.out.println("Các số nguyên tố trong dãy:");
        for (int i = 0; i < n; i++) {
            if (ktr(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bai5 a = new Bai5();
        a.input();
        a.isPrime();
    }
}