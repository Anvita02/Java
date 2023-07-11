import java.util.Scanner;
public class HeightApp {
 public static void main(String [] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the Inches");
	 double inches=scan.nextDouble();
	 HeightConverter converter=new HeightConverter();
	 System.out.printf("%.2f",converter.convertInchesToFeet(inches));
 }
}
