import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList<HotDrinkProduct> dr = new ArrayList<>();
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.fillMachine();
        machine.takeOrder();
        //machine.removeDrink();

    }
}