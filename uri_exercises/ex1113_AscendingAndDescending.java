import java.io.*;
 
public class ex1113_AscendingAndDescending
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] num = br.readLine().split(" ");
        	int a = Integer.parseInt(num[0]);
        	int n = Integer.parseInt(num[1]);
        
        	while(a != n)
        	{
		       	if(a < n)
		       	{
		       		bw.write("Crescente\n");
		       	}
		       	else
		       	{
		       		bw.write("Decrescente\n");
		       	}
		           
		       	bw.flush();
		       	
		       	num = br.readLine().split(" ");
		       	a = Integer.parseInt(num[0]);
            	n = Integer.parseInt(num[1]);
        	}
             
            br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
