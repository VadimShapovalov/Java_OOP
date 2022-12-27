
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создаем массив целых чисел
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-5);
        array.add(8);
        array.add(-2);
        array.add(21);
        array.add(66);
        array.add(12);
        // заполняем новый массив только четными числами из первоначального списка с помощью метода isGood
        ArrayList<Integer> isEvenArray = new ArrayList<>();
        IsEven isEv = new IsEven();
        for (Integer integer : array) {
            if (isEv.isGood(integer)) {
                isEvenArray.add(integer);
            }
        }
        System.out.println(isEvenArray);

        // заполняем новый массив только положительными числами из первоначального списка с помощью метода isGood
        IsPositive isPos = new IsPositive();
        ArrayList<Integer> isPositiveArray = new ArrayList<>();
        for (Integer integer : array) {
            if (isPos.isGood(integer)) {
                isPositiveArray.add(integer);
            }
        }
        System.out.println(isPositiveArray);

        // Проверяем, начинается ли строка с символа 'A' с помощью метода isGood
        BeginsWithA beginsWithA = new BeginsWithA();
        System.out.println(beginsWithA.isGood("A beautiful ball"));

        // Проверяем, начинается ли строка с заданной подстроки с помощью метода isGood
        BeginsWith beginsWith = new BeginsWith("Река");
        System.out.println(beginsWith.isGood("Река была полна рыбой!"));

        // Делаем проверки через обобщенную функцию filter
        IsPositive isPositive = new IsPositive();
        Filter filter = new Filter();
        System.out.println(filter.filter(array, isPositive));


        // Делаем проверки через обобщенную функцию filter, которая вернет строку если она начинается на "A"
        BeginsWithA beginsWithA1 = new BeginsWithA();

        System.out.println(filter.filter(List.of("A nice girl"), beginsWithA1 ));
    }
}



