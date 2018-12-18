
package MonsterInterface;

public class Zombie implements Monster{
    private String name;
    
    public Zombie(String n){
        name=n;
    }
    public void attack(){
        System.out.println("Zombie is eating your brains!");
    }
    public void identify(){
        System.out.println("I am " + name + " the zombie.");
    }
    public void hypnotize(){
        System.out.println("Zombie has hypnotized you.");
    }
    
    
}
