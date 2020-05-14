import java.util.Scanner;

public class exercicioSete {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Digite o valor da base do triângulo em milímetros: ");
  int base = entrada.nextInt();
    
  System.out.print("Digite o valor da altura do triângulo em milímetros: ");
  int altura = entrada.nextInt();

  entrada.close();
  int area = (base * altura) / 2;

  System.out.println("À área do seu triângulo é de " + area + "mm.");

 }
}