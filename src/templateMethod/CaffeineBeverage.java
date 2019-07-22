package templateMethod;

/**
 * @author Heper
 * @title
 * @date 2019/6/4 15:05
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addConiments();
    }

    void boilWater() {
    }

    abstract void brew();

    void pourInCup() {
    }

    abstract void addConiments();
}
