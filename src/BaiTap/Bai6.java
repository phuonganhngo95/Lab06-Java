package BaiTap;

import java.util.Scanner;

public class Bai6 {
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
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    void isPerfect() {
        System.out.println("Các số hoàn hảo trong mảng:");
        for (int i = 0; i < n; i++) {
            if (ktr(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bai6 a = new Bai6();
        a.input();
        a.isPerfect();
    }
}