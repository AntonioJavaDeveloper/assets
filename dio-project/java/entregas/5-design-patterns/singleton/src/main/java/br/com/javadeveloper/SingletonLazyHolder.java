package br.com.javadeveloper;

public class SingletonLazyHolder {
    private static class SingletonHolder {
        private static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
    }
    public static SingletonLazyHolder getInstance() {
        return SingletonHolder.instance;
    }
}
