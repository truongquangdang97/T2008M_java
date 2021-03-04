package Bai_tap_kho;




public class Validate implements Vali {

    @Override
    public double f1(Emploee e) {
        double salary = e.getSalary();
        if (e.getSalary()>2000){
            return salary+0.1*salary;
        }else{
            return salary;
        }

    }

    @Override
    public String f2(Emploee e) {
        String phone = e.getPhone();
        String result="";
        for (int i =0;i<phone.length();i+=3){
            result = result+ phone.substring(i,i+3)+"-";
        }
        return result.substring(0,result.length()-1);
    }
}
