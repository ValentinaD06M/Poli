import java.io.*;
import java.text.DecimalFormat;
 
public class ex1015_DistanceBetweenTwoPoints
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "##0.0000" );
		
		try
		{
			String[] line1 = br.readLine().split( " " );
			String[] line2 = br.readLine().split( " " );
			 
			double x1 = Double.parseDouble( line1[0] );
			double y1 = Double.parseDouble( line1[1] );
			 
			double x2 = Double.parseDouble( line2[0] );
			double y2 = Double.parseDouble( line2[1] );
			 
			double distance = Math.sqrt( Math.pow( (x2 - x1), 2.0 ) + Math.pow( (y2 - y1), 2.0) );
			bw.write( df.format( distance ) + "\n" );
			bw.flush();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}