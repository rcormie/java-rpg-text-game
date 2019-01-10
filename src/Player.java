
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    private int gold;
    private double exp;
    private String playerClass;

    public void setPlayerClass(String p)
    {
        playerClass = p;

        if(playerClass.equals("Warrior"))
        {
            System.out.println("As a Warrior you start with: ");
            setStrength(8);
            setWisdom(4);
            setAgility(5);
            setGold(100);
            setLevel(1);
            printStats();
        }
        if(playerClass.equals("Mage"))
        {
            System.out.println("As a Mage you start with: ");
            setStrength(4);
            setWisdom(9);
            setAgility(4);
            setGold(100);
            setLevel(1);
            printStats();
        }
        if(playerClass.equals("Thief"))
        {
            System.out.println("As a Thief you start with: ");
            setStrength(5);
            setWisdom(4);
            setAgility(8);
            setGold(400);
            setLevel(1);
            printStats();
        }
    }

    public String getPlayerClass()
    {
        return playerClass;
    }

    public void setGold(int g)
    {
        gold = g;
    }

    public int getGold()
    {
        return gold;
    }

    public void setExp(Double xp)
    {
        exp = xp;
    }

    public Double getExp()
    {
        return exp;
    }

    public void printStats()
    {
        System.out.println("Strength: " + getStrength());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Agility: " + getAgility());
        System.out.println("Gold: " + getGold());
        System.out.println("Level: " + getLevel());
    }
}
