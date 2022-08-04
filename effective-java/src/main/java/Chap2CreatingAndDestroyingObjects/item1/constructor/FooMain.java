package Chap2CreatingAndDestroyingObjects.item1.constructor;

/**
 * @author henoh@nkia.co.kr on 2022-07-28
 * @desc
 */
public class FooMain {
    public static void main(String[] args) {
        //Constructor -> Repository DI
        Foo foo = new Foo(new FooRepository());
        Foo foo2 = new Foo(new FooRepository());

        System.out.println("Is foo1 == foo2 ? " + foo.equals(foo2));
        System.out.println("Is foo1.repository == foo2.repository? " + foo.getFooRepository().equals(foo2.getFooRepository()));

        //Static Factory Method -> Sigleton Foo
        SingletonFoo singletonFoo = SingletonFoo.getInstance();
        SingletonFoo singletonFoo2 = SingletonFoo.getInstance();
        System.out.println("Is Sigleton1 == Sigleton2 ? " + singletonFoo.equals(singletonFoo2));
        System.out.println("Is Sigleton1.repository == Sigleton2.repository? " + singletonFoo.getFooRepository().equals(singletonFoo2.getFooRepository()));
    }
}
