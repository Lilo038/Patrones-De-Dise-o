
package Estructura.Decorator;

import Estructura.Enemy;


public class HelmetEnemyDecorator extends EnemyDecorator {
    
    public HelmetEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Enemy with Helmet");
    }
    
}
