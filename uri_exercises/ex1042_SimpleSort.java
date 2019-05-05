import java.io.*;
 
public class ex1042_SimpleSort
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

			if(a > b)
			{
				if(b > c)
				{
					bw.write(c + "\n" + b + "\n" + a + "\n");
				}
				else
				{

					if(a > c)
					{
						bw.write(b + "\n" + c + "\n" + a + "\n");
					}
					else
					{
						bw.write(b + "\n" + a + "\n" + c + "\n");
					}
				}
			}
			else
			{
				if(a > c)
				{	
					bw.write(c + "\n" + a + "\n" + b + "\n");
				}
				else
				{

					if(b > c)
					{ 
						bw.write(a + "\n" + c + "\n" + b + "\n"); 
					}
					else
					{ 
						bw.write(a + "\n" + b + "\n" + c + "\n"); 
					}
				}
			}

			bw.write("\n" + numbers[0] + "\n" + numbers[1] + "\n" + numbers[2] + "\n");
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}