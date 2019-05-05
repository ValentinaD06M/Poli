import java.io.*;
import java.text.DecimalFormat;
 
public class ex1012_Area
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		DecimalFormat df = new DecimalFormat("#0.000");
           
    	try
    	{
		   	String[] numbers = br.readLine().split(" ");
		   	double a = Double.parseDouble(numbers[0]);
		   	double b = Double.parseDouble(numbers[1]);
		   	double c = Double.parseDouble(numbers[2]);
		   	 
		   	//Triangulo
		   	double triangulo = (a * c) / 2.0;
		   	bw.write("TRIANGULO: " + df.format(triangulo) + "\n");
		   	 
		   	//Circulo
		   	double circulo = 3.14159 * c * c;
		   	bw.write("CIRCULO: " + df.format(circulo) + "\n");
		   	 
		   	//Trapezio
		   	double trapezio = ((a + b) * c) / 2.0;
		   	bw.write("TRAPEZIO: " + df.format(trapezio) + "\n");
		   	 
		   	//Quadrado
		   	double cuadrado = b * b;
		   	bw.write("QUADRADO: " + df.format(cuadrado) + "\n");
		   	 
		   	//Rectangulo
		   	double rectangulo = a * b;
		   	bw.write("RETANGULO: " + df.format(rectangulo) + "\n");
		   	
		   	bw.flush();
            br.close();
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
	}
}
