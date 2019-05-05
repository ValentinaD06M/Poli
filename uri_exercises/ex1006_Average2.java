import java.io.*;
import java.text.DecimalFormat;
 
public class ex1006_Average2
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#0.0");
        
    	try
    	{
    		double A = Double.parseDouble(br.readLine());
    		double B = Double.parseDouble(br.readLine());
    		double C = Double.parseDouble(br.readLine());
    		double PROM = ((A * 0.2) + (B * 0.3) + (C * 0.5));
    	
    		bw.write("MEDIA = " + df.format(PROM) + "\n");
    		bw.flush();
    	
    		br.close();
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
	}
}
