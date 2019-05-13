import java.io.*;
 
public class ex1146_GrowingSequences
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String line;
			int n = Integer.parseInt( br.readLine() );
			
			while(n > 0)
			{
				line = "1";
				
				for(int i = 2; i <= n; i++)
				{
					line += " " + i;
				}
				
				bw.write( line + "\n" );
				bw.flush();
				
				n = Integer.parseInt( br.readLine() );
			}
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}