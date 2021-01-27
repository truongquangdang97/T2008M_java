package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello world");
//        int x = 10;
//        if (x>5){
//            System.out.println(x+" la so duong");
//        }else {
//            System.out.println(x+"la so am");
//        }
//        for (int i=0;i<10;i++){
//            System.out.println("i="+i);
//        }
        Studen st ; //khai 1 biến c so kiểu dữ liệu Studen
        st = new Studen();// tạo đối tượng => st sẽ có 1 o nhớ
        Studen st2 = new Studen();
        st.name = "Truong Dang Quang ";
        st2.name = " Bui Thi Thai ";
        st.run();
        st2.run();
        st.est();
        st2.est();
    }
}
