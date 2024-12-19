package BaiThucHanh;

import java.util.Scanner;

public class BaiThucHanh02 {
    String[][] arrNhanVien = new String[3][2];

    public void nhapDuLieu() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập thông tin nhân viên thứ " + (i+1) + ":");
            arrNhanVien[i][0] = sc.nextLine();
            arrNhanVien[i][1] = sc.nextLine();
        }
        System.out.println("Cảm ơn đã nhập liệu");
    }

    public void sapXep() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            for (int j = i+1; j < arrNhanVien.length; j++) {
                if (Float.parseFloat(arrNhanVien[j][i]) < Float.parseFloat(arrNhanVien[i][1])) {
                    String[][] temp = new String[1][2];

                    temp[0][0] = arrNhanVien[j][0];
                    temp[0][1] = arrNhanVien[j][1];

                    arrNhanVien[j][0] = arrNhanVien[i][0];
                    arrNhanVien[j][1] = arrNhanVien[i][1];

                    arrNhanVien[i][0] = temp[0][0];
                    arrNhanVien[i][1] = temp[0][1];
                }
            }
        }
    }

    public void hienThi() {
        for (int i = arrNhanVien.length - 1; i >= 0; i--) {
            System.out.println(arrNhanVien[i][0] + " " + arrNhanVien[i][1]);
        }
    }

    public static void main(String[] args) {
        BaiThucHanh02 a = new BaiThucHanh02();
        a.nhapDuLieu();
        a.sapXep();
        a.hienThi();
    }
}
