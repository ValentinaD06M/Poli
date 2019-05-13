import java.io.*;
import java.text.DecimalFormat;
 
public class ex1040_Average3
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat( "#0.0" );
		
		try
		{
			String[] numbers = br.readLine().split( " " );
            
			double average = 0.0;
            
			average += Double.parseDouble( numbers[0] ) * 2;
			average += Double.parseDouble( numbers[1] ) * 3;
			average += Double.parseDouble( numbers[2] ) * 4;
			average += Double.parseDouble( numbers[3] ) * 1;
           
			average /= 10.0;
           
			bw.write( "Media: " + df.format( average ) + "\n" );
            
			if( average < 5.0 )
			{
				bw.write( "Aluno reprovado.\n" );
			}
			else
			{
				if( average >= 7.0 )
				{
					bw.write( "Aluno aprovado.\n" );
				}
				else
				{
					bw.write( "Aluno em exame.\n" );
					bw.flush();
                    
					String examen = br.readLine();
					bw.write( "Nota do exame: " + examen + "\n" );
                    
					average += Double.parseDouble( examen );
					average /= 2.0;
                    
					if( average < 5.0 )
					{
						bw.write( "Aluno reprovado.\n" );
					}
					else
					{
						bw.write( "Aluno aprovado.\n" );
					}
                    
					bw.write( "Media final: " + df.format( average ) + "\n" );
               	}
           	}
			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}