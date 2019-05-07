import java.io.*;
 
public class ex1115_Quadrant
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] numbers = br.readLine().split(" ");
        	int a = Integer.parseInt(numbers[0]);
        	int b = Integer.parseInt(numbers[1]);
    	
        	while(a != 0 && b != 0)
        	{
		       	if(a > 0)
		       	{
		       		if(b > 0)
		           	{
		           		bw.write("primeiro\n");
		           	}
		           	else
		           	{
		           		bw.write("quarto\n");
		           	}
		       	}
		       	else
		       	{
		       		if(b > 0)
		           	{
		           		bw.write("segundo\n");
		           	}
		           	else
		           	{
		           		bw.write("terceiro\n");
		           	}
		       	}
		       	
		       	bw.flush();
		       	
		       	numbers = br.readLine().split(" ");
		        a = Integer.parseInt(numbers[0]);
		        b = Integer.parseInt(numbers[1]);
        	}
        
        	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
