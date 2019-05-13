import java.io.*;
import java.text.DecimalFormat;
 
public class ex1010_SimpleCalculate
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "#.00" );

		try
		{
			String[] line1 = br.readLine().split( " " );
			String[] line2 = br.readLine().split( " " );

			double pay = ( Integer.parseInt( line1[1] ) * Double.parseDouble( line1[2] )) + ( Integer.parseInt( line2[1] ) * Double.parseDouble( line2[2] ));
			bw.write( "VALOR A PAGAR: R$ " + df.format(pay) + "\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}