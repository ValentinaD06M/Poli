import java.io.*;
 
public class ex1160_PopulationIncrease
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine() );
			int counter = 0;
			String[] numbers;
			
			int A = 0;
			int B = 0;
			double dA = 0.0;
			double dB = 0.0;
			
			for(int i = 0; i < n; i++)
			{
				numbers = br.readLine().split(" ");
				
				A = Integer.parseInt( numbers[0] );
				B = Integer.parseInt( numbers[1] );
				dA = Double.parseDouble( numbers[2] ) / 100.0;
				dB = Double.parseDouble( numbers[3] ) / 100.0;
				
				counter = 0;
				
				while(A <= B)
				{
					counter += 1;
					A *= ( 1 + dA );
					B *= ( 1 + dB );
					
					if(counter > 100)
						break;
				}
				
				if( counter > 100 )
				{
					bw.write( "Mais de 1 seculo.\n" );
				}
				else
				{
					bw.write( counter + " anos.\n" );
				}

				bw.flush();
			}	
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}