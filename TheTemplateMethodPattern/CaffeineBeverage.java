public abstract class CaffeineBeverage {
    final void prepareRecipe() { //final keyword Means subclasses cannot override this method.
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook method
    // boolean customerWantsCondiments() {
    //     return true;
    // }
}
