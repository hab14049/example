import java.util.Scanner;


public class main2 {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name = user_input.next();
		System.out.println("Hello "+name+".");
	}

}