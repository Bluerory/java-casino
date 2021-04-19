package becode.aurore.java.casino;
import java.util.Random;

public class Machine {
	private int[] numbers = new int[2];
	private int payout;

	public int getRandomNumber(){
		Random rand = new Random(); //instance of random class
		int maxValue = 10;
		//generate random values from 0-9
		int randomInt = rand.nextInt(maxValue);
		return randomInt;
	}

/*	public void getGameNumbers(){
		for (int i=0; i < this.numbers.length; i++){

		}

	}*/
}
