import java.io.*;
import java.text.DecimalFormat;
 
public class ex1155_SSequence
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("0.00");  
        
        try
       	{
        	double n = 0.0;
        
        	for(int i = 1; i <= 100; i++)
        	{
        		n += (1.0 / i);	
        	}
        	
		   	bw.write(df.format(n) + "\n");
		   	bw.flush();
        	
        	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}