import java.util.Scanner;

public class StudentUI{
    Scanner sc=new Scanner(System.in);
    public Student TakeInput(){
        String name,rollno,department;
        System.out.println("Enter the Name of student");
        name=sc.nextLine();
        System.out.println("Enter the Department of student");
        department=sc.nextLine();
        System.out.println("Enter the Roll Number of student");
        rollno=sc.nextLine();
       return new Student(name,rollno,department); 
    }
}