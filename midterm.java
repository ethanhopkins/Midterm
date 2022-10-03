import java.util.Scanner;

public class midterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input x value: ");
		int x = scan.nextInt();
		double y = .5 * Math.pow(x, 3) - Math.pow(x, 2) + 1;
		System.out.println("The value of Y is: " + y);
	}

}
