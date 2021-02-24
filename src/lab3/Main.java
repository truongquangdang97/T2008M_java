package lab3;

public class Main {
    public static void main(String[] args){
        Room r = new Room();

        r.setName("t2008");
        r.setPosition("20");
        r.addUser("truong dang quang");
        r.addUser("hoang anh tu");
        r.addUser("dang anh tuan");
        r.removeUser(1);
        r.printRoom();
    }
}
