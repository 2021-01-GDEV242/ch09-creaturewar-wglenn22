
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int max_demonHP = 100;
    private static final int min_demonHP = 50;
    private static final int max_demonStr = 75;
    private static final int min_demonStr = 25;
    
    
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
        Randomizer.nextInt(max_demonStr-min_demonStr) +min_demonStr,
        Randomizer.nextInt(max_demonHP-min_demonHP) + min_demonHP
        );
    }
    public Demon(int str, int hp)
    {
        super(str,hp);
    }
    /**
     * Calculates Damage delt by demon class
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage()
    {
        int dmgBoost;
        dmgBoost = super.attack();
        
        if(Randomizer.nextInt(20)==0){
        System.err.println("Demonic Power Activated!");
        dmgBoost += 50;
        }
        return dmgBoost;
    }
}
