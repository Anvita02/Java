import java.util.Scanner;
public class PlanetApp {
 public static void main(String [] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the radius of circle");
	 double radius=scan.nextDouble();
	 PlanetExplorer explorer=new PlanetExplorer();
	 System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
 }
}
