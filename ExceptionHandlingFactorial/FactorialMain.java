import java.util.Scanner;

// program to find the factorial of agiven number
public class FactorialMain {
	public static void main(String[] args) {
		Factorial fact1 = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();

		try {
			int factorial = fact1.getfactorial(num);
			System.out.println(factorial);
		} catch (InvalidInputException iie) {
			iie.printStackTrace();
		} catch (FactorialException fe) {
			fe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
