import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Length: ");
		float Length = scan.nextFloat();
		
		System.out.println("Input Width: ");
		float Width = scan.nextFloat();
		
		System.out.println("Input Height: ");
		float Height = scan.nextFloat();
		
		float Volume = (Length * Width * Height);
		System.out.println("The Volume of the cuboid is: " + Volume + " in.");
	}

}
