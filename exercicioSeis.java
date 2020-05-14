import java.util.Scanner;

public class exercicioSeis {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Digite o seu peso em quilos: ");
  int peso = entrada.nextInt();

  System.out.print("Digite a sua altura em centímetros: ");
  int altura = entrada.nextInt();

  entrada.close();
  double imc = peso / ((Math.pow(altura, 2) / 100));

  // Caso o professor confirme que na fórmula o correto é vezes 2 ao invés de elevado a 2.
  // double imc = peso / (altura * 2 / 100);

  System.out.println("Seu IMC é: " + imc);

 }
}