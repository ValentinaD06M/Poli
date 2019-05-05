import java.io.*;
 
public class ex1004_SimpleProduct
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int PROD = A * B;

			bw.write("PROD = " + PROD + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
