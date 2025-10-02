class Student
{
    int rollno;
    String name;
    int marks;
}

public class Objects {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        s1.rollno = 1;
        s1.name = "Saurabh";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollno = 12;
        s2.name = "Sagar";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sneha";
        s3.marks = 98;

        // System.out.println(s3.name + " : " + s3.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
