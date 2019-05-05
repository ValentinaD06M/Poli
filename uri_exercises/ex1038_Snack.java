import java.io.*;
import java.text.DecimalFormat;
 
public class ex1038_Snack
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("##.00");

		try
		{
			String[] numbers = br.readLine().split(" ");
			int code = Integer.parseInt(numbers[0]);
			int amount = Integer.parseInt(numbers[1]);
			 
			double price = 0.0;
			 
			switch(code)
			{
				case 1:
				{
					price = 4.00 * amount;
				}
				break;
				 
				case 2:
				{
					price = 4.50 * amount;
				}
				break;
				 
				case 3:
				{
					price = 5.00 * amount;
				}
				break;
				 
				case 4:
				{
					price = 2.00 * amount;
				}
				break;
				 
				case 5:
				{
					price = 1.50 * amount;
				}
				break;
			}
			 
			bw.write("Total: R$ " + df.format(price) + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}