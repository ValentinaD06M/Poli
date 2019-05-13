import java.io.*;
import java.text.DecimalFormat;
 
public class ex1009_SalaryWithBonus
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df =  new DecimalFormat( "####.00" );		

		try
		{
			double salary = Double.parseDouble( br.readLine() );
			double sold = Double.parseDouble( br.readLine() );
			double total = salary + ( sold * 0.15 );
			
			bw.write( "TOTAL = R$ " + df.format(total) + "\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}