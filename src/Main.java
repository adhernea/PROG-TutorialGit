import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un numerito: ");
    int askedNumber = scanner.nextInt();

    System.out.println("¡¡Hola Mundo!! Tu número es: " + askedNumber);
    
    scanner.close();
  }
}
