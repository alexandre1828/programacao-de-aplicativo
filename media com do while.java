import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	   
	    double media = 0;
	      double somanota = 0;
	      int i = 1;
    
		do{
		    i++;
		    System.out.println("digite a  nota:" );
	        double nota = teclado.nextDouble();
		    
		    somanota += nota;
		    media = somanota/8;
		}
	while(i <= 8);
		
		    
		    
		
		System.out.println("media:" + media);
	}
}
