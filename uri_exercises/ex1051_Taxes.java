import java.io.*;
import java.text.DecimalFormat;
 
public class ex1051_Taxes
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#0.00");
		
		try
		{
			double n = Double.parseDouble(br.readLine());
            double taxes = 0.0;
             
            n -= 2000.0;
             
            if(n > 0.0)
            {
                if(n > 1000.0)
                {
                    taxes += (1000 * 0.08);
                     
                    n -= 1000.0;
                     
                    if(n > 1500.0)
                    {
                        taxes += (1500.0 * 0.18);
                         
                        n -= 1500.0;
                        taxes += (n * 0.28);
                    }
                    else
                    {
                        taxes += (n * 0.18);
                    }
                }
                else
                {
                    taxes += (n * 0.08);
                }
                
                bw.write("R$ " + df.format(taxes) + "\n");
                
            }
            else
            {
            	bw.write("Isento\n");
            }
             
            bw.flush();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}