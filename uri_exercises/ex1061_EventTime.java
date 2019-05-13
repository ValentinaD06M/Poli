import java.io.*;
 
public class ex1061_EventTime
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int days = 0, day1, day2, hours = 0, hour1, hour2, minutes = 0, minute1, minute2, seconds = 0, second1, second2;
        	
            
		   	String[] numbers = br.readLine().split( " " );
		   	day1 = Integer.parseInt( numbers[1] );
		   	
		   	numbers = br.readLine().split( " : " );
		   	hour1 = Integer.parseInt( numbers[0] );
		   	minute1 = Integer.parseInt( numbers[1] );
		   	second1 = Integer.parseInt( numbers[2] );
		   	
		   	numbers = br.readLine().split( " " );
		   	day2 = Integer.parseInt( numbers[1] );
		   	
		   	numbers = br.readLine().split( " : " );
		   	hour2 = Integer.parseInt( numbers[0] );
		   	minute2 = Integer.parseInt( numbers[1] );
		   	second2 = Integer.parseInt( numbers[2] );
		   	
		   	seconds = ( 60 + second2 - second1 ) % 60;
		   	
		   	if( second2 < second1 )
		   	{
		   		minutes = ( 60 + minute2 - minute1 - 1 ) % 60;
		   	}
		   	else
		   	{
		   		minutes = ( 60 + minute2 - minute1 ) % 60;
		   	}
		   	
		   	if( minute2 < minute1 )
		   	{
		   		hours = ( 24 + hour2 - hour1 - 1 ) % 24;
		   	}
		   	else
		   	{
		   		hours = ( 24 + hour2 - hour1 ) % 24;
		   	}
		   	
		   	if( hour2 < hour1 )
		   	{
		   		days = ( day2 - day1 - 1 );
		   	}
		   	else
		   	{
		   		days = ( day2 - day1 );
		   	}
		   	
		   	bw.write( days + " dia(s)\n" );
		   	bw.write( hours + " hora(s)\n" );
		   	bw.write( minutes + " minuto(s)\n" );
		   	bw.write( seconds + " segundo(s)\n" );
		   	
           	bw.flush();
           	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}