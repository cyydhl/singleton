package main.java.com.itcast.singleton.lazy;

public class LazySimpleHungry {
    private LazySimpleHungry(){}
    private static LazySimpleHungry lazy = null;

    public synchronized static LazySimpleHungry getInstance(){
        if (lazy == null){
            lazy = new LazySimpleHungry();
        }
        return lazy;

    }
}
