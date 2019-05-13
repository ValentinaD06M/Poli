import java.io.*;
 
public class ex1072_Interval2
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
        {
		   	int n = Integer.parseInt( br.readLine() );
		   	int counter = 0;
		   	int number; 
		   	
		   	for(int i = 0; i < n; i++)
		   	{
		   		number = Integer.parseInt( br.readLine() );

		   		if( number > 9 && number < 21 )
		   		{
		   			counter++;
		   		}
		   	}
		   	
		   	bw.write( counter + " in\n" + ( n - counter ) + " out\n" );
		   	bw.flush();
		    br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}