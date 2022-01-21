import java.util.Scanner;

public class EntradaiSortida4{
  public static void main(String[] args) {

// definir las variables

    Scanner mycity= new Scanner(System.in);
    System.out.println("Entra una ciutat");
    String city1= mycity.nextLine();

    Scanner newcity= new Scanner(System.in);
    System.out.println("Entra una ciutat");
    String city2= newcity.nextLine();

    Scanner lastcity= new Scanner(System.in);
    System.out.println("Entra una ciutat");
    String city3= lastcity.nextLine();

    System.out.println("+-------------------------------------------+");
    System.out.printf("| 1 |"+"%40s%n",city1+" |");
    System.out.printf("| 2 |"+"%40s%n",city2+" |");
    System.out.printf("| 3 |"+"%40s%n",city3+" |");
    System.out.println("+-------------------------------------------+");
  }
}
