//By Hang Núñez

/*Escriu un programa que demani a l’usuari una
lletra i indiqui si és una consonant o una vocal.*/

import java.util.Scanner;

public class cadenes7{
  public static void main(String[] args) {

    Scanner keyboard =new Scanner(System.in);

    System.out.print("Entra una lletra: ");
    String letter=keyboard.nextLine();//lletra que volem

//Volem saber si es una vocal o una consonant
    for(int x=0; x<letter.length(); x++){
      if((letter.charAt(x)=='a')||(letter.charAt(x)=='e')||
      (letter.charAt(x)=='i')||(letter.charAt(x)=='o')||(letter.charAt(x)=='u')
      ||(letter.charAt(x)=='A')||(letter.charAt(x)=='E')||
      (letter.charAt(x)=='I')||(letter.charAt(x)=='O')||(letter.charAt(x)=='U')){

            System.out.println("la lletra "+letter+" és una vocal.");
      }
      else if ((letter.charAt(x)!='a')||(letter.charAt(x)!='e')||
      (letter.charAt(x)!='i')||(letter.charAt(x)!='o')||(letter.charAt(x)!='u')
      ||(letter.charAt(x)!='A')||(letter.charAt(x)!='E')||
      (letter.charAt(x)!='I')||(letter.charAt(x)!='O')||(letter.charAt(x)!='U')){
          System.out.println("la lletra "+letter+" és una consonant");
      }
    }
/*El programa només té en compte les lletres, no els símbols ni els números*/
  }
}
