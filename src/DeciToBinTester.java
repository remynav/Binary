
public class DeciToBinTester {
	public static void main(String[] args) {
		DecimalToBinary test= new DecimalToBinary();
		System.out.println(test.convertDToB(100000000001L)); //takes in a long
		
		System.out.println(test.convertBToD("1011101001000011101101110100000000001")); //takes in a string
		
	}
}
