package assi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Class extends QuanLi{

    ArrayList<SinhVien> listSinhvien;

    public Class(){
        listSinhvien =new ArrayList<>();
    }

    public ArrayList<SinhVien> getListSinhvien() {
        return listSinhvien;
    }

    public void setListSinhvien(ArrayList<SinhVien> listSinhvien) {
        this.listSinhvien = listSinhvien;
    }

    @Override
    public void addStudent(int iD,String name,int age,String address,int gpa) {
        for (SinhVien sv:listSinhvien){
            if (sv.getName().equals(name)){
                return;
            }
        }

        SinhVien sv = new SinhVien(iD,name,age,address,gpa);
        listSinhvien.add(sv);

    }

    @Override
    public void editStudent(int iD) {
        for (SinhVien sv:listSinhvien){
            if (sv.getiD()==iD){
                Scanner sc = new Scanner(System.in);
                System.out.println("Tên cần sửa :");
                sv.setName(sc.nextLine());
                System.out.println("Tuổi cần sửa : ");
                sv.setAge(sc.nextInt());
                System.out.println("Nơi sinh cần sửa : ");
                sv.setAddress(sc.nextLine());
                System.out.println("Điểm trung bình cần sửa :");
                sv.setGpa(sc.nextInt());
                return;
            }
        }



    }

    @Override
    public void deleteStudent(int iD) {
        for (SinhVien sv :listSinhvien){
            if (sv.getiD()==iD){
                listSinhvien.remove(sv);
                return;
            }
        }

    }

    @Override
    public void sortGpa() {
        Collections.sort(listSinhvien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o2.getGpa()- o1.getGpa();
            }
        });
    }

    @Override
    public void sortName() {
        Collections.sort(listSinhvien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }

    @Override
    public void showStuden() {
        for (SinhVien sv : listSinhvien){
            System.out.println("Id : " + sv.getiD());
            System.out.println("Tên : "+ sv.getName());
            System.out.println("Tuôi : " + sv.getAge());
            System.out.println("Dịa chỉ : "+sv.getAddress());
            System.out.println("Điểm trung bình : "+sv.getGpa());

        }
    }
}
