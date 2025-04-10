
package Estructura.Decorator;

import Estructura.Enemy;


public class LeggingsEnemyDecorator extends EnemyDecorator {
    
    public LeggingsEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Enemy with Leggings");
    }
    
}
