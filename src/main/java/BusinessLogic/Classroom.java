package BusinessLogic;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom
{
    String code;

    String instructor;

    String coursename;

    public Classroom()
    {

    }

    String coursecode;

    List<Student> enrolledstudents = new ArrayList<>();


    public Classroom(String code,String instructormail,String cn,String cc)
    {
        this.code = code;
        this.instructor = instructormail;
        this.coursename = cn;
        this.coursecode = cc;
    }

    public void Display()
    {
        System.out.println("\n\nClassroom Code: "+code);
        System.out.println("Instructor Email: "+instructor);
        System.out.println("Course name: "+coursename);
        System.out.println("Course code: "+coursecode);
        System.out.println("Enrolled Students: ");
        for (int i=0;i<enrolledstudents.size();i++)
        {
            enrolledstudents.get(i).Display();
        }
    }
    public Student Searchenroll(String email)
    {
        for (int i =0;i<enrolledstudents.size();i++)
        {
            if(enrolledstudents.get(i).email.equalsIgnoreCase(email))
                return enrolledstudents.get(i);
        }
        return null;
    }
    public void RemoveStudent(String email)
    {
        if(Searchenroll(email) == null)
            System.out.println("Not present");
        else
            enrolledstudents.remove(Searchenroll(email));
    }
    public boolean Addstudent(Student obj)
    {
        if(Searchenroll(obj.email) == null) {
           enrolledstudents.add(obj);
           return true;
        }
        else
            System.out.println("Already enrolled");

        return false;
    }
}
