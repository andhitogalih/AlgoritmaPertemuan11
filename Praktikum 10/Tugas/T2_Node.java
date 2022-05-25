package Tugas;

public class T2_Node {
    String id, judul;
    double rating;
    int data;
    T2_Node prev, next;

    public T2_Node(T2_Node prev, String id, String judul, double rating, T2_Node next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
