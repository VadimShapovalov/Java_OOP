public class IsPositive implements IsGood<Integer> {
    // одобряет целое число, если оно больше нуля
    @Override
    public boolean isGood(Integer item) {
        return item > 0;
    }
}
