import java.io.*;
import java.text.DecimalFormat;
 
public class ex1154_Ages
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#.00");         
 
        try
       	{
           	int num;
			int acum = 0;
			int counter = 0;
			double average;
			 
			while((num = Integer.parseInt(br.readLine())) >= 0 )
			{
				acum += num;
				counter++;
			}
			 
			average = (double) acum / counter;
         	bw.write(df.format(average) + "\n");
        	bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}