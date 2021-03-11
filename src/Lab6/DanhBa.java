package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//
public class DanhBa extends DienThoai {

    public ArrayList<SoDienThoai> phoneList;

    public DanhBa() {
        phoneList = new ArrayList<>();
    }

    public void insertPhone(String name1, String phone1) {
        for (SoDienThoai p:phoneList){
            if (!p.getPhone().equals(phone1)){
                p.addPhone(name1);
                if (p.getName().equals(name1)){
                }
                return;

            }
        }
        SoDienThoai p = new SoDienThoai(name1,phone1);
        phoneList.add(p);

    }

  //  @Override Hàm chứa tên và số định cho.
//    public void insertPhone(String name1, String phone1) {
//        for(SoDienThoai p:phoneList){
//            if(p.getName().equals(name1)){ // kiểm tra name1 có  thuộc tên trong danh bạ không .
//                if(p.getPhone().contains(phone1)){ // kiem tra da co trong danh sach hay chua
//                    p.addPhone(phone1);
//                }
//                return;
//            }
//        }
//        SoDienThoai p = new SoDienThoai(name1,phone1);
//        phoneList.add(p);
//    }






    // Thầy ơi cho em hỏi xíu  ; khi xét cái   điều kiên  if(p.getName().equals(name1)) và  điều kiên  if(!p.getPhone().contains(phone1)) thì kết quả vẫn là add vào trong phoneList . Vậy thì đặt điêu kiện để làm gì ạ .
    //Giả sử khi xét nêú như  tên đã  có sẵn   if(p.getName().equals(name1)) thì không thêm vào phoneList nữa thì viết lệnh thế nào ạ. Cả trường hợp của số điện thoại nữa
    // nếu số đã có sẵn rồi thì không thêm nữa viết thế nào ạ .




    @Override
    public void removePhone(String name) {
        for(SoDienThoai p:phoneList){
            if(p.getName().equals(name)){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (SoDienThoai p:phoneList){
            if(p.getName().equals(name)){
                p.addPhone(newPhone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for(SoDienThoai p:phoneList){
            if(p.getName().equals(name)){
                System.out.println("Da tim thay");
                return;
            }
        }
        System.out.println("Khong co trong danh ba");
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<SoDienThoai>() {
            @Override
            public int compare(SoDienThoai o1, SoDienThoai o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void printPhoneList(){
        for(SoDienThoai p :phoneList){
            System.out.println(p.getName());
            for(String s:p.getPhone()){
                System.out.println(s);
            }
        }
    }
}

////Vì sao lại không chuyền luôn vào hàm thư thông thường đc , vì cái khai báo ở trên
//        // không phải là SoDienThoai . Nếu mà cho là sdt thì mói co thể add vào đc

