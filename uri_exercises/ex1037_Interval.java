import java.io.*;
 
public class ex1037_Interval
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			double number = Double.parseDouble( br.readLine() );
			 
			if( number < 0.0 || number > 100.0 )
			{
				bw.write( "Fora de intervalo\n" );
			}
			else
			{
				String response = number > 25.000 ? number > 50.000 ? number > 75.0 ? "(75,100]" : "(50,75]" : "(25,50]" : "[0,25]";
				bw.write( "Intervalo " + response + "\n" );
			}

			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}