import java.io.*;
import java.text.DecimalFormat;
 
public class ex1048_SalaryIncrease
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat( "0.00" );
            
        try
        {
        	double salary = Double.parseDouble( br.readLine() );
        	double newSalary;
        	int percentual;
        	
        	if( salary > 2000 )
        	{
        		percentual = 4;
        		newSalary = salary * 1.04;
        	}
        	else
        	{
        		if( salary > 1200 )
            	{
            		percentual = 7;
            		newSalary = salary * 1.07;
            	}
            	else
            	{
            		if( salary > 800 )
                	{
                		percentual = 10;
                		newSalary = salary * 1.1;
                	}
                	else
                	{
                		if( salary > 400 )
                    	{
                    		percentual = 12;
                    		newSalary = salary * 1.12;
                    	}
                    	else
                    	{
                    		percentual = 15;
                    		newSalary = salary * 1.15;
                    	}
                	}
            	}
        	}
        	
        	bw.write( "Novo salario: " + df.format( newSalary ) + "\n" );
        	bw.write( "Reajuste ganho: " + df.format( newSalary - salary ) + "\n" );
        	bw.write( "Em percentual: " + percentual + " %\n" );
        	
        	bw.flush();
        	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}