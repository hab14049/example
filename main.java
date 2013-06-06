
public class main6 {

	public static void main(String[] args) {
		String firstname="";
		String lastname="";
		
		String[] name =askname.askname(firstname, lastname);
		System.out.println("Hello "+name[0]+" "+name[1]+".");
		

public class main {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String firstname;
		System.out.println("Enter your firstname");
		firstname = user_input.next();
		
		String lastname;
		System.out.println("Enter your lastname");
		lastname = user_input.next();
		
		System.out.println("Hello "+firstname+" "+lastname+".");

	}

}

