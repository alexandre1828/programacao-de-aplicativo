import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	      Scanner teclado = new Scanner (System.in);
	      
	      double somanota1 = 0;
	      double media1 = 0;
	      double somanota2 = 0;
	      double media2 = 0;
	      
	  for(int i = 1; i<=5;i++) {
	      
	      System.out.println("digite a nota do primeiro aluno" + i);
	      double notaprimeiroaluno = teclado.nextDouble();
	      somanota1 += notaprimeiroaluno;
	  }
	  media1 = somanota1 / 5;
	  System.out.println("media:" + media1);
	   if (media1 >= 7){
		     System.out.println("aprovado");
		 }  
		  else if (media1 >= 4){
		     System.out.println("recuperacao");
		 } 
		 else{
		     System.out.println("reprovado");
		 }
		 
		  for(int i = 1; i<=5;i++) {
	      
	      System.out.println("digite a nota do segundo aluno" + i);
	      double notasegundoaluno = teclado.nextDouble();
	      
	      somanota2 += notasegundoaluno;
	  }
	  media2 = somanota2 / 5;
	  
	  System.out.println("media:" + media2);
	  
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
