import java.io.*;
 
public class ex1018_Banknotes
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int total = Integer.parseInt( br.readLine() );
			int temp = total;

			int n100 = temp / 100;
			temp %= 100;
			
			int n50 = temp / 50;
			temp %= 50;
			
			int n20 = temp / 20;
			temp %= 20;
			
			int n10 = temp / 10;
			temp %= 10;
			
			int n5 = temp / 5;
			temp %= 5;
			
			int n2 = temp / 2;
			temp %= 2;
			
			int n1 = temp;

			bw.write( total + "\n" + n100 + " nota(s) de R$ 100,00\n" + n50 + " nota(s) de R$ 50,00\n" + n20 + " nota(s) de R$ 20,00\n" + n10 + " nota(s) de R$ 10,00\n" + n5 + " nota(s) de R$ 5,00\n" + n2 + " nota(s) de R$ 2,00\n" + n1 + " nota(s) de R$ 1,00\n" );
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
