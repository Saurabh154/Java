package Oops.Encapsulation;

class Doctor{
    private String name;
    private int salary;
    private String phno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

public class Main2 extends Doctor {
    public static void main(String[] args) {
        // create a class name doctor and have three variables name, salary ans phno. Make all those three as private and generate getters and setters.
        // and in test class call those getter and setters in this class.

        Main2 m = new Main2();
        m.setName("Angel");
        m.setSalary(300000);
        m.setPhno("8747836278");

        System.out.println("Doctor : " + m.getName());
        System.out.println("Phone  : " + m.getPhno());
        System.out.println("Salary : " + m.getSalary());
    }
}
