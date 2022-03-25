package BusinessLogic;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        CMS googleclassroom = new CMS();
        while(true) {
            try {
                System.out.println("\n1. Teacher");
                System.out.println("2. Student");
                System.out.println("3. Exit");
                Scanner input = new Scanner(System.in);
                System.out.print("Choose: ");
                int option = input.nextInt();
                if (option == 1)
                    googleclassroom.TeacherMenu();
                else if (option == 2)
                    googleclassroom.StudentMenu();
                else if (option == 3)
                    break;
                else
                    System.out.print("Enter correct option");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            }
    }
}
