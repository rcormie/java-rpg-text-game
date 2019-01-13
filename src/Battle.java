import java.util.Scanner;

public class Battle {

    public void initBattle()
    {
        Character npc = new NPC();
        npc.setStrength(8);
        npc.setWisdom(4);
        npc.setAgility(5);
        npc.setLevel(1);
        npc.setName("Goblin");
        npc.setAlive(true);
        System.out.println("You encounter a wild " + npc.getName());

        Scanner keyboard = new Scanner(System.in);

        while(npc.isAlive())
        {
         System.out.println("Press A to attack!");
         String attack = keyboard.nextLine();
         if (attack.equals("a"))
         {

         }

         System.out.println("The " + npc.getName() + " attacks you!");
        }
    }
}
