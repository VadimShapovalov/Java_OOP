public class DrinkProduct extends Product {
    private int volume;
    private boolean gas;
    private String pack;

    public DrinkProduct(String name, int price, int number, int volume, boolean gas, String pack) {
        super(name, price, number);
        this.volume = volume;
        this.gas = gas;
        this.pack = pack;
    }

    public DrinkProduct(String name, int price, int number, int volume) {
        super(name, price, number);
        this.volume = volume;
        this.gas = false;
        this.pack = "glass";
    }

    public int getVolume() {
        return volume;
    }

    public boolean getGas() {
        return gas;
    }

    public String getPack() {
        return pack;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Drinks{" +
                "volume=" + volume +
                ", gas='" + gas + '\'' +
                ", pack='" + pack + '\'' +
                '}';
    }
}
