import java.io.*;
 
public class ex1151_EasyFibonacci
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine( ));
		   	int counter = 2;
		   	
		   	bw.write( "0 1" );
		   	
		   	int n1 = 0;
		   	int n2 = 1;
		   	int temp;
		   	
		   	while( counter < n )
		   	{
		   		temp = n1 + n2;
		   		bw.write(" " + temp);
		   		n1 = n2;
		   		n2 = temp;
		   		counter++;
		   	}
		   	
		   	bw.write( "\n" );
		   	bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}