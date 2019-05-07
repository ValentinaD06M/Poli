import java.io.*;
import java.text.DecimalFormat;
 
public class ex1117_ScoreValidation
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#.00");		

		try
		{
			int counter = 0;
			double mean = 0.0;
			double number;

			while(counter < 2)
			{
				number = Double.parseDouble(br.readLine());
				if(number >= 0.0 && number <= 10.0)
				{
					counter++;
					mean += number;
				}
				else
				{
					bw.write("nota invalida\n");
				}
			}

			mean /= 2.0;

			bw.write("media = " + df.format(mean) + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
