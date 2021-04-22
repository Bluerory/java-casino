package becode.aurore.java.casino;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Machine {
	private int[] numbers = new int[2];

	public int getBet(){
		Scanner betInput = new Scanner(System.in);
		System.out.println("insert money:");
		return betInput.nextInt();
	}

	private int getRandomInt() {
		Random rand = new Random();
		int maxValue = 10;
		return rand.nextInt(maxValue);
	}

	private int[] getGameNumbers() {
		for(int i = 0; i < this.numbers.length; i++) {
			int randomInt = this.getRandomInt();
			this.numbers[i] = randomInt;
		}

		System.out.println("Array outside loop: " + Arrays.toString(this.numbers));
		return this.numbers;
	}

	private int calcPrize(int bet, int multiplier){
		return bet * multiplier;
	}

	private int givePrize(int bet, int multiplier){
		return calcPrize(bet, multiplier);
	}

	public void launchGame(Player player, int bet) {
		int[] results = this.getGameNumbers();
		System.out.println("Inside launchgame: " + Arrays.toString(results));

		int payout = 0;

		for(int i = 0; i < results.length; i++) {
			for (int j = i + 1; j < results.length; j++) {

				if (results[i] != results[j]) {
					System.out.println("Oh no! You lost! :(\n");
					payout = givePrize(bet, 0);

				} else {

					switch (results[i]) {
						case 0:
							System.out.println("Double gain!!\n");
							payout = givePrize(bet, 2);
							break;
						case 7:
							System.out.println("10 times your gain!!\n");
							payout = givePrize(bet, 10);
							break;
						default:
							System.out.println("You didn't lose anything!\n");
							payout = givePrize(bet, 1);
							break;
					}
				}
			}
		}

		player.addMoney(payout);

	}

}
