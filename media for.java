import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	   
	    double media = 0;
	      double somanota = 0;
    
		for (int i = 1;i<=8 ;i++ ) {
		    
		    System.out.println("digite nota:" + i);
		    double nota =teclado.nextDouble();
		    
		     somanota += nota;
		    media = somanota/8;
		    
		}
		System.out.println("media:" + media);
	}
}
