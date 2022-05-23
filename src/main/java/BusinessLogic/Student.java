package BusinessLogic;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    public Student(String name, String email, String program,String password) {
        this.name = name;
        this.email = email;
        Program = program;
        this.password = password;
    }


    String name;


    String email;

    String Program;

    String password;

    int attendance = 100;


    List<String> joinedclasses = new ArrayList<>();

    boolean login;

    public Student()
    {
        name = "";
        email = "";
        Program = "";
        login = false;
    }
    public void reduceattendance()
    {
        int red = attendance*3/100;
        attendance -= red;
    }
    public void Display()
    {
        System.out.println("Name: "+name+"\tEmail: "+email+"\tProgram: "+Program);
    }
    public void DisplayJoinedClassrooms()
    {
        System.out.print("\nJoined Classrooms: ");
        for (int i=0;i<joinedclasses.size();i++)
        {
            System.out.print(joinedclasses.get(i));
        }
        System.out.println("\n");
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return Program;
    }
}
