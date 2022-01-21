//By Hang Núñez

/*Escriu un programa que demani un caràcter i una cadena i trobi el nombre
d’aparicions del caràcter dins de la cadena i ens digui el nombre de majúscules
que hi ha dins la cadena.*/

import java.util.Scanner;

public class cadenes1{
  public static void main(String[] args) {

    Scanner keyboard =new Scanner(System.in);
//Declaració de variables:
    int upper_letter=0;
    int length;
    System.out.print("Entra un caràcter: ");
    char character=keyboard.next().charAt(0);//lletra que volem
    System.out.print("Entra una cadena: ");
    keyboard.nextLine();//aixó es perque no agafi només la primera paraula.
    String words=keyboard.nextLine();
    length=words.length();
    int count=0;//Per saber quantes vegades apareix el caràcter que volem.

//Calculem quantes vegades apareix el caracter seleccionat
    for(int x=0; x<length; x++){
      if(words.charAt(x)==(character)){
        count++;
      }
      if (Character.isUpperCase(words.charAt(x))){
        upper_letter++;
      }


    }
    System.out.println("El caràcter apareix "+count+" vegades");
    System.out.println("Apareixen lletre en majúscula "+upper_letter+" vegades");

  }
}
