import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyArraysListInteger {
    static ArrayList list = new ArrayList();


    public static void getSize(List list){
        System.out.println("Размер массива " + list.size());
    }

    public static void get (List list, int i) {
        System.out.println("Элемент по индексу " + i  + " " + list.get(i));
    }

    public static void set (List list, int i, int j) {
        System.out.println("Присвоим значение " + j + " по индексу " + i + " " + list.set(i, j));
    }

    public static void delete (List list, int i) {
        System.out.println("Удалим значение " + list.remove(i) + " с индексом " + i);
    }

    public static void sort (List list) {
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        System.out.println("Сортировка " + list);
    }

    public static void toArray (List list) {
        System.out.println("Преобразование в массив" + list.toArray());
    }

    public static void equals (List list, int i, int j) {
        System.out.println("Equals " + list.get(i).equals(list.get(j)));
    }

    public static void iterator (List list, int i) {
        System.out.println("Iterator " + list.listIterator(i));
    }
}
