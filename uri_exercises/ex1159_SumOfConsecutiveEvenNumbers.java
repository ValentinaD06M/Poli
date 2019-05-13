import java.io.*;
 
public class ex1159_SumOfConsecutiveEvenNumbers
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			long n = Long.parseLong( br.readLine() );
            long result;
             
            while( n != 0 )
           	{
               	result = 0;
                 
               	n += n % 2 == 0 ? 0 : 1;
                 
               	for(int i = 0; i < 5; i++)
               	{
                	result += n;
                	n += 2;
               	}
             
	           bw.write(result + "\n");
	           bw.flush();
	            
	           n = Integer.parseInt(br.readLine());
        	}
         
        	br.close();
       	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}