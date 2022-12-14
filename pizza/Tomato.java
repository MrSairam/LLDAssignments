package casestudies.pizza;

public class Tomato implements Pizza{
    private Pizza pizza;

    public Tomato(){}

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+30;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Tomato";
    }
}
