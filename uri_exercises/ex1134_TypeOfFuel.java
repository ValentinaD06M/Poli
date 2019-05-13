import java.io.*;
 
public class ex1134_TypeOfFuel
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int alcool = 0, gasolina = 0, diesel = 0, n;
		   	n = Integer.parseInt( br.readLine() );
		   	
		   	while(n != 4)
		   	{
		   		switch(n)
		   		{
		   			case 1:		alcool++;	break;
		   			case 2:		gasolina++;	break;
		   			case 3:		diesel++;	break;
		   		}
		   		
		   		n = Integer.parseInt( br.readLine() );
		   	}
		   
		   	
		   	bw.write( "MUITO OBRIGADO\n" );
		   	bw.write( "Alcool: " + alcool + "\n" );
		   	bw.write( "Gasolina: " + gasolina + "\n" );
		   	bw.write( "Diesel: " + diesel + "\n" );
		   	
		   	
		   	bw.flush();
            br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}