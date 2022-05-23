package BusinessLogic;

import java.util.StringTokenizer;

public class UploadMaterial extends Posts
{
    String filepath;

    String filename;

    String filetype;

    public void UploadContent(String teachername,String material)
    {
        this.teachername = teachername;
        StringTokenizer token = new StringTokenizer(material,",");
        filepath = token.nextElement().toString();
        filename = token.nextElement().toString();
        filetype = token.nextElement().toString();
    }
    public void Display()
    {
        System.out.println("Teacher Name: "+super.teachername);
        System.out.println("Date: "+super.datee);
        System.out.println("Time: "+super.timee);
        System.out.println("Filename: "+filename);
        System.out.println("Filepath: "+filepath);
        System.out.println("Filetype: "+filetype);
    }
}
