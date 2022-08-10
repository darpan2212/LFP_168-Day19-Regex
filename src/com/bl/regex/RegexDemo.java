package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input:");
		String inputStr = sc.nextLine();

		Pattern finalPattern = Pattern.compile("^([0-9]*[a-zA-Z]{3,})[0-9A-Za-z]*$");

		if (finalPattern.matcher(inputStr).matches()) {
			System.out.println("Valid input");
		} else {
			System.out.println("Invalid input");
		}
	}

}