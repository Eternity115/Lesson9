
package MonsterInterface;
public class Vampire implements Monster{
    private String name;
    
    public Vampire(String n){
        name=n;
    }
    public void attack(){
        System.out.println("Vampire is sucking your blood!");
    }
    public void identify(){
        System.out.println("I am " + name + " the vampire.");
    }
    public void transform(){
        System.out.println("Vampire is now a bat.");
    }
    
    
}
