import java.io.*;
 
public class ex1019_TimeConversion
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int total = Integer.parseInt(br.readLine());

			int hours = total / 3600;
			int minutes = (total % 3600) / 60;
			int seconds = (total % 3600) % 60;

			bw.write(hours + ":" + minutes + ":" + seconds + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
