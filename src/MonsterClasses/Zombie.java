
package MonsterClasses;


public class Zombie extends Monster{
    
    public Zombie(String nm){
        super(nm);
        monstercount++; 
    }

    @Override
    public void attack() {
        System.out.println("I am eating your brains.");
    }
    
    @Override
    public void identify(){
        super.identify();
        System.out.println("Zombie");
    }
    
    public void hypnotize(){
        System.out.println("Zombie has hypnotized you.");
    }
    
}
