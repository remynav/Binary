import java.util.Scanner;

public class DeciToBinTester {
	public static void main(String[] args) {
		DecimalToBinary test= new DecimalToBinary();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Do you want to convert from binary to decimal or from decimal to binary?");
		String response = keyboard.nextLine();
		
		if (response.equalsIgnoreCase("binary to decimal")){
			System.out.println("Enter your binary: ");
			System.out.println(test.convertBToD(keyboard.nextLine()));
		}
		
		else if (response.equalsIgnoreCase("decimal to binary")){
			System.out.println("Enter your decimal: ");
			System.out.println(test.convertDToB(keyboard.nextLong()));
		}
		
		else{
			System.out.println("Please enter a valid option.");
		}
		
		//System.out.println(test.convertDToB(100000000001L)); //takes in a long
		
		//System.out.println(test.convertBToD("1011101001000011101101110100000000001")); //takes in a string
		
		
	}
}
