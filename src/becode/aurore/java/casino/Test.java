/*
package becode.aurore.java.casino;

import java.util.Scanner;

public  class Test{
//    private boolean yesNoChoice = false;
    private boolean goBack = false;
    private String currentPlayer;
    Scanner input = new Scanner(System.in);

*/
/*    public void sayWelcome(){
        System.out.println("Welcome to the casino!\n"
                            + "Do you have a player account?\n");
        yesNoChoice();
    }*//*


    public void printMenu(){
        System.out.println("================== MENU ==================");
        System.out.println("Press the key corresponding to your choice\n");

        if (yesNoChoice) {
            yesNoChoice();
        }
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

    public void createPlayer(Casino casino){
        System.out.println("Hello, what's your name?");
        String userName = input.nextLine();

        System.out.println("How much money did you bring to play?");
        Integer userMoney = input.nextInt();

        //Machine created even if condition for player creation was not fulfilled.
        Machine machine = new Machine();

        if (userName != null && !userName.isEmpty() && userMoney !=
                null){
            Player player = new Player(userName, userMoney);
            casino.addPlayer(player);

            casino.startMenu(player, machine);
        } else {
            System.out.println("Please answer the questions to enter the casino");
        }
    }

    public void yesNoChoice() {
        System.out.println("y - Yes");
        System.out.println("n - No\n");

        String choice = input.nextLine();

        switch (choice) {
            case "y":
                System.out.println("choose new player\n");
//                choosePlayer();
                break;
            case "n":
                System.out.println("create new player\n");
                createPlayer();
                break;
        }
    }


    public void launchMenu(Player player, Machine machine, Casino casino) {
        while (input.hasNext()) {

            switch (input.nextInt()) {
                case 0:
//                    enterCasino();
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
                    //exitMenu();
                    break;
                default:
                    System.out.println("Command unavailable\n");
                    break;

            }
        }
    }
}*/
