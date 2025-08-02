package br.com.javadeveloper;


public class Main {
    public static void main(String[] args) {
        SingletonEager eager1 = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager1 == eager2);

        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy1 == lazy2);

        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder1 == lazyHolder2);

    }
}