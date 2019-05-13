import java.io.*;
 
public class ex1153_SimpleFactorial
{
	public static int factorial(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n - 1);
		}
	}

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt(br.readLine());
            	bw.write(factorial(n) + "\n");
            	bw.flush();
        }
        catch(Exception e) 
		{
			e.printStackTrace();
		}
   	}   
}