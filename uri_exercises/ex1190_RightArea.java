import java.io.*;
import java.text.DecimalFormat;
 
public class ex1190_RightArea
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "#.0" );
        
    	try
    	{
        	String op = br.readLine();
        	double result = 0.0;
         
        	for(int i = 0; i < 12; i++)
        	{
            	for(int j = 0; j < 12; j++)
            	{
                	if( i < j && i > ( 11 - j ))
               	 	{
                    		result += Double.parseDouble(br.readLine());
                	}
                	else
                	{
                    		br.readLine();
                	}
            	}
        	}
         
        	if(op.equals("M"))
        	{
            	result /= 66.0;
        	}
         
        	bw.write( df.format(result) + "\n" );
        	bw.flush();
         
        	br.close();
    	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}