package BusinessLogic;

import java.util.ArrayList;
import java.util.List;

public class ClassroomPicker
{
    ArrayList<Classroom> classrooms = new ArrayList<Classroom>();

    public void createclassroom(String clasrome,String instrmail,String cn,String cc)
    {
        Classroom obj = new Classroom(clasrome,instrmail,cn,cc);
        classrooms.add(obj);
        System.out.println("Classroom Created Code: "+clasrome);
    }
    public List<Student> DisplayEnrolledStudents(String instructoremail, String coursecode)
    {
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).instructor.equalsIgnoreCase(instructoremail) && classrooms.get(i).code.equalsIgnoreCase(coursecode)) {
                return classrooms.get(i).getEnrolledstudents();
            }
        }
        return null;
    }

    public void SeeUploadedMaterial(String gc)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(gc)) {
                classrooms.get(i).Displayupload();
            }
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public void SeeAnnoucements(String gc)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(gc))
                classrooms.get(i).Displayannoucements();
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public ArrayList<Posts> getAnnoucements(String gc)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(gc))
                return classrooms.get(i).Displayannoucements();
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
        return null;
    }
    public void uploadmaterial(String gc,String path,String fn,String ft,String teacher)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(gc)) {
                classrooms.get(i).uploadsomething(teacher, path, fn, ft);
            }
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public void TakeAttendance(String code)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(code))
                classrooms.get(i).Takeattendance();
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public void Displayattendance(String gc,String email)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(gc))
                classrooms.get(i).ShowAttendance(email);
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public void PostAnnouncement(String gc,String txt,String teacher)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(gc)) {
                classrooms.get(i).makeannoucement(teacher, txt);
            }
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public void Enrollstudent(String classroomcode,Student obj)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(classroomcode)) {
                classrooms.get(i).Addstudent(obj);
            }
            else
                flag = true;
        }
        if(flag == false)
        {
            obj.joinedclasses.add(classroomcode);
        }
        else if(flag == true)
            System.out.println("Invalid code");
    }

    public void RemoveStudent(String email,String classroomcode)
    {
        boolean flag = false;
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).code.equalsIgnoreCase(classroomcode))
                classrooms.get(i).RemoveStudent(email);
            else
                flag = true;
        }
        if(flag == true)
            System.out.println("Invalid code");
    }
    public void Display(String instructormail)
    {
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).instructor.equalsIgnoreCase(instructormail))
                classrooms.get(i).Display();
        }
    }

}
