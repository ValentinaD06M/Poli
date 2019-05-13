import java.io.*;
 
public class ex1078_MultiplicationTable
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine() );
		   	int result = 0;
		   	
		   	for(int i = 1; i < 11; i++)
		   	{
		   		result += n;
		   		bw.write( i + " x " + n + " = " + result + "\n" );
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