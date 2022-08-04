package Chap2CreatingAndDestroyingObjects.item1.constructor;

/**
 * @author henoh@nkia.co.kr on 2022-07-27
 * @desc
 */
public class Foo {
    private final FooRepository fooRepository;
    public Foo(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    public FooRepository getFooRepository() {
        return fooRepository;
    }
}
