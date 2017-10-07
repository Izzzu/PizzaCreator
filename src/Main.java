
public class Main {
    public static void main(String[] args) {
        PizzaCreator pizzaCreator = new PizzaCreator();
        int size = 1;
        String topping = "cheese";
        String dough = "thin";
        pizzaCreator.getPizza(new MargheritaPizzaFactory(topping, dough, size));
        pizzaCreator.getPizza(new HawaiianPizzaFactory(topping, dough, size));
        pizzaCreator.getPizza(new PepperoniPizzaFactory(topping, dough, size));
    }
}
