import java.util.Scanner;
public class Main{

public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    double somames1 = 0;
    double vmd1 = 0;
    double emin1 = 0;
    double emax1 = 0;
    double somames2 = 0;
    double vmd2 = 0;
    double emin2 = 0;
    double emax2 = 0;
    double somames3 = 0;
    double vmd3 = 0;
    double emin3 = 0;
    double emax3 = 0;
		
	for (int i = 1;i<=4 ;i++ ) {
	 System.out.println("digite o mes:" + i);
	  double mes1 = teclado.nextDouble();
		    
		    somames1 += mes1;
	}
		
	vmd1 = (somames1 / 5) / 25;
		 System.out.println("venda media diaria:" + vmd1);
		 
		 
		System.out.println("digite o tempo de reposiçao do produto:"); 
		double tr1 = teclado.nextDouble();
		
		
		emin1 = tr1 * vmd1;
		 System.out.println("estoque minimo:" + emin1);
		 
		 
		System.out.println("digite o lote de reposiçao do produto:"); 
		 double lr1 = teclado.nextDouble();
		 
		 
		 emax1 = emin1 + lr1;
		 
		  System.out.println("estoque maximo:" + emax1);
		  
		  
		  System.out.println("digite o ea do produto:"); 
		 double ea1 = teclado.nextDouble();
		 
		  if (ea1 < emin1)
    {
        System.out.println("comprar" );
    }

    else
    {
        System.out.println("nao comprar" );
    }
    
    for (int i = 1;i<=4 ;i++ ) {
	 System.out.println("digite o mes:" + i);
	  double mes2 = teclado.nextDouble();
		    
		    somames2 += mes2;
	}
		
	vmd2 = (somames2 / 5) / 25;
		 System.out.println("venda media diaria:" + vmd2);
		 
		 
		System.out.println("digite o tempo de reposiçao do produto:"); 
		double tr2 = teclado.nextDouble();
		
		
		emin2 = tr2 * vmd2;
		 System.out.println("estoque minimo:" + emin2);
		 
		 
		System.out.println("digite o lote de reposiçao do produto:"); 
		 double lr2 = teclado.nextDouble();
		 
		 
		 emax2 = emin2 + lr2;
		 
		  System.out.println("estoque maximo:" + emax2);
		  
		  
		  System.out.println("digite o ea do produto:"); 
		 double ea2 = teclado.nextDouble();
		 
		  if (ea2 < emin2)
    {
        System.out.println("comprar" );
    }

    else
    {
        System.out.println("nao comprar" );
    }
    
    for (int i = 1;i<=4 ;i++ ) {
	 System.out.println("digite o mes:" + i);
	  double mes3 = teclado.nextDouble();
		    
		    somames3 += mes3;
	}
		
	vmd3 = (somames3 / 5) / 25;
		 System.out.println("venda media diaria:" + vmd3);
		 
		 
		System.out.println("digite o tempo de reposiçao do produto:"); 
		double tr3 = teclado.nextDouble();
		
		
		emin3 = tr3 * vmd3;
		 System.out.println("estoque minimo:" + emin3);
		 
		 
		System.out.println("digite o lote de reposiçao do produto:"); 
		 double lr3 = teclado.nextDouble();
		 
		 
		 emax3 = emin3 + lr3;
		 
		  System.out.println("estoque maximo:" + emax3);
		  
		  
		  System.out.println("digite o ea do produto:"); 
		 double ea3 = teclado.nextDouble();
		 
		  if (ea3 < emin3)
    {
        System.out.println("comprar" );
    }

    else
    {
        System.out.println("nao comprar" );
    }
		  
		 
		 
		 
	}
}
