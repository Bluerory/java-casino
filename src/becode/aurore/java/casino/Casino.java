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
			+ "[4] - Play \n"
			+ "[5] - Exit";

	public static void main(String[] args) {
		startMenu();
	}

	public static void showMenu(){
		System.out.println(message);
	}

	public static void startMenu() {


		Scanner input = new Scanner(System.in);
		Player player = new Player();

		showMenu();
		while(input.hasNext()) {

			switch (input.nextLine()){
				case "1":
					player.showMoney();
					break;
				case "2":
					player.addMoney(1);
					player.showMoney();
					break;
				case "3":
					player.addMoney(5);
					player.showMoney();
					break;
//				case "4":
////				player.play();
				case "5":
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
