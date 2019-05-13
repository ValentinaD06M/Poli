import java.io.*;
 
public class ex1001_ExtremalyBasic
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int a, b, X;
			
			a = Integer.parseInt( br.readLine() );
			b = Integer.parseInt( br.readLine() );
			
			X = a + b;
			
			bw.write( "X = " + X + "\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}