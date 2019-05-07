import java.io.*;
import java.text.DecimalFormat;
 
public class ex1094_Experiments
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
	 	DecimalFormat df = new DecimalFormat("#0.00");
           
        	try
        	{
		   	int n = Integer.parseInt(br.readLine());
		   	String[] data;
		   	int total = 0, coelhos = 0, ratos = 0, sapos = 0;
		   	double temp;
        	
		   	for(int i = 0; i < n; i++)
		   	{
		   		data = br.readLine().split(" ");
		   		total += Integer.parseInt(data[0]);
		   		
		   		switch(data[1])
		   		{
		   			case "C":
		   			{
		   				coelhos += Integer.parseInt(data[0]);
		   			}
		   			break;
		   			case "R":
		   			{
		   				ratos += Integer.parseInt(data[0]);
		   			}
		   			break;
		   			case "S":
		   			{
		   				sapos += Integer.parseInt(data[0]);
		   			}
		   			break;
		   		}
		   	}
        	
		   	bw.write("Total: " + total + " cobaias\n");
		   	bw.write("Total de coelhos: " + coelhos + "\n");
		   	bw.write("Total de ratos: " + ratos + "\n");
		   	bw.write("Total de sapos: " + sapos + "\n");
		   	
			temp = (double)(coelhos * 100) / (double)total;
		   	bw.write("Percentual de coelhos: " + df.format(temp) + " %\n");

		   	temp = (double)(ratos * 100) / (double)total;
		   	bw.write("Percentual de ratos: " + df.format(temp) + " %\n");

		   	temp = (double)(sapos * 100) / (double)total;
		   	bw.write("Percentual de sapos: " + df.format(temp) + " %\n");
        	
        	bw.flush();
        	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
