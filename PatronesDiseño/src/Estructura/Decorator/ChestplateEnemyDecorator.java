
package Estructura.Decorator;

import Estructura.Enemy;


public class ChestplateEnemyDecorator extends EnemyDecorator {
    
    public ChestplateEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Enemy with Chestplate");
    }
    
}
