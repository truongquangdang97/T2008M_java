package assi7_2;

public class SinhVien {
    // id, name, age, address và gpa (điểm trung bình).
    int iD;
    String name;
    int age;
    String address;
    int gpa;

    public SinhVien() {
    }

    public SinhVien(int iD, String name, int age, String address, int gpa) {
        this.iD = iD;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
