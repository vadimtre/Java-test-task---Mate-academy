import java.util.Scanner;

public class Calc {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int first = enterNumber("first");
		int second = enterNumber("second");
		
		
		
	}
	
	static int enterNumber(String whatIsNumber) {
		System.out.printf("Enter the %s number: ", whatIsNumber);
		//System.out.printf("%s%snter number from 1 to 10 where you want to go .", player, beginSentence);
		do {
			int first = sc.nextInt();
		} while (true);
	}
	
	static int convertRomanNumeralsToArabic(String romanNumeral) {
		int ArabicNumerals[]= {0,1,2,3,4,5,6,7,8,9,10};
		String RomanNumerals[]= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		
		for (String string : RomanNumerals) {
			if (romanNumeral == string) {
				
			}
		}
		return 0;
	}
	
	void multiply() {
		
	}

}
