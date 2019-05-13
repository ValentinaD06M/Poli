import java.io.*;
 
public class ex1095_SequenceIJ1
{
	public static void main(String args[])
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int j = 60, i = 1;

			while( j >= 0 )
			{
				bw.write( "I=" + i + " J=" + j + "\n" );
				
				i += 3;
				j -= 5;
			}

			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}