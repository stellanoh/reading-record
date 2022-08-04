package Chap2CreatingAndDestroyingObjects.item1.constructor;

/**
 * @author henoh@nkia.co.kr on 2022-07-28
 * @desc
 */
public class SingletonFoo {
    private FooRepository fooRepository;
    public static final SingletonFoo INSTANCE = new SingletonFoo(new FooRepository());

    public SingletonFoo(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    public static SingletonFoo getInstance() { //not thread-safe
        return INSTANCE;
    }

    public FooRepository getFooRepository() {
        return fooRepository;
    }
}
