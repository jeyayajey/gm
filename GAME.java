package game;

public class GAME {

    public static void main(String[] args) {
       PLAYER hero = new PLAYER();
       PLAYER enemy = new PLAYER();
       
       hero.name = "shafa";
       hero.speed = 80;
       hero.damage = 40;
       hero.armor = 20;
       hero.healthPoin = 0;
       
       enemy.name = "chika";
       enemy.speed = 70;
       enemy.damage = 50;
       enemy.armor = 30;
       enemy.healthPoin = 20;
       
       hero.run();
       hero.attack();
       
       
       if(hero.isDead() || enemy.isDead()){
           System.out.println("Game Over!");
       }
    }
    
}
