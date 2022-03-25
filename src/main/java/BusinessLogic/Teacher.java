package BusinessLogic;


import javax.persistence.*;

public class Teacher
{
    String name;

    String cnic;

    String password;


    String email;

    boolean login;

    public Teacher()
    {
        name = "";
        cnic = "";
        email = "";
        password = "";
        login = false;
    }
    public Teacher(String name, String email,String cnic, String password)
    {
        this.name = name;
        this.email = email;
        this.cnic = cnic;
        this.password = password;
        this.login = false;
    }
    public Teacher(Teacher obj)
    {
        this.email = obj.email;
        this.name = obj.name;
        this.cnic = obj.cnic;
        this.password = obj.password;
        this.login = false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
