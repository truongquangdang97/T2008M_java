package kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Hotel> list = new ArrayList<Hotel>();

        list.add(new Hotel(" Thiên Long 1","Hà Nội 1","dq1"));
        list.add(new Hotel(" Thiên Long 2","Hà Nội 2","dq2"));
        list.add(new Hotel(" Thiên Long 3","Hà Nội 3","dq3"));
        list.add(new Hotel(" Thiên Long 4","Hà Nội 4","dq4"));
        list.add(new Hotel(" Thiên Long 5","Hà Nội 5","dq5"));
        list.add(new Hotel(" Thiên Long 6","Hà Nội 6","dq6"));
        list.add(new Hotel(" Thiên Long 7","Hà Nội 7","dq7"));
        list.add(new Hotel(" Thiên Long 8","Hà Nội 8","dq8"));
        list.add(new Hotel(" Thiên Long 9","Hà Nội 9","dq9"));
        list.add(new Hotel(" Thiên Long 10","Hà Nội 10","dq10"));



        System.out.println("Danh sách khách sạn :");
        for (Hotel h :list){
            System.out.println("-"+ h.getName()+"-"+h.getLocation()+"-"+h.getOwnerName());
        }




        System.out.println("///////////////////////////////////////////");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên chủ sở hữu muốn tìm trong danh sách khách sạn :");
        String seachName =  sc.nextLine();
        for (Hotel h:list){
            if (h.getOwnerName().equals(seachName)){
                System.out.println("Thông tin khách sạn muốn tìm là :");
                System.out.println(" "+h.getName()+"-"+h.getLocation()+"-"+h.getOwnerName());
                return;
            }
            else
                System.out.println("Không tìm thấy khách sạn muốn tìm : ");
            return;
        }
    }
}
