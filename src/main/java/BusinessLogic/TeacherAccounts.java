package BusinessLogic;

import java.util.ArrayList;

public class TeacherAccounts
{
    ArrayList<Teacher> teachers;

    public TeacherAccounts()
    {
        teachers = new ArrayList<Teacher>();
    }

    public boolean Teacherloggedin()
    {
        for (int i =0;i<teachers.size();i++)
        {
            if(teachers.get(i).isLogin()==true)
                return true;
        }
        return false;
    }
    public Teacher search(String email)
    {
        for (int i =0;i<teachers.size();i++)
        {
            if(teachers.get(i).email.equalsIgnoreCase(email))
                return teachers.get(i);
        }
        return null;
    }
    public void RegisterTeacher(String name,String password,String email,String cnic)
    {
        Teacher obj = new Teacher(name,email,cnic,password);
        if(search(email) == null) {
            teachers.add(obj);
            System.out.println("Added teacher");
        }
        else
            System.out.println("Already Added With this email");
    }

    public void LoginIn(String email,String password)
    {
        if(search(email) == null)
            System.out.print("No teacher present with this email");
        else
        {
            if(search(email).password.equalsIgnoreCase(password)) {
                search(email).setLogin(true);
                System.out.print("logged in");
            }
            else
                System.out.print("Incorrect Password");
        }
    }
    public Teacher GetloggedInTeacher()
    {
        for (int i =0;i<teachers.size();i++)
        {
            if(teachers.get(i).isLogin() == true)
                return teachers.get(i);
        }
        return null;
    }
    public void Logout()
    {
        GetloggedInTeacher().setLogin(false);
    }
    public void Display()
    {
        Teacher obj = GetloggedInTeacher();
        System.out.println("Name: "+obj.name);
        System.out.println("Cnic: "+obj.cnic);
        System.out.println("Email: "+obj.email);
        System.out.println("Password: "+obj.password);
    }
    ArrayList<Teacher> GetTeachers()
    {
        return teachers;
    }
}
