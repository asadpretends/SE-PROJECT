package BusinessLogic;

public class Announcement extends Posts
{
    String text;

    public Announcement()
    {
        super();
        text = "";
    }
    public void UploadContent(String teachername,String material)
    {
        this.teachername = teachername;
        text = material;
    }
    public String getText() {
        return text;
    }
    public void Display()
    {
        System.out.println("Teacher Name: "+super.teachername);
        System.out.println("Date: "+super.datee);
        System.out.println("Time: "+super.timee);
        System.out.println("Text: "+text+"\n");
    }
}
