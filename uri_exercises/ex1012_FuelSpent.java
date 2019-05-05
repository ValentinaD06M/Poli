import java.io.*;
import java.text.DecimalFormat;
 
public class ex1012_FuelSpent
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#.000");

		try
		{
			int time = Integer.parseInt(br.readLine());
			int velocity = Integer.parseInt(br.readLine());

			double liters = (time * velocity) / 12.0;

			bw.write(df.format(liters) + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
