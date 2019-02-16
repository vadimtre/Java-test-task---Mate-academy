import java.io.IOException;
import java.util.Scanner;

public class Calc {
	static Scanner sc=new Scanner(System.in);
	static int first, second;
	static String operation;
	static boolean isEnteredRoman;
	
	public static void main(String[] args) {		
		first = enterNumber("first");
		second = enterNumber("second");
		operation = enterOperation();
		System.out.println(first);
		System.out.println(second);
		System.out.println(operation);
		
		makeOperation();
	}
	
	static int enterNumber(String whatNumber) {
		do {System.out.printf("Enter a %s number: ", whatNumber);
			 if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
				 int enteredNumber =  sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
				 if (whatNumber.equals("second") && isEnteredRoman) {
	        		System.out.println("Увага! Неможливо проводити математичні операції з арабським числом та римським одночасно . Введіть римське число !!!");
				 } else {
					return enteredNumber;
				 }
		     }else {
	        	String enteredString =  sc.next();
	        	if (isRomanNumeral(enteredString)) {
	        		if (whatNumber.equals("second") && !isEnteredRoman) {
	        			System.out.println("Увага! Неможливо проводити математичні операції з арабським числом та римським одночасно . Введіть арабське число !!!");
					} else {
	        		isEnteredRoman= true;
					return convertRomanNumeralsToArabic(enteredString);
					}
				}else{
					System.out.println("Вы ввели не римське число");
				};
		     }	
		} while (true);
	}
	
	static String enterOperation() {
		System.out.print("Enter a operation(+,-,/,*): ");
		
		do {
			String enteredOperation = sc.next();
			return enteredOperation;
		} while (true);
	}
	
	static boolean isRomanNumeral(String mayBeRomanNumeral) {
		String RomanNumerals[]= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		boolean isRoman = false;
		
		for (String string : RomanNumerals) {
			if (mayBeRomanNumeral.equals(string) ) {
				isRoman= true;
				break;
			}
		}
		return isRoman;
	}
	
	static int convertRomanNumeralsToArabic(String romanNumeral) {
		int ArabicNumerals[]= {0,1,2,3,4,5,6,7,8,9,10};
		String RomanNumerals[]= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		int convertToArabic =0;
		
		for (int i = 0; i < RomanNumerals.length; i++) {
			if (romanNumeral.equals(RomanNumerals[i])) {
				convertToArabic = ArabicNumerals[++i];
				break;
			}
		}
		
		return convertToArabic;	
	}
	
	static void makeOperation() {
		int result=0 ;
		
		switch (operation) {
		case "+":
			result= first + second;
			break;
		case "-":
			result= first - second;
			break;
		case "*":
			result= first * second;
			break;
		case "/":
			result= first / second;
			break;
		}
		System.out.println("Result "+first + operation+ second+ " is " + result);
	}

}
