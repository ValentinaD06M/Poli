import java.io.*;
 
public class ex1050_DDD
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int option = Integer.parseInt(br.readLine());

			switch(option)
			{
				case 61:
				{
					bw.write("Brasilia\n");
				}
				break;

				case 71:
				{
					bw.write("Salvador\n");
				}
				break;

				case 11:
				{
					bw.write("Sao Paulo\n");
				}
				break;

				case 21:
				{
					bw.write("Rio de Janeiro\n");
				}
				break;

				case 32:
				{
					bw.write("Juiz de Fora\n");
				}
				break;

				case 19:
				{
					bw.write("Campinas\n");
				}
				break;

				case 27:
				{
					bw.write("Vitoria\n");
				}
				break;

				case 31:
				{
					bw.write("Belo Horizonte\n");
				}
				break;

				default:
				{
					bw.write("DDD nao cadastrado\n");
				}
				break;
			}
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}