
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int max_elfHP = 25;
    private static final int min_elfHP = 8;
    private static final int max_elfStr = 18;
    private static final int min_elfStr = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
        Randomizer.nextInt(max_elfHP-min_elfHP)+min_elfHP,
        Randomizer.nextInt(max_elfStr-min_elfStr)+min_elfStr
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage()
    {
        int dmgBoost;
        dmgBoost = super.attack();
        
        if(Randomizer.nextInt(10)==0){
        System.err.println("Magic Power Activated!");
        dmgBoost *= 2;
        }
        return dmgBoost;
    }
}
