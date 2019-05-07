import java.io.*;
 
public class ex1097_SequenceIJ3
{
	public static void main(String args[])
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			for(int i = 1; i < 10; i += 2)
		   	{
		   		for(int j = i + 6; j > i + 3; j--)
		       	{
		       		bw.write("I=" + i + " J=" + j + "\n");
		       	}
		   	}
		   	
		   	bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}