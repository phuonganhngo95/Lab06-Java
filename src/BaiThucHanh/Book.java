package BaiThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String bookName, nxb, author;
    private int yearOfPublish, numOfPage;
    private float price;

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu cho sách: ");
        System.out.println("Tên sách: ");
        this.bookName = sc.nextLine();
        System.out.print("\nNhà xuất bản: ");
        this.nxb = sc.nextLine();
        System.out.print("\nNăm xuất bản: ");
        this.yearOfPublish = sc.nextInt();
        System.out.print("\nTác giả: ");
        this.author = sc.nextLine();
        System.out.println("\nSố trang: ");
        this.numOfPage = sc.nextInt();
        sc.nextLine();
        System.out.println("\nGiá: ");
        this.price = sc.nextFloat();
    }

    public String toString() {
        return "Book {" + "bookName = " + bookName + ", nxb = " + nxb + ", yearOfPublish = " + yearOfPublish + ", author = " + author + ", numOfPage = " + numOfPage + ", price = " + price + "}";
    }
}

class BaiThucHanh04 {
    ArrayList<Book> lstBook = new ArrayList<>();

    public int showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Nhập dữ liệu");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Xóa");
        System.out.println("4. Thoát");
        System.out.println("Vui lòng nhập lại từ 1->4");
        return sc.nextInt();
    }

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số sách muốn nhập: ");
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println("Nhập cuốn thứ " + (i+1));
            Book book = new Book();
            book.nhapDuLieu();
            lstBook.add(book);
        }
        System.out.println("Xin cảm ơn");
    }

    public void hienthiDanhSach() {
        System.out.println("Số sách trong thư viện: ");
        for (int i = 0; i < lstBook.size(); i++) {
            Book get = lstBook.get(i);
            System.out.println((i+1) + ". " + get.toString());
        }
        System.out.println("------------------------");
    }

    public void xoaSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ tự sách muốn xóa: ");
        int id = sc.nextInt();
        if (id<lstBook.size() && id>=0) {
            lstBook.remove(id);
        }
        System.out.println("Xóa thành công");
    }

    public static void main(String[] args) {
        int choose;
        BaiThucHanh04 a = new BaiThucHanh04();
        do {
            choose = a.showMenu();
            switch (choose) {
                case 1:
                    a.nhapDuLieu();
                    break;
                case 2:
                    a.hienthiDanhSach();
                    break;
                case 3:
                    a.xoaSach();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}