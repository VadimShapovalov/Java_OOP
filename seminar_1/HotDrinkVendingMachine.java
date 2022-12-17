import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotDrinkVendingMachine implements VendingMachine{
    ArrayList<HotDrinkProduct> drinks = new ArrayList<>();

    public ArrayList fillMachine() {

            drinks.add(new HotDrinkProduct("black tea", 50, 101, 350, 80));
            drinks.add(new HotDrinkProduct("green tea", 55, 102, 350, 80));
            drinks.add(new HotDrinkProduct("black coffee", 70, 103, 350, 80));
            drinks.add(new HotDrinkProduct("cappuccino", 110, 104, 350, 80));
            drinks.add(new HotDrinkProduct("latte", 100, 105, 350, 80));
            drinks.add(new HotDrinkProduct("hot cocoa", 50, 106, 350, 80));
            drinks.add(new HotDrinkProduct("black tea", 50, 107, 500, 80));
            drinks.add(new HotDrinkProduct("green tea", 55, 108, 500, 80));
            drinks.add(new HotDrinkProduct("black coffee", 70, 109, 500, 80));
            drinks.add(new HotDrinkProduct("cappuccino", 110, 110, 500, 80));
            drinks.add(new HotDrinkProduct("latte", 100, 111, 500, 80));
            drinks.add(new HotDrinkProduct("hot cocoa", 50, 112, 500, 80));
            drinks.add(new HotDrinkProduct("black tea", 50, 113, 350, 60));
            drinks.add(new HotDrinkProduct("green tea", 55, 114, 350, 60));
            drinks.add(new HotDrinkProduct("black coffee", 70, 115, 350, 60));
            drinks.add(new HotDrinkProduct("cappuccino", 110, 116, 350, 60));
            drinks.add(new HotDrinkProduct("latte", 100, 117, 350, 60));
            drinks.add(new HotDrinkProduct("hot cocoa", 50, 118, 350, 60));
            drinks.add(new HotDrinkProduct("black tea", 50, 119, 500, 60));
            drinks.add(new HotDrinkProduct("green tea", 55, 120, 500, 60));
            drinks.add(new HotDrinkProduct("black coffee", 70, 121, 500, 60));
            drinks.add(new HotDrinkProduct("cappuccino", 110, 122, 500, 60));
            drinks.add(new HotDrinkProduct("latte", 100, 123, 500, 60));
            drinks.add(new HotDrinkProduct("hot cocoa", 50, 124, 500, 60));

          return drinks;

    }

    public void takeOrder() {
        //int number = 101;
        String name = "";
        int volume =-1;
        int temperature =-1;
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста выберите напиток: ");
        System.out.println("1- black tea, 2- green tea, 3- black coffee, 4- cappuccino, 5- latte, 6- hot cocoa");
        int num = in.nextInt();
        if (num == 1) {
             name = "black tea";
        } else if (num == 2) {
             name = "green tea";
        } else if (num == 3) {
             name = "black coffee";
        } else if (num == 4) {
             name = "cappuccino";
        } else if (num == 5) {
             name = "latte";
        } else if (num == 6) {
             name = "hot cocoa";
        } else {
            System.out.println("Некорректные данные!");
        }
        System.out.println("Пожалуйста выберите объем: 1 - 350 мл., 2 - 500 мл. ");
        int vol = in.nextInt();
        if (vol == 1) {
             volume = 350;
        } else if (vol == 2) {
             volume = 500;
        } else {
            System.out.println("Некорректные данные!");
        }
        System.out.println("Пожалуйста выберите темпуратугу: 1 - 80 гр., 2 - 60 гр. ");
        int t = in.nextInt();
        if (t == 1) {
             temperature = 80;
        } else if (t == 2) {
             temperature = 60;
        } else {
            System.out.println("Некорректные данные!");
        }
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        //machine.getProduct(name, volume, temperature);
        getProduct(name, volume, temperature);
        removeDrink(drinks, name, volume, temperature);
    }
    public void removeDrink(ArrayList<HotDrinkProduct> drinks, String name, int volume, int temperature) {
        // System.out.println(drinks.size());
        ArrayList<HotDrinkProduct> copy = new ArrayList<HotDrinkProduct>(drinks);
        for (HotDrinkProduct drink: copy) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemrerature() == temperature) {
                drinks.remove(drink);
            }
        }
        System.out.printf("Напитков осталось в автомате: %d", drinks.size());
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {
            System.out.println("Возьмите Ваш напиток из лотка. ");
            System.out.printf("Ваш напиток: %s, объем: %d, температура %d", name, volume, temperature);
            System.out.println();
             //ArrayList <HotDrinkProduct> dr = new ArrayList<>();
          //System.out.println(drinks.stream().filter(drink -> drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemrerature()== temperature).collect(Collectors.toList()));
             //drinks.stream().filter(drink -> drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemrerature()== temperature).collect(Collectors.toList());
    }
}
