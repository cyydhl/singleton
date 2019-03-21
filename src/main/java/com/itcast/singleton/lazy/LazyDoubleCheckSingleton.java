package main.java.com.itcast.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private  LazyDoubleCheckSingleton(){}
    private static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
