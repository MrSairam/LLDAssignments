package casestudies.pizza;

public class Olive implements Pizza{
    private Pizza pizza;

    Olive(){}

    Olive(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int getCost() {
        return this.pizza.getCost()+20;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" + Olive";
    }
}
