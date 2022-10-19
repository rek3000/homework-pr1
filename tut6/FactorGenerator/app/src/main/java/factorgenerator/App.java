package factorgenerator;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(number);
		sc.close();

		FactorGenerator factor = new FactorGenerator(number);

		while (factor.hasMoreFactors(factor.number)) {
			factor.nextFactor(factor.number);	
		}
	}
}
