
public class MargheritaPizzaFactory extends AbstractPizzaFactory{

    public MargheritaPizzaFactory(String topping, String dough, int size) {
        super(topping, dough, size);

    }

    @Override
    public Pizza createPizza(String topping, String dough, int size) {
        System.out.println("Create Margherita");
        return new Margherita(size, topping, dough);
    }
}
