package Oops.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int id, salary;
    String name;

    public Student(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return id +"\t" + name+"\t" + salary;
    }

    public int compareTo(Student s) {
        if(salary == s.salary){
            return 0;
        } else if (salary > s.salary){
            return 1;
        }
        else{
            return -1;
        }
    }

}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Saurabh", 200000));
        list.add(new Student(102, "Sagar", 100000));
        list.add(new Student(103, "Abhi", 300000));
        list.add(new Student(104, "Lahari", 400000));
        list.add(new Student(105, "Angel", 20000));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.id + "\t" + s.name + "\t" + s.salary );
        }

//        for(Student s : list){
//            System.out.println(s);
//        }
    }
}
