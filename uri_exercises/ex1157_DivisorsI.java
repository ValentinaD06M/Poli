import java.io.*;
 
public class ex1157_DivisorsI
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt(br.readLine());
        	
		   	for(int i = 1; i <= (n / 2); i++)
		   	{
		   		if(n % i == 0)
		   		{
		   			bw.write(i + "\n");
		   		}
		   	}
		   	
		   	bw.write(n + "\n");
		   	
		   	bw.flush();
	    	br.close();
    	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}