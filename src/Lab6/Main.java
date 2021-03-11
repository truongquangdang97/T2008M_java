package Lab6;
//
public class Main {
    public static void main(String[] args){
        DanhBa pb = new DanhBa();
        pb.insertPhone("quang","012");
        pb.insertPhone("dang","013");
        pb.insertPhone("chien","0124");
        pb.insertPhone("tuan","0125");

        pb.printPhoneList();

    }
}
