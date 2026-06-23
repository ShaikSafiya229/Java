import java.io.File;
public class File_Handling {
    public static void main(String[] args)
     {
        try{
        File Data =new File("Sample.java");
        Data.delete();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}