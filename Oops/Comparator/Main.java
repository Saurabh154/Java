package Oops.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
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

}

class SortBySalary implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.salary - o2.salary;
    }
}

//class SortByName implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2){
//        return s1.id - s2.id;
//    }
//}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Saurabh", 200000));
        list.add(new Student(102, "Sagar", 100000));
        list.add(new Student(103, "Abhi", 300000));
        list.add(new Student(104, "Lahari", 400000));
        list.add(new Student(105, "Angel", 20000));

        Collections.sort(list, new SortBySalary());

//        for(Student s : list){
//            System.out.println(s.id + "\t" + s.name + "\t" + s.salary );
//        }

        for(Student s : list){
            System.out.println(s);
        }

    }
}
