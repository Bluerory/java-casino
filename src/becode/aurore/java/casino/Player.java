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
		System.out.println("the player has: " + this.money + "€");
	}

	public void addMoney(float addedMoney){
		this.money += addedMoney;
	}

	public void play(int amount){
		this.money -= amount;
//		jouer(amount)


	}

}
