import java.io.*;
import java.text.DecimalFormat;
 
public class ex1014_Consumption
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "#.000" );
		
		try
		{
			int X = Integer.parseInt( br.readLine() );
			double Y = Double.parseDouble( br.readLine() );
			double result = (double)(X / Y);

			bw.write( df.format( result ) + " km/l\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}