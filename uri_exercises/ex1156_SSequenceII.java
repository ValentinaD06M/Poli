import java.io.*;
import java.text.DecimalFormat;
 
public class ex1156_SSequenceII
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#.00");
        
        try
        {
			double i= 1.0; double j = 1.0;
			double sum = 0.0;
			
			while(i <= 39.0)
			{
				sum += i / j;
				i += 2.0;
				j *= 2.0;
				
			}
			
			bw.write(df.format(sum) + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}