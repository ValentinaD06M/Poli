import java.io.*;
import java.text.DecimalFormat;
 
public class ex1011_Sphere
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("##0.000");
		
		try
		{
			long R = Integer.parseInt( br.readLine() );
			 double vol = (double) ((4.0 / 3.0) * 3.14159 * Math.pow(R, 3));
			
			bw.write( "VOLUME = " + df.format( vol) + "\n");
			bw.flush();
		}
		catch(Exception e) {}
	}
}
