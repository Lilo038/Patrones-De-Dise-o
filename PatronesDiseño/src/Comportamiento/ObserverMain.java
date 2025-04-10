//https://www.youtube.com/watch?v=AgW6Rwo5WnE

package Comportamiento;

public class ObserverMain {

    public static void main(String[] args) {
        Skeleton skeleton1 = new Skeleton("Skeleton1");
        Skeleton skeleton2 = new Skeleton("Skeleton2");
        Zombie zombie1 = new Zombie("Zombie1");
        Zombie zombie2 = new Zombie("Zombie2");
        Vigilant vigilant = new Vigilant("Vigilant");
        
        vigilant.subscirbe(skeleton1);
        vigilant.subscirbe(skeleton2);
        vigilant.subscirbe(zombie1);
        vigilant.subscirbe(zombie2);
        vigilant.activate();
        System.out.println("============================");
        vigilant.unsubscribe(zombie2);
        vigilant.activate();
    }

}
