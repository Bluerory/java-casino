package becode.aurore.java.casino;

/**
 * This class defines all the fields and methods of the Player class.
 */
public class Player {

	private int money;

	public Player() {
		this.money = 5;
	}

	public void showMoney(){
		System.out.println("You have " + this.money + "€ on your account\n");
	}

	public void addMoney(float addedMoney){
		this.money += addedMoney;
	}

	public void play(int amount){
		this.money -= amount;
//		jouer(amount)

	public void play(Machine machine){

		int bet = getBet();

		this.money -= bet;
		System.out.println("You now have " + this.money + " € left\n");
		machine.launchGame(this, bet);

	}

}
