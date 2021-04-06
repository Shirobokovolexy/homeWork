public class Main {
    public static void main(String[] args) {
        MyArraysListInteger.list.add(0, 1);
        MyArraysListInteger.list.add(1, 2);
        MyArraysListInteger.list.add(2, 3);
        MyArraysListInteger.list.add(3, 4);
        MyArraysListInteger.list.add(4, 5);
        MyArraysListInteger.list.add(5, 6);
        MyArraysListInteger.list.add(6, 7);
        MyArraysListInteger.list.add(7, 8);
        MyArraysListInteger.list.add(8, 9);
        MyArraysListInteger.list.add(9, 0);

        System.out.println("Массив");

        System.out.println(MyArraysListInteger.list);

        MyArraysListInteger.getSize(MyArraysListInteger.list);

        MyArraysListInteger.get(MyArraysListInteger.list, 1);

        MyArraysListInteger.set(MyArraysListInteger.list, 0, 0);

        MyArraysListInteger.delete(MyArraysListInteger.list, 5);

        MyArraysListInteger.sort(MyArraysListInteger.list);

        MyArraysListInteger.toArray(MyArraysListInteger.list);

        MyArraysListInteger.equals(MyArraysListInteger.list, 0, 8);

        MyArraysListInteger.iterator(MyArraysListInteger.list, 2);

        System.out.println(MyArraysListInteger.list);
    }
}
