import java.io.*;
 
public class ex1133_RestOfADivision
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n1 = Integer.parseInt( br.readLine() );
        	int n2 = Integer.parseInt( br.readLine() );
         
         
        	int temp;
         
        	if( n1 < n2 )
        	{
            	for(int i = n1 + 1; i < n2; i++)
            	{
                	temp = i % 5;
                	if( temp == 2 || temp == 3 )
                	{
                    	bw.write( i + "\n" );
                	}
            	}
        	}
        	else
        	{
            	for(int i = n2 + 1; i < n1; i++)
            	{
                	temp = i % 5;
                	if( temp == 2 || temp == 3 )
                	{
                    	bw.write( i + "\n" );
                	}
            	}
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