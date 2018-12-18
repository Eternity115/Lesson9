
package MonsterClasses;


public class TestMonsters {

    
    public static void main(String[] args) {
        Monster m[] = new Monster[2];
        
        System.out.println("Currently I have " + Monster.getMonsterCount() + " monsters");
        
        m[0] = new Vampire("Buffy");
        m[1] = new Zombie("Joe");
        
        System.out.println("Now I have " + m[0].getMonsterCount() + " monsters");
        System.out.println("Now I have " + m[1].getMonsterCount() + " monsters");
        
        //over-ridden method, borrows from parent
        m[0].identify();
        m[1].identify();
        //abstract method, fully defined in child
        m[0].attack();
        m[1].attack();
        //exclusive method
        ((Vampire)m[0]).transform();
        ((Zombie)m[1]).hypnotize();
        
        
    }
    
}
