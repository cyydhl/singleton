package main.java.com.itcast.singleton.lazy;

public class LazyInnerSingleton {
    private LazyInnerSingleton(){}

    public static LazyInnerSingleton getInstance(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder{
        private static final LazyInnerSingleton lazy = new LazyInnerSingleton();
    }

}
