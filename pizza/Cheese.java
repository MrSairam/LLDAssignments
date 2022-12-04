package casestudies.pizza;

public class Cheese implements Pizza{
    private Pizza pizza;

    public Cheese(){}

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+80;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" + Cheese";
    }
}
