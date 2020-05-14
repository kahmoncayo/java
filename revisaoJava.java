import java.util.Scanner;

public class revisaoJava {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Informe seu nome.");
    String userName = myObj.nextLine(); 
    showMessage(userName);
    myObj.close();
  }

  public static void showMessage(final String username) {
    System.out.println("Olá, " + username + ". Seja bem vindo (a).");
  }
  
}