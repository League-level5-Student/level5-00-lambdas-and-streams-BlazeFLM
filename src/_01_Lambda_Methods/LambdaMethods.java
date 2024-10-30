package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustomMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}, "wtv");
		// 3. Call the printCustomMessage method using a lambda so that the String
		// prints with a mix between upper and lower case characters.
		printCustomMessage((s) -> {
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (i % 2 == 0) {
					str += Character.toLowerCase(ch);
				} else {
					str += Character.toUpperCase(ch);
				}
			}
			System.out.println(str);
		}, "supercalifragilisticexpialidocious");
		// 4. Call the printCustomMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				if (i == s.length() - 1) {
					str += s.charAt(i);
					break;
				}
				str += s.charAt(i) + ".";
			}
			System.out.println(str);
		}, "String");
		// 5. Call the printCustomMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage(s -> {
			String str = "";
			String vowels = "AEIOUaeiou";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (!vowels.contains(c + "")) {
					str += c;
				}
			}
			System.out.println(str);
		}, "sequoia");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
