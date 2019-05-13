import java.io.*;
import java.text.DecimalFormat;
 
public class ex1150_ExceedingZ
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
        try
        {
			int x = Integer.parseInt( br.readLine() );
			int z = Integer.parseInt( br.readLine() );
			int counter = 1;
			int temp = x;
			
			while( x >= z )
			{
				z = Integer.parseInt( br.readLine() );
			}
			
			while( temp <= z )
			{
				temp += ( x + counter );	
				counter++;
			}
			
			bw.write( counter + "\n" );;
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}