import java.io.*;
import java.text.DecimalFormat;
 
public class ex1008_Salary
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "#0.00" );

		try
		{
			int A,B;
			double C,prom;

			A = Integer.parseInt( br.readLine( ));
			B = Integer.parseInt( br.readLine() );
			C = Double.parseDouble( br.readLine() );

			prom = B * C;

			bw.write( "NUMBER = " + A + "\n" + "SALARY = U$ " + df.format(prom)+ "\n" );
			bw.flush();
        }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}