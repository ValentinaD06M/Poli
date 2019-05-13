import java.io.*;
 
public class ex1007_Difference
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int A, B, C, D, E;

			A = Integer.parseInt( br.readLine() );
			B = Integer.parseInt( br.readLine() );
			C = Integer.parseInt( br.readLine() );
			D = Integer.parseInt( br.readLine() );
			E= (A * B) - (C * D);

			bw.write( "DIFERENCA = " + E + "\n" );
			bw.flush();
        }
		catch(Exception e) {}
	}
}
