package becode.aurore.java.casino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Casino class containing the start menu waiting for user input to play the game.
 */
public class Casino {

    private final String message = "Choose your option: \n"
            + "[0] - Change player \n"
            + "[1] - Show money \n"
            + "[2] - Add 1€ \n"
            + "[3] - Add 5€ \n"
            + "[4] - Play\n"
            + "[5] - Exit\n";

    private ArrayList<Player> players = new ArrayList<>();

    private Player currentPlayer;

    private boolean goBack = false;

    private Scanner input = new Scanner(System.in);

    public void sayWelcome(){
        System.out.println("Welcome to the casino!\n"
                + "Please sign in or create an account.\n");
        printMenu();

    }

    public void showMenu(){

            System.out.println("================== MENU ==================");
            System.out.println("Press the key corresponding to your choice\n");

            if (goBack) {
                System.out.println("0 - Back");
            }
            System.out.println("1 - New player");
            System.out.println("2 - Choose player");

            if (currentPlayer != null && !currentPlayer.isEmpty()) {
                System.out.println("3 - Show player info");
                System.out.println("4 - Add money");
                System.out.println("5 - Play");
            }

            System.out.println("e - Exit");
    }

    public void addPlayer(Object player) {
        playerObjects.add(player);
        System.out.println("playerObjects size: " + playerObjects.size());
//        System.out.printf();

    }
    public void createPlayer(){

        System.out.println("Hello, what's your name?");
        String userName = input.nextLine();

        System.out.println("How much money did you bring to play?");
        Integer userMoney = input.nextInt();

        //Machine created even if condition for player creation was not fulfilled.
        Machine machine = new Machine();

        if (userName != null && !userName.isEmpty() && userMoney !=
                null){
            Player player = new Player(userName, userMoney);
            addPlayer(player);

            startMenu(player, machine);
        } else {
            System.out.println("Please answer the questions to enter the casino");
        }
    }
    public void showMenu(){
        System.out.println(message);
    }

    public void startMenu(Player player, Machine machine) {
        
        String userName = player.showName();

        System.out.println("welcome, " + userName);

        showMenu();
        while(input.hasNext()) {

            switch (input.nextInt()){
                case 0:
                    enterCasino();
                    break;

                case 1:
                    player.showMoney();
                    break;
                case 2:
                    player.addMoney(1);
                    player.showMoney();
                    break;
                case 3:
                    player.addMoney(5);
                    player.showMoney();
                    break;
                case 4:
                    player.play(machine);
                    break;
                case 5:
                    exitMenu();
                    break;
                default:
                    System.out.println("Command unavailable\n");
                    break;

            }
            showMenu();

        }
    }

    public void exitMenu() {
        System.out.println("Goodbye!\n");
        System.exit(0);
    }

}
