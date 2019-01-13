
/**
 * Abstract The Character Class. Player Characters and NPC's will
 * Inherit from this class.
 *
 * @author Robin Cormie
 * @version 0.0.1
 */
public abstract class Character {

    // instance variables
    private double maxHitPoints;
    private double currentHitPoints;
    private int level;
    private String name;

    // rpg stats
    private int strength;
    private int agility;
    private int wisdom;

    //no arg constructor
    public Character() {
        this.maxHitPoints = 0;
        this.level = 0;
        this.name = null;
        this.strength = 0;
        this.agility = 0;
        this.wisdom = 0;
        this.alive = false;
    }

    public Character(double maxHitPoints, int level, String name, int strength, int agility, int wisdom, boolean alive) {
        this.maxHitPoints = maxHitPoints;
        this.level = level;
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.wisdom = wisdom;
        this.alive = alive;
    }

    //gameplay
    private boolean alive;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }


    public void setMaxHitPoints(double h) {
        maxHitPoints = h;
    }

    public double getMaxHitPoints() {
        return maxHitPoints;
    }

    public double getCurrentHitPoints() {return currentHitPoints; }

    public void setCurrentHitPoints(double currentHitPoints) {this.currentHitPoints = currentHitPoints;}

    public void setLevel(int l) {
        level = l;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
