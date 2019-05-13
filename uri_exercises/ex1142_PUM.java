import java.io.*;
 
public class ex1142_PUM
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine() );
            int counter = 1;
            
			for(int i = 0; i < n; i++)
            {
		       	bw.write( counter + " " );
		       	counter++;

		       	bw.write( counter + " " );
		       	counter++;
		       	
		       	bw.write( counter + " " );
		       	counter++;
		       	
		       	bw.write( "PUM\n" );
		       	counter++;
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