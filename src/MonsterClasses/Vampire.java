
package MonsterClasses;


public class Vampire extends Monster{
    
    public Vampire(String nm){
        super(nm);
        monstercount++;        
    }

    @Override
    public void attack() {
        System.out.println("I am sucking your blood.");
    }
    
    @Override
    public void identify(){
        super.identify();
        System.out.println(getClass().getSimpleName());
    }
    
    public void transform(){
        System.out.println("Vampire is now a bat.");
    }
    
}
