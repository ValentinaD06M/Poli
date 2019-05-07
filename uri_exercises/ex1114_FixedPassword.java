import java.io.*;
 
public class ex1114_FixedPassword
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int number = 0;

			while( (number = Integer.parseInt( br.readLine() )) != 2002 )
			{
				bw.write("Senha Invalida\n");
				bw.flush();
			} 
			
			bw.write("Acesso Permitido\n");            
            bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}