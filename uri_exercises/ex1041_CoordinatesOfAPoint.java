import java.io.*;
 
public class ex1041_CoordinatesOfAPoint
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] numbers = br.readLine().split( " " );
			double x = Double.parseDouble( numbers[0] );
			double y = Double.parseDouble( numbers[1] );

			if( x == 0.0 )
			{
				if( y == 0.0 )
				{ 
					bw.write( "Origem\n" ); 
				}
				else
				{ 
					bw.write( "Eixo Y\n" ); 
				}
			}
			else
			{
				if( y == 0.0 )
				{ 
					bw.write( "Eixo X\n" ); 
				}
				else
				{

					if( x > 0.0 )
					{
						if( y > 0.0 )
						{ 
							bw.write( "Q1\n" ); 
						}
						else
						{ 
							bw.write( "Q4\n" ); 
						}
					}
					else
					{
						if(y > 0.0)
						{ 
							bw.write( "Q2\n" ); 
						}
						else
						{ 
							bw.write( "Q3\n" ); 
						}
					}
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