
public class MargheritaPizzaFactory extends AbstractPizzaFactory{



    public MargheritaPizzaFactory(String topping, String dough2, int size) {
        super("2xcheese", "thin", size);

    }

    @Override
    public Pizza createPizza( int size) {
        System.out.println("Create Margherita");
        return new Margherita(size, this.getTopping(), this.getDough());
    }
}
