package BaiThucHanh;

public class BaiThucHanh05 {
    void yeuCau1() {
        String vietnam = "Việt Nam ";
        System.out.println("concat() = " + vietnam.concat("Cộng hòa XHCN"));
    }

    void yeuCau2() {
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet" + " Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm" + " Bảo Việt đầu tư 100 vốn.";
        System.out.println("length() = " + baoViet);
        baoViet = baoViet.replaceAll("Cty", "Công Ty");
        System.out.println("replaceAll() = " + baoViet);
    }

    void yeuCau3() {
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " + "Bảo Việt đầu tư 100 vốn.";
        System.out.println("toUpperCase() = " + baoViet.toUpperCase());
        System.out.println("toLowerCase() = " + baoViet.toLowerCase());
    }

    void yeuCau4() {
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " + "Bảo Việt đầu tư 100 vốn.";
        System.out.println("lastIndexOf() = " + baoViet.lastIndexOf("Bảo Việt"));
    }

    void yeuCau5() {
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " + "Bảo Việt đầu tư 100 vốn.";
        String[] arrBaoViet = baoViet.split(" ");
        for (int i = 0; i < arrBaoViet.length; i++) {
            String arrBaoViet1 = arrBaoViet[i];
            if (i % 2 == 0) {
                System.out.println("\t" + arrBaoViet1);
            } else {
                System.out.println(arrBaoViet1);
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh05 a = new BaiThucHanh05();
        a.yeuCau1();
        a.yeuCau2();
        a.yeuCau3();
        a.yeuCau4();
        a.yeuCau5();
    }
}
