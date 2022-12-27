public class IsEven implements IsGood<Integer>{

// одобряет целое число, если оно четное
    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
}
