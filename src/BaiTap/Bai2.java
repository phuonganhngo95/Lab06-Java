package BaiTap;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
