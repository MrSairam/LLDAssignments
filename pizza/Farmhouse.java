package casestudies.pizza;

public class Farmhouse implements Pizza{
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}
