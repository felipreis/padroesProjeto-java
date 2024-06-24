package dio.dio.gof;

public class Test {

    public static void main(String[] args) {
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


    }
}
