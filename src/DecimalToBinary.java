
public class DecimalToBinary {
	
	public DecimalToBinary() {
		
		
	}
	
	public String convertDToB(long decimal) {
		StringBuilder finalBinary= new StringBuilder();
		long remainder= decimal%2;
		finalBinary.append(remainder);
		
		long quotient= decimal/2;
		remainder= quotient%2;
		finalBinary.append(remainder);
		quotient=quotient/2;
		
		while(quotient != 0) {
			finalBinary.append(quotient%2);
			quotient=quotient/2;
		}
		
		finalBinary.reverse();
		return finalBinary.toString();
		
	}
	
	public String convertBToD(String binary) {
		StringBuilder firstBinary= new StringBuilder(binary);
		firstBinary.reverse();
		String finalBinary= firstBinary.toString();
		long total=0;
		
		for(int i=0; i< firstBinary.length(); i++) {
			total = total + (finalBinary.charAt(i)-'0') * ((long)Math.pow(2, i));
		}
		
		//long decimal=Integer.parseInt(binary,2);  
		
		return String.valueOf(total); 
	}
}
