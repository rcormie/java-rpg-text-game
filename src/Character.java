
/**
 * Abstract The Character Class. Player Characters and NPC's will
 * Inherit from this class.
 *
 * @author Robin Cormie
 * @version  0.0.1
 */
public abstract class Character
{
    // instance variables
    private double maxHitPoints;
    private int level;
    private String name;

    // rpg stats
    private int strength;
    private int agility;
    private int wisdom;

    public void setMaxHitPoints(double h)
    {
        maxHitPoints = h;
    }

    public double getMaxHitPoints()
    {
        return maxHitPoints;
    }

    public void setLevel(int l)
    {
        level = l;
    }

    public int getLevel()
    {
        return level;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
}
