import java.io.*;
 
public class ex1132_MultiplesOf13
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int X = Integer.parseInt( br.readLine() );
			int Y = Integer.parseInt( br.readLine() );
			
			int acum = 0;
			
			if(X < Y)
			{
				for(int i = X; i <= Y; i++)
				{
					acum += ( i % 13 ) != 0 ? i : 0;
				}
			}
			else
			{
				for(int i = Y; i <= X; i++)
				{
					acum += ( i % 13 ) != 0 ? i : 0;
				}
			}
			
			bw.write( acum + "\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}