import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
    Airplane plane1= new Airplane();
    Airplane plane2= new Airplane("AAA02", 15.8, 128, 30000);
   // TODO: Create a Scanner
    Scanner scan1=new Scanner(System.in);
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
    String plane3cs= scan1.nextLine();
    double plane3dist= scan1.nextDouble();
    int plane3dir= scan1.nextInt();
    int plane3alt= scan1.nextInt();

   // TODO: Create Airplane 3 from inputs
   
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:");
   
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is ");
   System.out.println("The distance between Airplane 1 and Airplane 3 is ");
   System.out.println("The distance between Airplane 2 and Airplane 3 is ");
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is ");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is ");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is ");
   
   // TODO: Airplane 1 changes
   
   // TODO: Airplane 2 changes
   
   // TODO: Airplane 3 changes
   
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: ");
   
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is ");
   System.out.println("The distance between Airplane 1 and Airplane 3 is ");
   System.out.println("The distance between Airplane 2 and Airplane 3 is ");
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is ");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is ");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is ");
  }
}
