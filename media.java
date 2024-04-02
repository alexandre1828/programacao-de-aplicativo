import java.util.Scanner;
public class Main{

public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    double somanota = 0;
    double media = 0;
		
	for (int i = 1;i<=4 ;i++ ) {
	 System.out.println("digite a %d °:" + i);
	  double nota = teclado.nextDouble();
		    
		    somanota += nota;
	}
		
	media = somanota / 4;
		 System.out.println("media:" + media);
		 
		 
		 if (media >= 7){
		     
		     System.out.println("aprovado");
		     
		 }  
		 
		 else if (media >= 4){
		     
		     System.out.println("recuperacao");
		 } 
		 
		 else{
		     System.out.println("reprovado");
		 }
	}
}
