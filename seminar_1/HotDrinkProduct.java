public class HotDrinkProduct extends DrinkProduct {
    private int temrerature;

    public HotDrinkProduct(String name, int price, int number, int volume, int temperature) {
        super(name, price, number, volume);
        this.temrerature = temperature;
    }

    public int getTemrerature() {
        return temrerature;
    }

    public void setTemrerature(int temrerature) {
        this.temrerature = temrerature;
    }

    @Override
    public String toString() {
        return super.toString() +
                "HotDrinkProduct{" +
                "temrerature=" + temrerature +
                '}';
    }
}


