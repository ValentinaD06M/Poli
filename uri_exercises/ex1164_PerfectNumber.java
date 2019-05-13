import java.io.*;
 
public class ex1164_PerfectNumber
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine() );
        	int a;
        	int acum;
         
        	for(int i = 0; i < n; i++)
        	{
            	acum = 0;
            	a = Integer.parseInt(br.readLine());
             
            	for(int j = 1; j <= (a / 2); j++)
            	{
                	if( a % j == 0 )
               	 	{
                    		acum += j;
                	}
            	}
             
            	if( acum == a )
            	{
                	bw.write(a + " eh perfeito\n");
            	}
            	else
            	{
                	bw.write(a + " nao eh perfeito\n");
            	}
             
            	bw.flush();
        	}
         
        	br.close();
    	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}