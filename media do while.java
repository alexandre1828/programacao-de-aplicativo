import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	    
	      double media = 0;
	      double media2 = 0;
	      double somanota = 0;
             double somanota2 = 0;
             int i = 1;
    
	    
	    while(i <= 5){
	        
	         
		    
		    System.out.println("digite nota do primeiro aluno:" );
		    double nota = teclado.nextDouble();
		    
		    
		    
		     somanota += nota;
		    media = somanota/5;
		    i++;
		    
		    
	        
	    }
	    System.out.println("media do primeiro aluno" + media );
	     if (media >= 7){
		     
		     System.out.println("aprovado");
		     
		 }  
		 
		 else if (media >= 4){
		     
		     System.out.println("recuperacao");
		 } 
		 
		 else{
		     System.out.println("reprovado");
		 }
	    
	    i = 1;
	    
	    
	     while(i <= 5){
	        
	         
		    
		     System.out.println("digite nota do segundo aluno:" );
		    double nota2 =teclado.nextDouble();
		    
		    
		    
		    somanota2 += nota2;
		    media2 = somanota2/5;
		    i++;
	        
	    }
	    System.out.println("media do segundo aluno" + media2 );
	     if (media2 >= 7){
		     
		     System.out.println("aprovado");
		     
		 }  
		 
		 else if (media2 >= 4){
		     
		     System.out.println("recuperacao");
		 } 
		 
		 else{
		     System.out.println("reprovado");
		 }
}
}
