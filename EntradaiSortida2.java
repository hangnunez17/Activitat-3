import java.util.Scanner;

public class EntradaiSortida2{
  public static void main(String[] args) {

// definir las variables


    Scanner mycity= new Scanner(System.in);
    System.out.println("Entra la ciutat inicial");
    city1= mycity.nextLine();

    Scanner newcity= new Scanner(System.in);
    System.out.println("Entra la ciutat destí");
    city2= newcity.nextLine();

    Scanner kmdistance= new Scanner(System.in);
    System.out.println("Entra la distancia");
    distance= kmdistance.nextFloat();

    Scanner kmcost= new Scanner(System.in);
    System.out.println("Entra cost del quilometratge");
    cost= kmcost.nextFloat();

    costviatge= distance*cost;

  System.out.printf("El cost del viatge és de"+" "+"%.2f%n",costviatge);
  }
}
