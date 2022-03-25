package BusinessLogic;

import java.util.ArrayList;

public class ClassroomPicker
{
    ArrayList<Classroom> classrooms = new ArrayList<Classroom>();

    public void createclassroom(String clasrome,String instrmail,String cn,String cc)
    {
        Classroom obj = new Classroom(clasrome,instrmail,cn,cc);
        classrooms.add(obj);
        System.out.println("Classroom Created Code: "+clasrome);
    }
    public void DisplayEnrolledStudents(String instructorname,String coursecode)
    {
        for (int i=0;i<classrooms.size();i++)
        {
            if(classrooms.get(i).instructor.equalsIgnoreCase(instructorname) && classrooms.get(i).coursecode.equalsIgnoreCase(coursecode))
                classrooms.get(i).Display();
        }
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
