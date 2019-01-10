import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String[] args)
    {
        GameFunction gf = new GameFunction();
        Player player = new Player();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("~~~~~~~~~~ Welcome to the amazing text-based RPG Game ~~~~~~~~~~");
        System.out.println();
        System.out.println("Please create a character to start your adventure.");
        System.out.println();

        gf.pressEnterToContinue();

        System.out.println("Please enter your name: ");

        String name = keyboard.nextLine();

        player.setName(name);

        System.out.println("What class is your character? Please select one of the following:\n"+
                "-----------------------------------------------------------------\n"+
                "                [1]Warrior [2]Thief [3]Mage\n"+
                "-----------------------------------------------------------------\n");


        int playerClass = keyboard.nextInt();

        if (playerClass == 1)
        {
            player.setPlayerClass("Warrior");
        }
        else if (playerClass == 2)
        {
            player.setPlayerClass("Thief");
        }
        else if (playerClass == 3)
        {
            player.setPlayerClass("Mage");
        }

        System.out.println("You are a " + player.getPlayerClass() + " named " + player.getName() + ".");



        // Player player = new Player();

        // player.setMaxHitPoints(10);

        // System.out.println(name + "'s has " + player.getMaxHitPoints() + " hit points.");
    }
}