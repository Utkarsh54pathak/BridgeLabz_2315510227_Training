import java.util.ArrayList;

class Student{
    String name;
    String id;
    String course;
    
    public Student(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    
    public void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: " + this.id);
        System.out.println("Course: " + this.course);
    }
}

class Faculty{
    String name;
    String id;
    String department;

    public Faculty(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void display() {
        System.out.println("Faculty Name: " + this.name);
        System.out.println("Faculty ID: " + this.id);
        System.out.println("Department: " + this.department);
    }
}

public class CollegeSystem{
    public static void main(String args[]){

    }
}