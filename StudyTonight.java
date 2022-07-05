import java.io.FileOutputStream;
import java.io.IOException;
public class StudyTonight 
{
	public static void main(String[] args) throws IOException 
	{  
		try
		{    
			byte arr[] = "Hello studytonight".getBytes();
			FileOutputStream fout=new FileOutputStream("Sample.txt");    
			fout.write(arr);    
			fout.close();    
			System.out.println("Text written to the file successfully.");    
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}    
	}  
}