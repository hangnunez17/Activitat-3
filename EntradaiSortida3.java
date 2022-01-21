import java.util.Scanner;

public class EntradaiSortida3{
  public static void main(String[] args) {



    System.out.println("Escriu els numeros");

//El programador escull els numeros
    Scanner num1 = new Scanner(System.in);
    System.out.print("Entra un numero de 5 digits com a màxim ");
    long numero1= num1.nextLong();

    Scanner num2 = new Scanner(System.in);
    System.out.print("Entra un numero de 5 digits com a màxim ");
    long numero2= num2.nextLong();


    long result=numero1+numero2;

    System.out.printf("%4d%n", numero1);
    System.out.printf("+"+"%3d%n", numero2);
    System.out.println("-------");
    System.out.printf("%4d%n", result);
  }
}
