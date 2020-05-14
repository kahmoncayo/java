import java.util.Scanner;

public class exercicioOito {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Digite o valor da base do quadrado em milímetros: ");
  int base = entrada.nextInt();
    
  System.out.print("Digite o valor da altura do quadrado em milímetros: ");
  int altura = entrada.nextInt();

  entrada.close();
  int area = base * altura;

  System.out.println("À área do seu quadrado é de " + area + "mm.");

 }
}