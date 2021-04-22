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

	public int getMoney(){return this.money;}

	public void addMoney(float amount){
		this.money += amount;
	}

	public void play(Machine machine){

		int bet = machine.getBet();

		if(this.money>=bet){
			this.money -= bet;
			System.out.println("You now have " + this.money + " € left\n");
			machine.launchGame(this, bet);
			this.showMoney();
		} else {
			System.out.println("You don't have enough money, add some or leave!\n");
		}

	}

}
