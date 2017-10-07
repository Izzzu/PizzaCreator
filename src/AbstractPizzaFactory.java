
public abstract class AbstractPizzaFactory {

    private final String topping;
    private final String dough;
    private final int size;

    public String getTopping() {
        return topping;
    }

    public String getDough() {
        return dough;
    }

    public int getSize() {
        return size;
    }

    protected AbstractPizzaFactory(String topping, String dough, int size) {
        this.topping = topping;
        this.dough = dough;
        this.size = size;
    }

    public abstract Pizza createPizza(String topping, String dough, int size);

}
