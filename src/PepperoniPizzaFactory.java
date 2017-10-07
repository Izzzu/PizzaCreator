
public class PepperoniPizzaFactory extends AbstractPizzaFactory{

    public PepperoniPizzaFactory(String topping, String dough, int size) {
        super(topping, dough, size);

    }

    @Override
    public Pizza createPizza(String topping, String dough, int size) {
        System.out.println("Create Pepperoni");

        return new Pepperoni(size, topping, dough);
    }
}
