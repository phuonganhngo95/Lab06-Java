package BaiTap;

import java.util.Scanner;

public class Bai4 {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    void input() {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    void MaxMin() {
        int max = arr[0], min = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Max: " + max);
            }
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("Min: " + min);
            }
        }
    }

    public static void main(String[] args) {
        Bai4 a = new Bai4();
        a.input();
        a.MaxMin();
    }
}
