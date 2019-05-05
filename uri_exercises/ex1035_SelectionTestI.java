import java.io.*;
 
public class ex1035_SelectionTestI
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
			int c = Integer.parseInt(numbers[2]);
			int d = Integer.parseInt(numbers[3]);
			  
			String response = b > c ? d > a ? (c + d) > (a + b) ? c > 0 && d > 0 ? (a % 2) == 0 ? "Valores aceitos" : "Valores nao aceitos" : "Valores nao aceitos" : "Valores nao aceitos" : "Valores nao aceitos" : "Valores nao aceitos";
			bw.write(response + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
