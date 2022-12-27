public class BeginsWithA implements IsGood<String> {
    // одобряет строку, если она начинается с символа 'А'
    @Override
    public boolean isGood(String item) {
        return item.charAt(0) == 'A';
    }
}
