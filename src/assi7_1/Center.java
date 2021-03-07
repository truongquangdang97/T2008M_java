package assi7_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Center extends Student {

    ArrayList<Student> list;

    public Center(ArrayList<Student> list) {
        this.list = list;
    }

    public Center() {
        list = new ArrayList<>();
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    Scanner sc = new Scanner(System.in);

    public void add(){
        System.out.println("Nhập số lượng muốn thêm : ");
        int sl = sc.nextInt();

        for (int i =0 ;i<sl;i++){
            Student s  = new Student();
            s.input();
            list.add(s);
        }
    }
}
