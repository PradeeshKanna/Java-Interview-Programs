package JavaProgramBasics;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int number =153;
		double result=0;
		int remainder =0;
		
		int temp= number; //Assigning 153 to Temp Variable

		while( temp !=0) {
			remainder = temp%10;
			result = result + Math.pow(remainder, 3);
			temp = temp/10;
		}
		
		if(result == number) {
			System.out.println(number+" is Armstrong");
		}else {
			System.out.println(number+" is not Armstrong");
		}
	}

}
