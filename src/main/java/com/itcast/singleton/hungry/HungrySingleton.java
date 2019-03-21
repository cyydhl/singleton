package main.java.com.itcast.singleton.hungry;

//饿汉式
public class HungrySingleton {
    private HungrySingleton(){}
    private static final HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
