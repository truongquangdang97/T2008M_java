package assi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Class extends SinhVien implements QuanLi{


    ArrayList<SinhVien> list;

    public Class(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public Class() {
        list = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Nhập số HS sinh muốn thêm : ");
        int sl = sc.nextInt();

        for (int i =0 ;i<sl;i++){
            SinhVien s = new SinhVien();
            s.input();
            list.add(s);
        }

    }

    @Override
    public void editStudent() {
        System.out.println("Nhập Id học sinh muốn sửa : ");
        int i = sc.nextInt();

        for (SinhVien s:list){
            if (s.getiD()==i){
                System.out.println("Nhập tên : ");
                setName(sc.nextLine());
                System.out.println("Nhập địa chỉ :");
                setAddress(sc.nextLine());
                System.out.println("Nhập tuổi : ");
                setAge(sc.nextInt());
                System.out.println("Nhập điểm TB");
                setGpa(sc.nextInt());
                return;
            }
            else System.out.println("Id nay khôgn có trong Danh Sách học sinh : ");
        }



    }

    @Override
    public void deleteStudent() {
        System.out.println("Nhập Id tên HS cần xoá : ");
        int d = sc.nextInt();

        for (SinhVien s:list){
            if (s.getiD()==d){
                list.remove(d);
                return;
            }System.out.println("Id nay khôgn có trong Danh Sách học sinh :");
        }


    }

    @Override
    public void sortGpa() {
        Collections.sort(list , new Comparator<assi7.SinhVien>() {
            @Override
            public int compare(assi7.SinhVien o1, assi7.SinhVien o2) {
                return o2.getGpa()- o1.getGpa();
            }
        });

    }

    @Override
    public void sortName() {
        Collections.sort(list, new Comparator<assi7.SinhVien>() {
            @Override
            public int compare(assi7.SinhVien o1, assi7.SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void showStuden() {
        for (SinhVien s:list){
            System.out.println("Id  : "+s.getiD());
            System.out.println(" Tên : "+s.getName());
            System.out.println("Tuổi : "+s.getAge());
            System.out.println("Địa chỉ : "+s.getAddress());
            System.out.println("Điểm trung binh : "+s.getGpa());

        }
    }







}
