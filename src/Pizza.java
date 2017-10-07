
public abstract class Pizza {
    private int size;
    private String topping;
    private String dough;

    public Pizza(int size, String topping, String dough) {
        this.size = size;
        this.topping = topping;
        this.dough = dough;
    }

    public Pizza() {
    }


    public int getSize() {
        return size;
    }

    public String getTopping() {
        return topping;
    }

    public String getDough() {
        return dough;
    }
}
