import java.util.Scanner;
public class TemperatureApp {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature");
		double farenhiet=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.printf("%.2f",temperatureConverter.convertFarhenheitToCelsius(farenhiet));
	}

}
