import java.io.*;
 
public class ex1060_PositiveNumbers
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int counter = 0;

			for(int i = 0; i < 6; i++)
			{
				counter += Double.parseDouble(br.readLine()) > 0.0 ? 1 : 0;
			}

			bw.write(counter + " valores positivos\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
