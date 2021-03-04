package Bai_tap_kho;

public class Emploee {
    private String name;
    private Double salary;
    private String phone;

    public Emploee() {
    }

    public Emploee(String name, Double salary, String phone) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
