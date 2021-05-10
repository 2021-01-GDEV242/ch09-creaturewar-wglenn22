import java.util.ArrayList;
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>(100);
    private ArrayList<Creature> evilArmy = new ArrayList<Creature>(40);
    
    private Randomizer r = new Randomizer();
    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        assembleGoodArmy();
        assembleEvilArmy();
        
        
    }
    private void assembleGoodArmy(){
        for(int i = 0; i <= 100; i++){
           int draftCall = Randomizer.nextInt(10); 
           if(draftCall < 7){
             goodArmy.add(new Human());
            }
           else{
               goodArmy.add(new Elf());
        }
    }
    
}
    private void assembleEvilArmy(){
        for(int i =0; i <= 40; i++){
         int draftCall = Randomizer.nextInt(25);
         if(draftCall < 19){
              evilArmy.add(new Human());
            }
         else if (draftCall < 25){
              evilArmy.add(new CyberDemon());
        }
        else{
            evilArmy.add(new Balrog());
        }
    }
}
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void engageInBattle()
    {  Creature goodCombatant=null;
        Creature evilCombatant=null;
        boolean goodActive = false;
        boolean evilActive = false;
        do {
            
            if ((goodCombatant == null) && (goodArmy.size() > 0)) {goodCombatant = goodArmy.remove(0); goodActive = goodCombatant.isAlive();}
            if ((evilCombatant == null) && (evilArmy.size() > 0)) {evilCombatant = evilArmy.remove(0); evilActive = evilCombatant.isAlive();}
            while (goodCombatant.isAlive() && evilCombatant.isAlive()){
                evilCombatant.takeDamage(goodCombatant.attack());
                goodCombatant.takeDamage(evilCombatant.attack());
                String s= "\t";
                s += goodCombatant.getClass();
                s += (goodCombatant.isAlive()? " is standing (":" has died (");
                s += ("HP: " + goodCombatant.getHealth() + ")");
                s += "\t" + "::" + "\t";
                s += evilCombatant.getClass();
                s += (evilCombatant.isAlive()? " is standing (":" has died (");
                s += ("HP: " + evilCombatant.getHealth() + ")");
                System.out.println(s);
            }
            if(goodCombatant.isKnockedOut()) 
            {goodActive = goodCombatant.isAlive(); 
             goodCombatant = null;}
            if(evilCombatant.isKnockedOut()) {
                evilActive = evilCombatant.isAlive(); 
                evilCombatant = null;}
            System.out.println("Good: " + goodArmy.size() + "\t::\t" + "Evil: " + evilArmy.size());
                
        } while ((goodArmy.size() > 0 && evilArmy.size() > 0) 
        || ((goodArmy.size() > 0 && evilActive) || (evilArmy.size() > 0 && goodActive)));
        
        if (goodArmy.size() > 0) {
           
            System.out.println ("We did it! We vanqueshed the dark creatures!"); 
           
        } else if (evilArmy.size() > 0) {
          
            System.out.println ("Oh no they've sank our battleship! ");
           
        } else {
           
            System.out.println("Life is a cruel mistress indeed!");
           
        }
        
        
    }
    
}
