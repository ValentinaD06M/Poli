import java.io.*;
 
public class ex1003_SimpleSum
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int SOMA = A + B;
			
			bw.write("SOMA = " + SOMA + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
