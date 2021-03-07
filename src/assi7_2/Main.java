package assi7_2;

public class Main {
    public static void main(String[] args) {
        Class c = new Class();
        c.addStudent(1, "a", 24, "Thai Binh", 9);
        c.addStudent(2, "d", 24, "Nam dinh", 7);
        c.addStudent(3, "c", 24, "Hai Phong", 8);
        c.addStudent(4, "b", 24, "binh duong", 9);
        c.editStudent(4);
        c.deleteStudent(2);
        c.showStuden();
        c.sortGpa();
        c.sortName();
        System.out.println("Sau khi dc sap xep  lai ://////////////////////////");
        c.showStuden();


//        Scanner scanner = new Scanner(System.in);
//        int choose;
//        do {
//            showMemu();
//            System.out.println("nhap lua chon : ");
//            choose= Integer.parseInt(scanner.nextLine());
//
//            switch (choose){
//                case 1:
//                    break;
//            }
//
//        }while (choose!=1);
//
//
//    }
//    static void showMemu(){
//        System.out.println("/****************************************/");
//        System.out.println("1. Thêm sinh viên");
//        System.out.println("2. Chỉnh sửa học sinh theo id.");
//        System.out.println("3. Xóa sinh viên theo id.");
//        System.out.println("4. Sắp xếp học sinh bằng diem trung binh.");
//        System.out.println("5. Sắp xếp học sinh theo tên.");
//        System.out.println("6. Hiển thị học sinh.");
//        System.out.println("7. Lưu thông tin sv vào file student.txt");
//        System.out.println("8. Đọc thông tin sv từ file student.txt và hiển thị ra màn hình");
//        System.out.println("9. Exit.");
//        System.out.println("/****************************************/");
//    }
    }
}
