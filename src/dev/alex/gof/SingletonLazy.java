package dev.alex.gof;

/**
 * Singleton "preguiçoso"
 * 
 * @author Alex
 */

public class SingletonLazy {
   
    private static SingletonLazy instancia;

    //contrutor privado garante que não será instanciado externamente
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
