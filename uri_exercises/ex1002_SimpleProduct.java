import java.io.*;
 
public class ex1002_SimpleProduct
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int a, b, prod;
		
			a = Integer.parseInt( br.readLine() ); //Read first value from console
			b = Integer.parseInt( br.readLine() ); //Read second value from console
			
			//Make algebraic operation
			prod = a * b;
			
			//Add result to the buffer
			bw.write("PROD = " + prod + "\n");
			
			//Send buffer content to the console
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}