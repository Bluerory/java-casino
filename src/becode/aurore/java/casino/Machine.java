package becode.aurore.java.casino;
import java.util.Random;

public class Machine {
	private int[] numbers = new int[2];
	private int payout;

	public int getRandomInt(){
		Random rand = new Random(); //instance of random class
		int maxValue = 10;
		
		//return random values from 0-9

		return rand.nextInt(maxValue);
	}

/*	public void getGameNumbers(){
		for (int i=0; i < this.numbers.length; i++){

		}

	}*/
}
