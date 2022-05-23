package BusinessLogic;

import java.time.LocalDate;
import java.time.LocalTime;


public class Posts
{
    String datee = LocalDate.now().toString();

    String timee = LocalTime.now().toString();

    String teachername;

    public String getTeachername() {
        return teachername;
    }

    public String getTimee() {
        return timee;
    }

    public String getDatee() {
        return datee;
    }

    public Posts()
    {
        teachername = "";
    }

    public void UploadContent(String teachername,String material)
    {

    }
    public void Display()
    {

    }
}
