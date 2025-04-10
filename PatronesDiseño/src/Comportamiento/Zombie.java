
package Comportamiento;

public class Zombie extends Enemy implements MyObserver{

    public Zombie(String name) {
        super(name);
        setActive(false);
    }

    
    @Override
    public void attack() {
        System.out.println(getName()+" Zombie on Attakc!");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName()+" Zombie is Active");
        
    }

    @Override
    public void update() {
        activate();
        attack();
    }
    
}
