import java.io.*;
import java.text.DecimalFormat;
 
public class ex1116_DividingXByY
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "0.0" );
          
    	try
    	{
        	int n = Integer.parseInt( br.readLine() );
        	String[] numbers;
        	int a, b;
        	double result;
        
        	for(int i = 0; i < n; i++)
        	{
		       	numbers = br.readLine().split( " " );
		       	a = Integer.parseInt( numbers[0] );
		       	b = Integer.parseInt( numbers[1] );
		       	
		       	if( b == 0 )
		       	{
		       		bw.write( "divisao impossivel\n" );
		       	}
		       	else
		       	{
		       		result = (double)a / (double)b;
		       		bw.write( df.format( result ) + "\n" );
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