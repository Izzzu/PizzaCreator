
public class PizzaCreator {

    public Pizza getPizza(AbstractPizzaFactory factory) {
        return factory.createPizza(factory.getTopping(), factory.getDough(), factory.getSize());
    }
}
