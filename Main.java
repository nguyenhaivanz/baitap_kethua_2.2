package ngay_8;
import ngay_7_ke_thua.Fulltime;

import java.util.Scanner;
public class Main {
    static Dad[] arr = new Dad[1000];
    static int SoLuong = 0;
    public static void show() {
        if (SoLuong == 0) System.out.println("không có nhân viên nào!");
        else {
            for (int i = 0; i < SoLuong; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void More(Scanner sc) {
        System.out.print("nhập id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập tên: ");
        String name = sc.nextLine();
        System.out.println("nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhâp địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("nhập loại nhân viên(1.Fulltime  2.Parttime) :");
        int Type = sc.nextInt();
        if (Type == 1) {
            System.out.print("nhận lương: ");
            double luong = sc.nextDouble();
            arr[SoLuong] = new Fulltime(id, name, age, address, luong);
            SoLuong++;
        } else {
            System.out.print("số ngày đi làm: ");
            int ngay = sc.nextInt();
            arr[SoLuong] = new Parttime(id, name, age, address, ngay);
            SoLuong++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----menu----");
        System.out.println("1.hiển thị nhân viên:");
        System.out.println("2.thêm nhân viên:");
        System.out.println("3.thoát");
        while (true) {
            System.out.println("mời lưa chọn kiểu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    show();
                    break;
                case 2:
                    System.out.println("bạn muốn thêm bao nhiêu nhân viên: ");
                    int slnv = scanner.nextInt();
                    for (int i = 0; i < slnv; i++) {
                        More(scanner);
                    }
                    show();
                    break;
                case 3:
                    break;
            }
        }
    }
}