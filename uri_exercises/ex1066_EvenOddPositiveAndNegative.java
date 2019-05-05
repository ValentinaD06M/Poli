import java.io.*;
 
public class ex1001_ExtremalyBasic
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n;
        		int even = 0, odd = 0, positive = 0, negative = 0; 
        	
		   	for(int i = 0; i < 5; i++)
		   	{
		   		n = Integer.parseInt(br.readLine());
		   		
		   		if(n % 2 == 0)
		   		{
		   			even++;
		   		}
		   		else
		   		{
		   			odd++;
		   		}
		   		
		   		if(n > 0)
		   		{
		   			positive++;
		   		}
		   		else
		   		{
		   			if(n < 0)
		   				negative++;
		   		}
		   	}
		   	
		   	
		   	bw.write(even + " valor(es) par(es)\n" + odd + " valor(es) impar(es)\n");
		   	bw.write(positive + " valor(es) positivo(s)\n" + negative + " valor(es) negativo(s)\n");
		   	bw.flush();
		    	br.close();
        	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
