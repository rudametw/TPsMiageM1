package fr.triskell.tpm1miage.tpmaven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Hello world!
 * 
 */
public class App {
	
	//variable mort, pas utilisé dans l'appli.
	private int dead_code = 0;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	// Copy pasted code to check out PMD CPD.
	public static void test1(String[] args) {
		System.out.println("Hello World!");
	}

	// Copy pasted code to check out PMD CPD.
	public static void test2(String[] args) throws java.io.IOException {
		String s1;
		String s2;
		int num = 0;

		// set up the buffered reader to read from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean cont = true;

		while (cont) {
			System.out.print("Enter an integer:");
			s1 = br.readLine();
			StringTokenizer st = new StringTokenizer(s1);
			s2 = "";

			while (cont && st.hasMoreTokens()) {
				try {
					s2 = st.nextToken();
					num = Integer.parseInt(s2);
					cont = false;
				} catch (NumberFormatException n) {
					System.out.println("The value in \"" + s2 + "\" is not an integer");
				}
			}
		}

		System.out.println("You entered the integer: " + num);
	}

	// Copy pasted code to check out PMD CPD.
	public void test3(String[] args) throws java.io.IOException {
		String s1;
		String s2;
		int num = 0;

		// set up the buffered reader to read from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean cont = true;

		while (cont) {
			System.out.print("Enter an integer:");
			s1 = br.readLine();
			StringTokenizer st = new StringTokenizer(s1);
			s2 = "";

			while (cont && st.hasMoreTokens()) {
				try {
					s2 = st.nextToken();
					num = Integer.parseInt(s2);
					cont = false;
				} catch (NumberFormatException n) {
					System.out.println("The value in \"" + s2 + "\" is not an integer");
				}
			}
		}

		System.out.println("You entered the integer: " + num);
	}

	//code mort, pas utilisé dans l'appli. 
	private void test4(String[] args) throws java.io.IOException {
		String s1;
		String s2;
		int num = 0;

		// set up the buffered reader to read from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean cont = true;

		while (cont) {
			System.out.print("Enter an integer:");
			s1 = br.readLine();
			StringTokenizer st = new StringTokenizer(s1);
			s2 = "";

			while (cont && st.hasMoreTokens()) {
				try {
					s2 = st.nextToken();
					num = Integer.parseInt(s2);
					cont = false;
				} catch (NumberFormatException n) {
					System.out.println("The value in \"" + s2 + "\" is not an integer");
				}
			}
		}

		System.out.println("You entered the integer: " + num);
	}

	
	
}
