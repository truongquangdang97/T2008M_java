package test;

import java.util.ArrayList;

public class test {
    ArrayList<String> grilList;

    public test(){
        grilList = new ArrayList<String>();
    }

    public void add(String a){
        grilList.add(a);
    }

    public void show(){
        for (String i:grilList){
            System.out.println(i);
        }
    }
}
