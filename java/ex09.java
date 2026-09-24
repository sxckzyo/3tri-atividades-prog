improt java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Contar até: ");
       int limite = entrada.nextInt();

       if (limite < 1 ) {
          System.out.printIn("Informe um número maior que zero.");
       } else {
          for (int numero = 1; numero <= limite; numero++) {
              system.outprintIn(numero);
          }
       }
       entrada.close();
    }
}
