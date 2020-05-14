import java.util.Scanner;

public class exercicioQuatro {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Quantos quilômetros você correu? ");
  double quilometros = entrada.nextDouble();

  entrada.close();
  double milhas = quilometros / 1.609;
  milhas = Math.floor(milhas*100) / 100;
  
  String formattedMiles = Double.toString(milhas).replace(".", ",");

  System.out.println("Você correu " + formattedMiles + " milhas.");

 }
}