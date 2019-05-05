import java.io.*;
import java.text.DecimalFormat;
 
public class ex1064_PositivesAndAverage
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#0.0");

		try
		{
			int counter = 0;
			double average = 0.0;
			double temp;

			for(int i = 0; i < 6; i++)
			{
				temp = Double.parseDouble(br.readLine());
				average += temp > 0.0 ? temp : 0;
				counter += temp > 0.0 ? 1 : 0;
			}

			average /= counter;

			bw.write(counter + " valores positivos\n" + df.format(average) + "\n");
			bw.flush();
        	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
