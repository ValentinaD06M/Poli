import java.io.*;
 
public class ex1070_SixOddNumbers
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt(br.readLine());
        		n += (n % 2) == 0 ? 1 : 0; 
        	
		   	for(int i = 0; i < 6; i++)
		   	{
		   		bw.write(n + "\n");
		   		n += 2;
		   	}
		   	
		   	bw.flush();
		    	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}