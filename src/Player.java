
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

    public void checkClassName(String p)
    {
        playerClass = p;
        if(playerClass.equals("Warrior"))
        {
            System.out.println("You have selected the Warrior class.");
        }
        if(playerClass.equals("Mage"))
        {
            System.out.println("You have selected the Mage class.");
        }
        if(playerClass.equals("Thief"))
        {
            System.out.println("You have selected the Thief class.");
        }
        else{
            System.out.println("No class selected.");
        }
    }
}
