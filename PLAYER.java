package game;


public class PLAYER {
    
    String name;
    int speed;
    int damage;
    int armor;
    int healthPoin;
    
    void run(){
       System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed); 
    }
    
    void attack(String a){
        System.out.println(name +" is attacking ");
        System.out.println("damage: "); 
        System.out.println("HP "+a+" sekarang : ");
    }
    
    void defence(){
        System.out.println(name +" is defend");
        System.out.println("armor: "+ armor); 
    }
    
    boolean isDead(){
         if(healthPoin <= 0) return true;
        return false;
    }
}
