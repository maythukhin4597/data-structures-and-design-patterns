package behavioral.template.headfirst.after;

public abstract class CaffeineBeverage {

    /**
     * template method for an algorithm
     * Some methods in the template methods are handled by this class
     * Others implemented by subclasses declared as abstract class
     * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Poor to a cup");
    }

    /**
     * Here we’ve defined a method with a (mostly) empty default implementation.
     * subclass can override this method, but doesn’t have to.
     */
    public boolean customerWantsCondiments() {
        return true;
    }
}
