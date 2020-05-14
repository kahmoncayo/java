import java.util.Scanner;

public class exercicioDois {

    private static String mediaText = "Calcula a média de matemática";
    public static void main(String[] args) {  
        String nome = "";
        float nota1 = 0; 
        float nota2 = 0;
        float nota3 = 0;
        float nota4 = 0;
        double total = 0; 
        double media = 0;
        Scanner lerTeclado = new Scanner(System.in);
       
        System.out.println(mediaText);
        System.out.println(""); //Só para dar um espacinho nas linhas exibidas. 
        System.out.print("Qual é o seu nome? ");
        nome = lerTeclado.nextLine();
        
        System.out.print("Informe a 1º nota: ");
        nota1 = lerTeclado.nextFloat();
        
        System.out.print("Informe a 2º nota: ");
        nota2 = lerTeclado.nextFloat();
        
        System.out.print("Informe a 3º nota: ");
        nota3 = lerTeclado.nextFloat();
        
        System.out.print("Informe a 4º nota: ");
        nota4 = lerTeclado.nextFloat();
        
        lerTeclado.close();

        total = nota1+nota2+nota3+nota4;
        media = total/4;
        System.out.println(nome+", a sua media é "+media);
    }
}