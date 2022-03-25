package BusinessLogic;

import java.util.Scanner;

public class CMS
{
    public ClassroomPicker classrooms = new ClassroomPicker();
    public TeacherAccounts teachers = new TeacherAccounts();
    public StudentAccounts students = new StudentAccounts();


    static String getAlphaNumericString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++)
        {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    public void TeacherMenu()
    {
        while(true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register");
            System.out.println("3. Create Classroom");
            System.out.println("4. See Enrolled Students");
            System.out.println("5. Remove student from class");
            System.out.println("6. Announce Something to class");
            System.out.println("7. Upload material");
            System.out.println("8. Take attendance");
            System.out.println("9. Display all classroom details with enrolled students");
            System.out.println("10. Display Profile");
            System.out.println("11. Logout");
            System.out.println("12. Exit");
            System.out.print("Enter an option: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();
            if (choice > 2 && choice < 12) {
                if(teachers.Teacherloggedin()==false){
                System.out.println("Please login first");
                return;}
            }
            if (choice == 1 || choice == 2) {
                if (teachers.Teacherloggedin()) {
                    System.out.println("Please logout first");
                    return;
                }
            }
            if (choice == 1)
            {
                String email, password;
                System.out.print("Enter Email: ");
                email = input.nextLine();
                System.out.print("Enter Password: ");
                password = input.nextLine();
                teachers.LoginIn(email, password);
            }
            else if (choice == 2)
            {
                String email, password, name, cnic;
                System.out.print("Enter Email: ");
                email = input.nextLine();
                System.out.print("Enter Password: ");
                password = input.nextLine();
                System.out.print("Enter Name: ");
                name = input.nextLine();
                System.out.print("Enter Cnic: ");
                cnic = input.nextLine();
                teachers.RegisterTeacher(name, password, email, cnic);

            }
            else if (choice == 3)
            {
                String clasromcode = getAlphaNumericString(8);
                String instructor = teachers.GetloggedInTeacher().email;
                System.out.print("Enter course name: ");
                String coursename = input.nextLine();
                System.out.print("Enter course code: ");
                String coursecode = input.nextLine();
                classrooms.createclassroom(clasromcode,instructor,coursename,coursecode);
            }
            else if (choice == 4)
            {
                String instructor = teachers.GetloggedInTeacher().email;
                System.out.println("Enter classroomcode: ");
                String classroomcode = input.nextLine();
                classrooms.DisplayEnrolledStudents(instructor,classroomcode);
            }
            else if (choice == 5)
            {
                System.out.println("Enter email: ");
                String email = input.nextLine();
                System.out.println("Enter classroomcode: ");
                String classroomcode = input.nextLine();
                classrooms.RemoveStudent(email,classroomcode);
            }
            else if (choice == 6)
            {
                System.out.println("Enter classroomcode: ");
                String classroomcode = input.nextLine();
                System.out.println("Enter text: ");
                String text = input.nextLine();
               // classrooms.PostAnnouncement(classroomcode,text,teachers.GetloggedInTeacher().name);

            }
            else if (choice == 7)
            {
                System.out.println("Enter classroomcode: ");
                String classroomcode = input.nextLine();
                System.out.println("Enter FilePath: ");
                String path = input.nextLine();
                System.out.println("Enter Filename: ");
                String fname = input.nextLine();
                System.out.println("Enter Filetype: ");
                String ft = input.nextLine();
             //   classrooms.uploadmaterial(classroomcode,path,fname,ft,teachers.GetloggedInTeacher().name);
            }
            else if (choice == 8)
            {
                System.out.print("Enter classroomcode: ");
                String gc = input.nextLine();
             //   classrooms.TakeAttendance(gc);
            }
            else if (choice == 9)
            {
                String instructor = teachers.GetloggedInTeacher().email;
                classrooms.Display(instructor);
            }
            else if (choice == 10)
            {
                teachers.Display();
            }
            else if (choice == 11)
            {
                teachers.Logout();
            }
            else if (choice == 12)
            {
                teachers.Logout();
                return;
            }
        }
    }
    public void StudentMenu()
    {
        while(true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register");
            System.out.println("3. Join class");
            System.out.println("4. See announcements");
            System.out.println("5. leave classroom");
            System.out.println("6. See upload material");
            System.out.println("7. See attendance");
            System.out.println("8. See Profile");
            System.out.println("9. Logout");
            System.out.println("10. Exit");
            System.out.print("Enter an option: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

            if (choice > 2 && choice < 10) {
                if (students.Studentloggedin() == false) {
                    System.out.println("Please login first");
                    return;
                }
            }
            if (choice == 1 || choice == 2) {
                if (students.Studentloggedin()) {
                    System.out.println("Please logout first");
                    return;
                }
            }

            if (choice == 1) {
                String email, password;
                System.out.print("Enter Email: ");
                email = input.nextLine();
                System.out.print("Enter Password: ");
                password = input.nextLine();
                students.LoginIn(email, password);
            } else if (choice == 2) {
                String email, password, name, program;
                System.out.print("Enter Email: ");
                email = input.nextLine();
                System.out.print("Enter Password: ");
                password = input.nextLine();
                System.out.print("Enter Name: ");
                name = input.nextLine();
                System.out.print("Enter Program: ");
                program = input.nextLine();
                students.RegisterStudent(name, password, email, program);
            } else if (choice == 3) {
                System.out.print("Enter classroom code: ");
                String code = input.nextLine();
                classrooms.Enrollstudent(code, students.GetloggedInStudent());
            } else if (choice == 4)
            {
                System.out.print("Enter classroom code: ");
                String code = input.nextLine();
              //  classrooms.SeeAnnoucements(code);
            }
            else if (choice == 5) {
                System.out.println("Enter classroom code: ");
                String code = input.nextLine();
                classrooms.RemoveStudent(students.GetloggedInStudent().email,code);

            } else if (choice == 6) {
                System.out.print("Enter classroom code: ");
                String code = input.nextLine();
           //     classrooms.SeeUploadedMaterial(code);
            } else if (choice == 7) {
                System.out.println("Enter classroom code: ");
                String gc = input.nextLine();
            //    classrooms.Displayattendance(gc,students.GetloggedInStudent().email);
            } else if (choice == 8) {
                students.Display();
            } else if (choice == 9) {
                students.Logout();
            } else if (choice == 10) {
                students.Logout();
                return;
            }
        }
    }
}
