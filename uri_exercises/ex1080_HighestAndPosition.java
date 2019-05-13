import java.io.*;
 
public class ex1080_HighestAndPosition
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int max = 0; 
			int index = -1;
			int n;

			for(int i = 0; i < 100; i++)
			{
				n = Integer.parseInt( br.readLine() );
				if( n > max )
				{
					max = n; 
					index = i + 1;
				}
			}

			bw.write( max + "\n" + index + "\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}