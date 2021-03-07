package assi7;

public class Main {
    public static void main(String[] args){
        Class c= new Class();
        c.addStudent(1,"a",24,"Thai Binh",9);
        c.addStudent(2,"d",24,"Nam dinh",7);
        c.addStudent(3,"c",24,"Hai Phong",8);
        c.addStudent(4,"b",24,"binh duong",9);
//        c.editStudent(4);
//        c.deleteStudent(2);
//        c.showStuden();
//        c.sortGpa();
        c.sortName();
        System.out.println("Sau khi dc sap xep  lai ://////////////////////////");
        c.showStuden();
    }
}
