
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    private static final int max_balrogHP = 200;
    private static final int min_balrogHP = 80;
    private static final int max_balrogStr = 100;
    private static final int min_balrogStr = 50;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
        Randomizer.nextInt(max_balrogHP-min_balrogHP)+min_balrogHP,
        Randomizer.nextInt(max_balrogStr-min_balrogStr)+min_balrogStr
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
        
        return super.attack() + super.attack();
    }
}
