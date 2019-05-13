import java.io.*;
 
public class ex1067_OddNumbers
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int numbers = Integer.parseInt( br.readLine() );
        	
		   	for(int i = 1; i <= numbers; i+=2)
		   	{
		   		bw.write( i + "\n" );
		   	}
		   	
		   	bw.flush();
            br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}