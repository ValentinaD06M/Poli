import java.io.*;
 
public class ex1131_Grenais
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] numbers;
		   	int inter = 0, gremio = 0, empates = 0;
		   	int matches = 0;
		   	
		   	do
		   	{
		   		numbers = br.readLine().split(" ");
		   		bw.write("Novo grenal (1-sim 2-nao)\n");
		   		bw.flush();
		   		matches++;
		   		
		   		if(Integer.parseInt(numbers[0]) < Integer.parseInt(numbers[1]))
		   		{
		   			gremio++;
		   		}
		   		else
		   		{
		   			if(Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1]))
		       		{
		   				inter++;
		       		}
		       		else
		       		{
		       			empates++;
		       		}
		   		}
		   	}
		   	while(br.readLine().equals("1"));
        	
		   	bw.write(matches + " grenais\n");
		   	bw.write("Inter:" + inter + "\n");
		   	bw.write("Gremio:" + gremio + "\n");
		   	bw.write("Empates:" + empates + "\n");
		   	
		   	if(inter > gremio)
		   	{
		   		bw.write("Inter venceu mais\n");
		   	}
		   	else
		   	{
		   		if(inter < gremio)
		       	{
		   			bw.write("Gremio venceu mais\n");
		       	}
		       	else
		       	{
		       		bw.write("Nao houve vencedor\n");
		       	}
		   	}
		   	
		   	bw.flush();
            	br.close();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}