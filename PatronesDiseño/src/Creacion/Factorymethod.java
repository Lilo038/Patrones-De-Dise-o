//https://www.youtube.com/watch?v=D_YIHqw-p7s
package Creacion;

public class Factorymethod {

    public static void main(String[] args) {
        Enemy esqueleto = new EsqueletoFactory().createEnemy();
        Enemy zombie = new ZombieFactory().createEnemy();
        esqueleto.attack();
        zombie.attack();
    }
    
}
