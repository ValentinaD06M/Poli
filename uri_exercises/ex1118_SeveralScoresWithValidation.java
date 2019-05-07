import java.io.*;
import java.text.DecimalFormat;
 
public class ex1118_SeveralScoresWithValidation
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#.00");      
        
    	try
    	{
			double grades = 0.0;
			double temp;
			int step = 0;
			
			while(true)
			{
				temp = Double.parseDouble(br.readLine());
				grades = 0.0;

				while(temp < 0.0 || temp > 10.0)
				{
					bw.write("nota invalida\n");
					bw.flush();
					temp = Double.parseDouble(br.readLine());
				}
				
				grades += temp;
				
				temp = Double.parseDouble(br.readLine());
				while(temp < 0.0 || temp > 10.0)
				{
					bw.write("nota invalida\n");
					bw.flush();
					temp = Double.parseDouble(br.readLine());
				}

				grades += temp;
				grades /= 2.0;
				
				bw.write("media = " + df.format(grades) + "\n");
				bw.flush();
				
				bw.write("novo calculo (1-sim 2-nao)\n");
				bw.flush();
				
				step = Integer.parseInt(br.readLine());
				while(step > 2)
				{
					bw.write("novo calculo (1-sim 2-nao)\n");
					bw.flush();
					step = Integer.parseInt(br.readLine());
				}
				
				if(step == 2)
				{
					break;
				}
			}
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}