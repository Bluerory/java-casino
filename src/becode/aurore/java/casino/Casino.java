package becode.aurore.java.casino;
import java.util.Scanner;

/**
 * Casino class containing the start menu waiting for user input to play the game.
 */
public class Casino {

	private static final String message = "Choose your option: \n"
			+ "[1] - Show money \n"
			+ "[2] - Add 1€ \n"
			+ "[3] - Add 5€ \n"
			+ "[4] - Exit";

	public static void main(String[] args) {

		Player player = new Player();
		player.showMoney();
		player.addMoney(10);
		player.showMoney();

		startMenu();
	}

	public static void showMenu(){
		System.out.println(message);
		System.out.println("show menu!");
	}

	public static void startMenu() {

		System.out.println("[step] Before scanner creation");

		Scanner input = new Scanner(System.in);

		System.out.println("[step] scanner created");

		System.out.println("[step] just before while loop");

		showMenu();
		while(input.hasNext()) {

			System.out.println("[step] In while loop\n");

			switch (input.nextLine()){
				case "1":
					sayHello();
					break;
				case "2":
					sayCoucou();
					break;
				case "3":
					exitMenu();
					break;
				default:
					System.out.println("Command unavailable");
					break;

			}
			showMenu();

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