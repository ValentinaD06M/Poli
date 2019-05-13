import java.io.*;
import java.text.DecimalFormat;
 
public class ex1005_Average1
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "0.00000" );
		
		try
		{
			double a, b, x;
					
			a = Double.parseDouble( br.readLine() );
			b = Double.parseDouble( br.readLine() );
			
			x = (( a * 3.5 ) + ( b * 7.5 )) / 11;
			bw.write( "MEDIA = " + df.format(x) + "\n" );
			bw.flush();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}