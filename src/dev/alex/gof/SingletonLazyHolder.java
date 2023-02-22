package dev.alex.gof;

/**
 * Singleton "Lazy Holder"
 * 
 * @author Alex
 */

public class SingletonLazyHolder {
   
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();;
    }

    //contrutor privado garante que não será instanciado externamente
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){

        return InstanceHolder.instancia;
    }
}
