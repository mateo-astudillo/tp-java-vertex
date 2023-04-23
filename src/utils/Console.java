package utils;

import java.util.Scanner;

public class Console {
	private static Scanner scanner = new Scanner(System.in);

	public static void print(Object m) {
		System.out.print(m);
	}

	public static void println(Object m) {
		System.out.println(m);
	}

	public static String getString() {
		String word = scanner.nextLine();
		return word;
	}

	public static char getChar() {
    String temp = "";
    try {
      temp = scanner.nextLine();
      temp.charAt(0);
    } catch (Exception ex) {
      Console.println(ex);
    }
		return temp.charAt(0);
	}

	public static int getInt(int min, int max) {
		int number = min - 1;
		String temp;
		while (number < min || number > max) {
			try {
				temp = scanner.nextLine();
				number = Integer.parseInt(temp);
			} catch (Exception ex) {
        Console.println(" Error");
      }
		}
		return number;
	}
}
