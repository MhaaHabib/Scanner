import java.util.Scanner;
class MainScanner{



public static void main(String[] args) {

	System.out.println("Please type your name");
	Scanner scanner= new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println ("please type your age");
	int age = scanner.nextInt();
	System.out.println (age);
	int result = 67-age;
	System.out.println("you are " + result + " from retirement");


	
}
}