import java.util.Scanner;
public class Cube {
 public static void main(String [] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number to be cubed");
	 int num=scan.nextInt();
	 System.out.println(Cube.cubeNumber(num));
 }
 public static int cubeNumber(int num) {
	 return num*num*num;
 }
}
