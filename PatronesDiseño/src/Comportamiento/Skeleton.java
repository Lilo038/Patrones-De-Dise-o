
package Comportamiento;

public class Skeleton extends Enemy implements MyObserver{

    public Skeleton(String name) {
        super(name);
        setActive(false);
    }

    
    @Override
    public void attack() {
        System.out.println(getName()+" Skeleton on Attakc!");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName()+" Skeleton is Active");
        
    }
    
    @Override
    public void update() {
        activate();
        attack();
    }
}
