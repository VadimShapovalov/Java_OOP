
public class Product {
    private String name;
    private int price;
    private int number;

    public Product(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}

//    public Product findProductPrice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите номер товара:");
//        int num = scanner.nextInt();
//        for (Product product: Pr
//             ) {
//
//        } {








