import java.util.Scanner;
public class FinanceApp {
 public static void main(String [] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the Principal");
	 double principal=scan.nextDouble();
	 System.out.println("Enter the Rate");
	 double rate=scan.nextDouble();
	 System.out.println("Enter the Time");
	 double time=scan.nextDouble();
	 FinanceCalculator calculator=new FinanceCalculator();
	 System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));

 }
}
