package StudentAccount;

import BusinessLogic.StudentAccounts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentAccountTest {

        StudentAccounts obj;
        @Test
        public void PositiveTest(){
            obj= new StudentAccounts();
            obj.Studentloggedin();
            obj.search("asad@gmail.com");
            Assert.assertTrue(true, "mail present");
            obj.RegisterStudent("ayesha","1234","Ayesha@gmail.com","12345");
            Assert.assertTrue(true);
            obj.LoginIn("email","1234");
            Assert.assertTrue(true);
            obj.Studentloggedin();
        }


        @Test
        public void NegertiveTest(){
            obj= new StudentAccounts();
            obj.Studentloggedin();
            obj.search("asad@gmail.com");
            Assert.assertFalse(false, "null");
            obj.RegisterStudent("-","1234","-","12345");
            Assert.assertFalse(false);
            obj.LoginIn("null","1234");
            Assert.assertFalse(false);
            obj.Studentloggedin();

        }
    }
