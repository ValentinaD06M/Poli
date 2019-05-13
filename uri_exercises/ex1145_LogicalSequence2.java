import java.io.*;
 
public class ex1145_LogicalSequence2
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] numbers = br.readLine().split(" ");
		   	int x = Integer.parseInt( numbers[0] );
		   	int y = Integer.parseInt( numbers[1] );
		   	
		   	for(int i = 1; i <= y; i++)
		   	{
		   		bw.write(i + "");
		   		
		   		if( i % x == 0 )
		   		{
		   			bw.write( "\n" );
		   		}
		   		else
		   		{
		   			bw.write( " " );
		   		}
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