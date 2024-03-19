import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner (System.in);
		
		
	    System.out.printf("Qual a venda do produto 1 no primeiro mes?");
	    float mes1pro1 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 2 no primeiro mes?");
	    float mes1pro2 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 3 no primeiro mes?");
	    float mes1pro3 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 1 no segundo mes?");
	    float mes2pro1 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 2 no segundo mes?");
	    float mes2pro2 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 3 no segundo mes?");
	    float mes2pro3 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 1 no terceiro mes?");
	    float mes3pro1 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 2 no terceiro mes?");
	    float mes3pro2 = teclado.nextFloat();
	   
	    System.out.printf("Qual a venda do produto 3 no terceiro mes?");
	    float mes3pro3 = teclado.nextFloat();
	   
	   float vendaMDp1 = ((mes1pro1 + mes1pro2 + mes1pro3) / 3) / 25;
	   float vendaMDp2 = ((mes2pro1 + mes2pro2 + mes2pro3) / 3) / 25;
	   float vendaMDp3 = ((mes3pro1 + mes3pro2 + mes3pro3) / 3) / 25;
	   
	  
   System.out.printf("Qual o tempo de reposição do produto 1?");	    
	    float temprep1 = teclado.nextFloat();
   System.out.printf("Qual o tempo de reposição do produto 2?");	    
	    float temprep2 = teclado.nextFloat();
   System.out.printf("Qual o tempo de reposição do produto 3?");	    
	    float temprep3 = teclado.nextFloat();
   
   System.out.printf("Qual o tempo lote de reposição do produto 1?");	    
	    float lotrep1 = teclado.nextFloat();
   System.out.printf("Qual o lote de reposição do produto 2?");	    
	    float lotrep2 = teclado.nextFloat();
   System.out.printf("Qual o lote de reposição do produto 3?");	    
	    float lotrep3 = teclado.nextFloat();
	    
	   float emin1 = temprep1 * vendaMDp1;
	   float emin2 = temprep2 * vendaMDp2;
	   float emin3 = temprep3 * vendaMDp3;
	   
	   float emax1 = lotprep1 + emin1;
	   float emax2 = lotprep2 + emin2;
	   float emax3 = lotrep3 + emin3;
	   
	   System.out.println("venda media do produto a " + vendaMDp1);
	    System.out.println("venda media do produto b " + vendaMDp2);
	     System.out.println("venda media do produto a " + vendaMDp3);
	     
	   System.out.println("estoque minimo do produto a " + emin1);
	    System.out.println("estoque minimo do produto b " + emin2);
	     System.out.println("estoque minimo do produto a " + emin3);
	   
	   System.out.println("estoque maximo do produto a " + emax1);
	    System.out.println("estoque maximo do produto b " + emax2);
	     System.out.println("estoque maximo do produto a " + emax3);
	     
	     System.out.printf("Digite o estoque atual do produto 1");
	    float ea1 = teclado.nextFloat();
	     System.out.printf("Digite o estoque atual do produto 2");
	    float ea2 = teclado.nextFloat();
	     System.out.printf("Digite o estoque atual do produto 3");
	    float ea3 = teclado.nextFloat();
	    
	    if(ea1 < emin1) {
	        System.out.println("comprar");
	    }
	    
	    else{
	        System.out.println("nao comprar");
	    }
	    
	    
	      if(ea2 < emin2) {
	        System.out.println("comprar");
	    }
	    
	    else{
	        System.out.println("nao comprar");
	    }
	    
	      if(ea3 < emin3) {
	        System.out.println("comprar");
	    }
	    
	    else{
	        System.out.println("nao comprar");
	    }
	    
	    
	    
	    
	     
	     
	     
	    teclado.close();
	    
	    
	}
}
