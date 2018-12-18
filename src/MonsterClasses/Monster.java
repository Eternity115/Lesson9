
package MonsterClasses;


abstract public class Monster {
    protected String name;
    
    //staic = Class-level = applies to ALL objects
    protected static int monstercount=0;
    
    public Monster(String nm){
        name=nm;
    }
    
    public static int getMonsterCount(){
        return monstercount;
    }
    
    public abstract void attack();
    
    
    public void identify(){
        System.out.print("I am " + name + " the ");
    }
    
    
    
    
    
    
}
