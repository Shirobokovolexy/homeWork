import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(new Integer(1));
        myArrayList.add(new Integer(2));
        myArrayList.add(new Integer(3));
        myArrayList.add(new Integer(4));
        myArrayList.add(new Integer(7));
        myArrayList.add(new Integer(6));
        myArrayList.add(new Integer(5));

        System.out.println(myArrayList);

        Integer.getSize(myArrayList);
        Integer.get(myArrayList, 3);
        Integer.set(myArrayList, 1, 0);
        Integer.delete(myArrayList, 6);
        Integer.sort(myArrayList);
        Integer.toArray(myArrayList);
        Integer.equals(myArrayList, 0, 5);
        Integer.iterator(myArrayList);
    }

}
