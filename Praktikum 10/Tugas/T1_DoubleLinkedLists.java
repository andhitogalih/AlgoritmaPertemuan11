package Tugas;

public class T1_DoubleLinkedLists {
    T1_Node front, rear;
    int size;

    public T1_DoubleLinkedLists(){
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void Enqueue(int nomor, String nama){
        T1_Node newNode = new T1_Node(null, nomor, nama, null);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void Dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else{
            System.out.println(front.nama + " telah selesai divaksinasi.");
            front = front.next;
            front.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(front.next == null){
            front = null;
            size--;
            return;
        }
        T1_Node current = front;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void print(){
        if(!isEmpty()){
            T1_Node tmp = front;
            System.out.println();
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|No.\t | Nama |");
            while(tmp != null){
                System.out.println("|"+tmp.nomor + "\t | " + tmp.nama + " |");
                tmp = tmp.next;
            }
            System.out.println("Size Antrian = " + size);
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
