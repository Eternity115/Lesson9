
package MonsterInterface;


public class MonsterGame {

    
    public static void main(String[] args) {
        Monster v = new Vampire("Heirum");
        v = new Zombie("Valorie");
        Monster m[] = new Monster [4];
        m[0] = new Zombie ("Margaret");
        m[1] = new Zombie ("Theodore"); 
        m[2] = new Vampire ("Vladimre"); 
        m[3] = new Vampire ("Cornealius");
        
        for (int i = 0; i < 4; i++) {
            m[i].identify();
            m[i].attack();
            if (i<2){
                //zombie
                ((Zombie)m[i]).hypnotize();
            }
            else{
                //vampire
                ((Vampire)m[i]).transform();
            }
                
        }
        
        for (Monster x:m){
            x.identify();
            x.attack();
            if (x instanceof Zombie){
                ((Zombie)x).hypnotize();
            }
            if (x instanceof Vampire){
                ((Vampire)x).transform();
            }
        }
        
        
    }
    
}
