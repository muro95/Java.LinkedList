public class MyLinkedListTest {
    public static void main(String[] args){
        MyLinkedList<Object> list = new MyLinkedList<>();
        list.addFirst("1");
        list.add(1,"9");
        list.addLast("2");
        list.addLast("3");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        System.out.println(list.size());
        System.out.println(list.remove(4));
        System.out.println(list.remove("3"));
        System.out.println(list.getFirst());
        list.print();
        System.out.println(list.getLast());
        System.out.println(list.get(2));
        System.out.println(list.contain("5"));
        System.out.println(list.indexOf("4"));
        System.out.println(list.add("3"));
        list.print();
        System.out.println(list.cloneLinked());
    }
}
