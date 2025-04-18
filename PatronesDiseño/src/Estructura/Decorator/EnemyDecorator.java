package Estructura.Decorator;

import Estructura.Enemy;

public abstract class EnemyDecorator implements Enemy {

    protected Enemy enemy;

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void attack() {
        enemy.attack();
    }

}
