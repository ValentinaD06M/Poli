import java.io.*;
 
public class ex1065_EvenBetweenFiveNumbers
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int counter = 0;

			for(int i = 0; i < 5; i++)
			{
				counter += Integer.parseInt( br.readLine() ) % 2 == 0 ? 1 : 0;
			}

			bw.write( counter + " valores pares\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}