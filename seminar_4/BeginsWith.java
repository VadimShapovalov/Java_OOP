public class BeginsWith implements IsGood<String>{
    public String begin;
    // задание: ... в конструкторе запоминает строку.
    // Ему дают строку, он проверяет, что она начинается с того, что он запомнил.
    public BeginsWith(String begin) {
        this.begin = begin;
    }
// метод сравнимает начало переданной в него строки с переменной, которую наш класс содержит изначально.
    @Override
    public boolean isGood(String item) {
        String subStr = item.substring(0, begin.length());
        return begin.equals(subStr);
    }
}
