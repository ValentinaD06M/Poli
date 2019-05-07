import java.io.*;
import java.text.DecimalFormat;
 
public class ex1079_WeightedAverages
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("0.0");
		
		try
		{
			int numbers = Integer.parseInt(br.readLine());
		   	String[] ns;
		   	double value;
		   	
		   	for(int i = 0; i < numbers; i++)
		   	{
		   		ns = br.readLine().split(" ");
		   		value = ((Double.parseDouble(ns[0]) * 2) + (Double.parseDouble(ns[1]) * 3) + (Double.parseDouble(ns[2]) * 5)) / 10.0;
		   		
		   		bw.write(df.format(value) + "\n");
		   	}
		   	
		   	bw.flush();
            	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
