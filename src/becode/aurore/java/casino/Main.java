package becode.aurore.java.casino;
import java.util.Scanner;

/**
 * Main class containing the start menu waiting for user input to play the game.
 */
public class Main {

	public static void main(String[] args) {
		startMenu();
	}

	public static void startMenu() {

		System.out.println("[step] Before scanner creation");

		Scanner input = new Scanner(System.in);

		System.out.println("[step] scanner created");

		String message = "Choose your option: \n"
				+ "[1] - Hello \n"
				+ "[2] - Coucou \n"
				+ "[3] - Exit";

		System.out.println("[step] just before while loop");

		while(true) {

			System.out.println("[step] In while loop, before option message log\n");
			System.out.println(message);

			switch (input.nextLine()){
				case "1":
					sayHello();
					continue;
				case "2":
					sayCoucou();
					continue;

				case "3":
					exitMenu();
					break;
			}

		}
	}

	public static void sayHello() {
		System.out.println("Hello, user!");
	}

	public static void sayCoucou() {
		System.out.println("Coucou, user!");
	}

	public static void exitMenu() {
		System.out.println("Goodbye!");
		System.exit(0);
	}
}
