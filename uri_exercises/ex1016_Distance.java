import java.io.*;
 
public class ex1016_Distance
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int distance = Integer.parseInt( br.readLine() );
			int time = distance * 2;

			bw.write( time + " minutos\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}