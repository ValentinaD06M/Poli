import java.io.*;
 
public class ex1013_TheGreatest
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

			int mayor1 = (a + b + Math.abs(a - b)) / 2;
			int mayor2 = (b + c + Math.abs(b - c)) / 2;

			bw.write((mayor1 > mayor2 ? mayor1 : mayor2) + " eh o maior\n");
			bw.flush();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
