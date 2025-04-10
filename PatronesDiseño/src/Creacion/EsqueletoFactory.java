package Creacion;

public class EsqueletoFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Esqueleto();
    }
    
    
}
