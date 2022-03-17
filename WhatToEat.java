import java.util.Scanner;

public class WhatToEat {

//java Deliverable 1 passwords
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Num_lower_Letters = 1;
		final int Num_Upper_Letters = 1;
		final int Num_Digits = 1;
		final int Max_Character = 12;
		final int Min_Character = 7;
		final boolean userPassword = 7>=12;
		boolean hasCharacter;
		int exclamationpoint = '!';
	

		// characters to take in input
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		int maxCount = 12;
		int minCount = 7;
		

		int a = 7;
		int b = 12;
		int c = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("input a password via the console:");
		String input = in.nextLine();
		int inputLen = input.length();
		//Character:
		for(int i=0;i<inputLen;i++)
		{
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character .isLowerCase(ch))
				lowerCount++;
			else if (Character .isDigit(ch))
				digitCount++;
			if (i >= 7 && i <= 12);
			
		}
		if(upperCount >= Num_Upper_Letters && lowerCount >= Num_lower_Letters && digitCount >= Num_Digits)
			System.out.println("password valid and accepted");
		else {
			System.out.println("Error:");
			if(upperCount < Num_Upper_Letters)
				System.out.println("uppercase letters");
			if(lowerCount < Num_lower_Letters)
				System.out.println("lowercase letter");
			if(digitCount < Num_Digits)
				System.out.println("digits");}
			
	
		
		}
	}

	

