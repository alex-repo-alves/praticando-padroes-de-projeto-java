package dev.alex.gof;

/**
 * Singleton "apressado"
 * 
 * @author Alex
 */

public class SingletonEager {
   
    private static SingletonEager instancia = new SingletonEager();;

    //contrutor privado garante que não será instanciado externamente
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){

        return instancia;
    }
}
