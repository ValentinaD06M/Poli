import java.io.*;
import java.text.DecimalFormat;
 
public class ex1043_Triangle
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#0.0");

		try
		{
			String[] numbers = br.readLine().split(" ");
			double a = Double.parseDouble(numbers[0]);
			double b = Double.parseDouble(numbers[1]);
			double c = Double.parseDouble(numbers[2]);
			double result;
			 
			if((b - c) < a && a < (b + c) && (a - c)< b && b <(a + c) && (a - b)< c && c < (a + b))
			{
				result = a + b + c;
				bw.write("Perimetro = " + df.format(result) + "\n");
			}
			else
			{
				result = ((a + b) * c)/ 2.0;
				bw.write("Area = " + df.format(result) + "\n");
			}	
		
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
