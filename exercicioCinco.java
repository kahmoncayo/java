import java.util.Scanner;

public class exercicioCinco {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Digite a quantidade de meses que deseja calcular em dias: ");
  int meses = entrada.nextInt();

  entrada.close();
  int dias = meses * 30;

//Conta meses com 31 dias. 
  int valorFinal = dias + (int)Math.floor(meses/2);

  System.out.println(meses + " meses possui aproximadamente " + valorFinal + " dias.");

 }
}