import java.io.*;
import java.text.DecimalFormat;
 
public class ex1036_BashkaraFormula
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("##0.00000");
		
		try
		{
			String[] numbers = br.readLine().split( " " );
			  
			double a = Double.parseDouble( numbers[0] );
			double b = Double.parseDouble( numbers[1] );
			double c = Double.parseDouble( numbers[2] );
			  
			if( a == 0 || ((b*b) - (4*a*c)) < 0 )
			{
				bw.write( "Impossivel calcular\n" );
			}
			else
			{
				double r1 = (-b + Math.sqrt( Math.pow(b, 2.0) - (4 * a * c) )) / (2 * a);
				double r2 = (-b - Math.sqrt( Math.pow(b, 2.0) - (4 * a * c) )) / (2 * a);
				bw.write( "R1 = " + df.format(r1) + "\nR2 = " + df.format(r2) + "\n" );
			}

			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}