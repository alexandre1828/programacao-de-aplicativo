import java.util.Scanner;
public class Main{

public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    int numero = 20;
    
    while(numero != 10){
        System.out.println("digite um numero");
         numero = teclado.nextInt();
        
        if (numero == 10) {
          System.out.println("voce acertou");  
        }
        
        else{
            System.out.println("voce errou");
        }
    }
		 
		 
		 
	}
}
