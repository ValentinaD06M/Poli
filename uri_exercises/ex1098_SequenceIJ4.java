import java.io.*;
import java.text.DecimalFormat;
 
public class ex1098_SequenceIJ4
{
	public static void main(String args[])
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "0.0" );
		
		try
		{
			double value;
        	
		   	for(int i = 0; i <= 10; i++)
		   	{
		   		for(int j = 1; j < 4; j++)
		       	{
		       		value = i / 5.0;
		   			
		   			if( value % 1 == 0.0 )
		   			{
		       			bw.write( "I=" + (int)value + " J=" + (int)( j + value ) + "\n" );
		   			}
		       		else
		       		{
		       			bw.write( "I=" + df.format( value ) + " J=" + df.format( j + value ) + "\n" );
		       		}
		       	}
		   	}
		   	
		   	bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}