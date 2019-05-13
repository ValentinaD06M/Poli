import java.io.*;
 
public class ex1144_LogicalSequence
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine() );
			int a, b;
			
			for(int i = 1; i <= n; i++)
			{
				a = i * i;
				b = a * i;
				bw.write( i + " " + a + " " + b + "\n" );
				bw.write( i + " " + (a + 1) + " " + (b + 1) + "\n" );
			}
   
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}