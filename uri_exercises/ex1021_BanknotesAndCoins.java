import java.io.*;
 
public class ex1021_BanknotesAndCoins
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			double total = Double.parseDouble(br.readLine());
			double temp = total;
			 
			int n100 = (int)(temp / 100);
			temp %= 100;
			
			int n50 = (int)(temp / 50);
			temp %= 50;
			
			int n20 = (int)(temp / 20);
			temp %= 20;
			
			int n10 = (int)(temp / 10);
			temp %= 10;
			
			int n5 = (int)(temp / 5);
			temp %= 5;
			
			int n2 = (int)(temp / 2);
			temp %= 2;
			
			int n1 = (int)(temp / 1);
			temp %= 1;
			
			int n05 = (int)(temp / 0.5);
			temp %= 0.5;
			
			int n025 = (int)(temp / 0.25);
			temp %= 0.25;
			
			int n010 = (int)(temp / 0.1);
			temp %= 0.1;
			
			int n005 = (int)(temp / 0.05);
			temp %= 0.05;
			
			int n001 = (int)(temp / 0.01);


			bw.write("NOTAS:\n" + n100 + " nota(s) de R$ 100.00\n" + n50 + " nota(s) de R$ 50.00\n" + n20 + " nota(s) de R$ 20.00\n" + n10 + " nota(s) de R$ 10.00\n" + n5 + " nota(s) de R$ 5.00\n" + n2 + " nota(s) de R$ 2.00\n");
			bw.write("MOEDAS:\n" + n1 + " moeda(s) de R$ 1.00\n" + n05 + " moeda(s) de R$ 0.50\n" + n025 + " moeda(s) de R$ 0.25\n" + n010 + " moeda(s) de R$ 0.10\n" + n005 + " moeda(s) de R$ 0.05\n" + n001 + " moeda(s) de R$ 0.01\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}