package TeacherAccount;

import BusinessLogic.TeacherAccounts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeacherAccountTest {
        TeacherAccounts obj;
        @Test
        public void PositiveTest(){
            obj= new TeacherAccounts();
            obj.Teacherloggedin();
            obj.search("maryam@gmail.com");
            Assert.assertTrue(true, "Mail added");
            obj.RegisterTeacher("ayesha","1234","Ayesha@gmail.com","12345");
            Assert.assertTrue(true);
            obj.LoginIn("email","1234");
            Assert.assertTrue(true);
            obj.GetloggedInTeacher();




        }
        @Test
        public void NegetiveTest(){
            obj= new TeacherAccounts();

            obj.Teacherloggedin();
            obj.search("-");
            Assert.assertFalse(false, "NULL");
            obj.RegisterTeacher("-","-","-","-");
            Assert.assertFalse(false);
            obj.LoginIn("email","-");
            Assert.assertFalse(false);
            obj.GetloggedInTeacher();

        }

    }

