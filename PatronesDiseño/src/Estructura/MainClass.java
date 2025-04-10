//https://www.youtube.com/watch?v=KVkzs3nFZfs&t=608s
package Estructura;

import Estructura.Decorator.BootsEnemyDecorator;
import Estructura.Decorator.ChestplateEnemyDecorator;
import Estructura.race.Skeleton;
import Estructura.Decorator.HelmetEnemyDecorator;
import Estructura.Decorator.LeggingsEnemyDecorator;
import Estructura.race.Zombie;


public class MainClass {
    public static void main(String[] args) {
        System.out.println("====Skeleton with Helmet====");
        Enemy skeletonWithHelmet = new HelmetEnemyDecorator (new Skeleton());
        skeletonWithHelmet.attack();
        System.out.println("====Zombie with Boots and Chestplate====");
        Enemy zombieWBootsAndChestplate = new BootsEnemyDecorator (new ChestplateEnemyDecorator (new Zombie()));
        zombieWBootsAndChestplate.attack();
        System.out.println("====Zombie Full====");
        Enemy zombieFull = new BootsEnemyDecorator (new ChestplateEnemyDecorator (new HelmetEnemyDecorator(new LeggingsEnemyDecorator(new Zombie()))));
        zombieFull.attack();
    }
    
}
