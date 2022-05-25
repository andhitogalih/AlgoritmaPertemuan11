package Praktikum3;

public class P3_DLLMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("Data awal pada Linked List adalah : " + dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List adalah : " + dll.get(1));
    }
}
