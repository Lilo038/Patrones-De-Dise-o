
package Estructura.Decorator;

import Estructura.Enemy;


public class BootsEnemyDecorator extends EnemyDecorator {
    
    public BootsEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Enemy with Boots");
    }
    
}
