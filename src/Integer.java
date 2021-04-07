import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Integer implements Comparable<Integer> {
    private int num = 0;

    public Integer(int num) {
        this.num = num;
    }

    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int compareTo(Integer o) {
        return o.num - this.num;
    }

    static void getSize(List<Integer> myArrayList) {
        System.out.println(myArrayList.size());
    }

    static void get(List<Integer> myArrayList, int i) {
        System.out.println(myArrayList.get(i));
    }

    static void set(List<Integer> myArrayList, int i, int j) {
        System.out.println(myArrayList.set(i, new Integer(j)));
    }

    static void delete(List<Integer> myArrayList, int i) {
        System.out.println(myArrayList.remove(i));
    }

    static void sort(List<Integer> myArrayList) {
        Collections.sort(myArrayList);
        System.out.println(myArrayList);
    }

    static void toArray(List<Integer> myArrayList) {
        System.out.println(myArrayList.toArray());
    }

    static void equals(List<Integer> myArrayList, int i, int j) {
        System.out.println(myArrayList.get(i).equals(myArrayList.get(j)));
    }

    static void iterator(List<Integer> myArrayList) {
        Iterator iterator = myArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
