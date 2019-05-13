import java.io.*;
 
public class ex1020_AgeInDays
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int total = Integer.parseInt( br.readLine() );

			int ano = total / 365;
			int meses = ( total % 365 ) / 30;
			int dias = ( total % 365 ) % 30; 

			bw.write( ano + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}