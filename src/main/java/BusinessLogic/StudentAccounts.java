package BusinessLogic;

import java.util.ArrayList;

public class StudentAccounts
{
    ArrayList<Student> students = new ArrayList<>();

    public boolean Studentloggedin()
    {
        for (int i =0;i<students.size();i++)
        {
            if(students.get(i).login==true)
                return true;
        }
        return false;
    }
    public Student search(String email)
    {
        for (int i =0;i<students.size();i++)
        {
            if(students.get(i).email.equalsIgnoreCase(email))
                return students.get(i);
        }
        return null;
    }
    public void RegisterStudent(String name,String password,String email,String Program)
    {
        Student obj = new Student(name,email,Program,password);
        if(search(email) == null) {
            students.add(obj);
            System.out.println("Added Student");
        }
        else
            System.out.println("Already Added With this email");
    }
    public void LoginIn(String email,String password)
    {
        if(search(email) == null)
            System.out.print("No Student present with this email");
        else
        {
            if(search(email).password.equalsIgnoreCase(password)) {
                search(email).login = true;
                System.out.print("logged in");
            }
            else
                System.out.print("Incorrect Password");
        }
    }
    public Student GetloggedInStudent()
    {
        for (int i =0;i<students.size();i++)
        {
            if(students.get(i).login == true)
                return students.get(i);
        }
        return null;
    }
    public void Logout()
    {
        GetloggedInStudent().login = false;
    }
    public void Display()
    {
        Student obj = GetloggedInStudent();
        System.out.println("Name: "+obj.name);
        System.out.println("Program: "+obj.Program);
        System.out.println("Email: "+obj.email);
        System.out.println("Password: "+obj.password);
        obj.DisplayJoinedClassrooms();
    }
    ArrayList<Student> GetStudents()
    {
        return students;
    }
}
