package exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(11);
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(17);
        list.add(12);

        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
