package becode.aurore.java.casino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Casino class containing the start menu waiting for user input to play the game.
 */
public class Casino {

    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Machine> machines = new ArrayList<>();

    private Player currentPlayer;
    private Machine currentMachine;

    private Scanner input = new Scanner(System.in);

    public void sayWelcome() {
        System.out.println("Welcome to the casino!\n"
                + "Please, press the key corresponding to your choice\n");
        startMenu();
    }

    public void showMenu() {

        System.out.println("================== MENU ==================");

        System.out.println("1 - New player");
        System.out.println("2 - Choose player");

        if (currentPlayer != null) {
            System.out.println("3 - Show player info");
            System.out.println("4 - Add money");
            System.out.println("5 - Play");
        }

        System.out.println("e - Exit\n");
    }

    private void addMachine(Machine machine){
        machines.add(machine);
        System.out.println("machines list size: " + machines.size());
    }

    private void createMachine(String machineName){
        Machine machine = new Machine(machineName);
        System.out.println("machine name: " + machineName);

        addMachine(machine);
        currentMachine = machine;
    }

    private void initFirstMachine(){
        createMachine("Slots");
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("playerObjects size: " + players.size());
        System.out.println("welcome, " + player.showName());

    }

    public void createPlayer() {

        System.out.println("What's your name?");
        String userName = input.nextLine();

        System.out.println("How much money did you bring to play?");
        Integer userMoney = input.nextInt();

        if (userName != null && !userName.isEmpty() && userMoney !=
                null) {
            Player player = new Player(userName, userMoney);
            addPlayer(player);

            currentPlayer = player;

        } else {
            System.out.println("Please answer the questions to enter the casino");
        }
    }

    private void showPlayers() {

        if (players.size() > 0) {
            System.out.println("=============== PLAYER LIST ==============\n" +
                    "Who are you?");
            for (int i = 0; i < players.size(); i++) {
                System.out.println((i + 1) + " - " + players.get(i).showName());
            }
            currentPlayer = players.get(input.nextInt() - 1);
        } else {
            System.out.println("No player registered, please create your profile\n");
        }
    }

    public void startMenu() {

        initFirstMachine();
        showMenu();

        while (input.hasNext()) {

            switch (input.nextLine()) {

                case "1":
                    createPlayer();
                    break;

                case "2":
                    showPlayers();
                    break;

                case "3":
                    if (currentPlayer != null) {
                        currentPlayer.showInfo();
                    }
                    break;

                case "4":
                    if (currentPlayer != null) {
                        currentPlayer.addMoneyToAccount();
                    }
                    break;

                case "5":
                    if (currentPlayer != null) {
                        currentPlayer.play(currentMachine);
                    }
                    break;

                case "e":
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
