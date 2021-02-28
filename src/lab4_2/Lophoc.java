package lab4_2;

import java.util.ArrayList;

public class Lophoc {
//mã lớp, tên lớp, phòng học, danh sách sinh viên
    int classId;
    String className;
    String classNumber;
    ArrayList<Sinhvien> sinhvienList = new ArrayList<Sinhvien>();

    public Lophoc(){

    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public ArrayList<Sinhvien> getSinhvienList() {
        return sinhvienList;
    }

    public void setSinhvienList(ArrayList<Sinhvien> sinhvienList) {
        this.sinhvienList = sinhvienList;
    }

    public boolean addSinhvien(Sinhvien sv){
        getSinhvienList().add(sv);
        return true;
    }

    public boolean removeSinhvien(int index){
        getSinhvienList().remove(index);
        return true;
    }




}
