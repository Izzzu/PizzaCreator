
public class Main {
    public static void main(String[] args) {
        PizzaCreator pizzaCreator = new PizzaCreator();
        int size = 1;

        String toppingMarg = "cheese";
        String doughMarg = "thin";
        pizzaCreator.getPizza(new MargheritaPizzaFactory(toppingMarg, doughMarg, size));

        String toppingH = "sdfsdfcheese";
        String doughH = "thindsd";
        pizzaCreator.getPizza(new HawaiianPizzaFactory(toppingH, doughH, size));
    }
}
