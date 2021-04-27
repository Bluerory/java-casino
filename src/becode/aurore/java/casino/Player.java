package becode.aurore.java.casino;

import java.util.Scanner;
/**
 * This class defines all the fields and methods of the Player class.
 */
public class Player {

	private int money;
	private String name;

	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String showName(){
		return this.name;
	}

	public void showMoney(){
		System.out.println("You have " + this.money + "€ on your account\n");
	}

	public void showInfo() {
		System.out.println("Your username:" + showName() +"\n" +
				"Your money: " + getMoney() + "€\n");
	}

	public int getMoney(){return this.money;}

	public void addMoney(float amount){
		this.money += amount;
	}

	public void addMoneyToAccount(){
		System.out.println("How much money do you want to add?");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		addMoney(amount);
		showMoney();
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
