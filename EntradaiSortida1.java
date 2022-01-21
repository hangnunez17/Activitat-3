import java.util.Scanner;

public class EntradaiSortida1{
  public static void main(String[] args) {

    Scanner Keyboard= new Scanner(System.in);

//El programador escull els numeros al atzar amb la formula .nextint()
    float num1;
    float num2;
    float num3;
    float suma;
    float result;
    System.out.println("Escriu tres numeros");
    num1= Keyboard.nextInt();
    num2= Keyboard.nextInt();
    num3= Keyboard.nextInt();

    suma= num1+num2+num3;
    result=suma/2;
  System.out.printf("el resultat es"+" "+"%.2f%n", result);
  }
}
