import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
  System.out.println("digite o primeiro numero");
  double primeiro = teclado.nextDouble();
  
  System.out.println("digite o segundo  numero");
  double segundo = teclado.nextDouble();
  
  System.out.println("soma do  numero :"+ (primeiro + segundo));
  System.out.println("subtracao do  numero :"+ (primeiro - segundo));
  System.out.println("multiplicacao do  numero :"+ (primeiro * segundo));
  System.out.println("divisao do  numero :"+ (primeiro / segundo));
  
  
}

}
