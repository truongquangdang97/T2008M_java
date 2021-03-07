package assi7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Class c = new Class();
        Scanner sc = new Scanner(System.in);
        int choose;


        do {
            Menu();
            System.out.println("Nhập lựa chọn dưới đây :");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    c.addStudent();
                    break;
                case 2:
                    c.editStudent();
                    break;
                case 3:
                    c.deleteStudent();
                    break;
                case 4:
                    c.sortGpa();
                    break;
                case 5:
                    c.sortName();
                    break;
                case 6:
                    c.showStuden();
                    break;
            }
        }while (choose!=7);
    }

    static void Menu(){
        System.out.println("1 Thêm sinh viên : ");
        System.out.println("2 Chỉnh Sửa học sinh  theo id   : ");
        System.out.println("3 Xoá một học sinh theo id ");
        System.out.println("4 Sắp xếp học sinh theo điểm trung bình :");
        System.out.println("5 Sắp xếp học sinh theo tên : ");
        System.out.println("6 In Ra danh sách học sinh : ");
    }
}
