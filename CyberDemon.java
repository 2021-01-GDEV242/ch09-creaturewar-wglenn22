
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon 
{
    private static final int max_CyberDemonHp = 100;
    private static final int min_CyberDemonHp = 25;
    private static final int max_CyberDemonStr = 40;
    private static final int min_CyberDemonStr = 20;
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super(
        Randomizer.nextInt(max_CyberDemonHp-min_CyberDemonHp)+min_CyberDemonHp,
        Randomizer.nextInt(max_CyberDemonStr-min_CyberDemonStr)+min_CyberDemonStr
        );
    }

}
