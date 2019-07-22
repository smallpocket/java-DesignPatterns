package templateMethod;

/**
 * @author Heper
 * @title
 * @date 2019/6/4 15:18
 */
public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation1();
        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    final void concreteOperation1() {
    }

    void hook() {
    }
}
