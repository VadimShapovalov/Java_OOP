
import java.util.Iterator;

// Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
// Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.
class Filter<T>{
    <T> Iterable<T> filter(Iterable<T> list, IsGood<T> approver){
        Iterable<T> newList = list;
        Iterator<T> iterator = newList.iterator();
        while(iterator.hasNext()){
            T item = iterator.next();
            if(!approver.isGood(item)) {iterator.remove();}
        }
        return   newList;
    }
}
