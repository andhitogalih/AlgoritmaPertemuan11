package Tugas;

public class T1_Node {
    String nik, nama;
    int nomor;
    T1_Node prev, next;

    T1_Node(T1_Node prev, int nomor, String nama, T1_Node next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
