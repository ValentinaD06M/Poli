import java.io.*;
 
public class ex1046_GameTime
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] time = br.readLine().split(" ");
			int start = Integer.parseInt(time[0]);
			int end = Integer.parseInt(time[1]);
			int hours = (start < end ? end : end + 24) - start;

			bw.write("O JOGO DUROU " + hours + " HORA(S)\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
