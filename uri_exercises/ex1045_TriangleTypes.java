import java.io.*;
 
public class ex1045_TriangleTypes
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] numbers = br.readLine().split( " " );
			double a = Double.parseDouble( numbers[0] );
			double b = Double.parseDouble( numbers[1] );
			double c = Double.parseDouble( numbers[2] );
			double temp;
		         
		    if( c > b )
		    {
		    	temp = c;
		        c = b;
		        b = temp;
		    }
		         
		    if( b > a )
		    {
		        temp = b;
		        b = a;
		        a = temp;
		    }
		         
		    if( a >= (b + c))
		    {
		     	bw.write( "NAO FORMA TRIANGULO\n" );
		    }
		    else
		    {
		    	if((a * a) == (b * b) + (c * c))
		       	{
		           	bw.write( "TRIANGULO RETANGULO\n" );
		       	}
	  
		       	if( (a * a) > (b * b) + (c * c) )
		       	{
		           	bw.write( "TRIANGULO OBTUSANGULO\n" );
	 				if( a == b )
		       		{
		           		if( a == c )
		           		{
		               		bw.write( "TRIANGULO EQUILATERO\n" );
		           		}
		          	 	else
		           		{
		               		bw.write( "TRIANGULO ISOSCELES\n" );
		           		}
		       		}
		       		else
		       		{
				      	if( a == c || b == c )
				      	{
				          	bw.write( "TRIANGULO ISOSCELES\n" );
				      	}
		       		}
		       	}
		         
		       	if( (a * a) < (b * b) + (c * c) )
		       	{
		           	bw.write( "TRIANGULO ACUTANGULO\n" );
	 				
					if( a == b )
		       		{
		           		if( a == c )
		           		{
		               		bw.write( "TRIANGULO EQUILATERO\n" );
		           		}
					 	else
					 	{
					     	bw.write( "TRIANGULO ISOSCELES\n" );
					 	}
		       		}
		       		else
		       		{
				      	if( a == c || b == c )
				      	{
				          	bw.write( "TRIANGULO ISOSCELES\n" );
				      	}
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