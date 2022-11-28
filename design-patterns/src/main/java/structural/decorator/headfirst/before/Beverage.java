package structural.decorator.headfirst.before;

public abstract class Beverage {
    public Beverage() {
        setDescription();
    }

    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    abstract double cost();

    public String getDescription() {
        return description;
    }

    public abstract void setDescription();

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public double hasCondiment() {
        double cost = 0.0;
        if (hasMilk()) {
            description += " ," + "Milk added";
            cost += 0.5;
        }
        if (hasMocha()) {
            description += " ," + "Mocha added";
            cost += 0.5;
        }
        if (hasSoy()) {
            description += " ," + "Soy added";
            cost += 0.5;
        }
        if (hasWhip()) {
            description += " ," + "Whip added";
            cost += 0.5;
        }
        return cost;
    }
}
