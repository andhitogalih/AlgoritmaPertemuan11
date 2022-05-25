package Tugas;

public class T2_DoubleLinkedLists {
    T2_Node head;
    int size;

    public T2_DoubleLinkedLists(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(String id, String judul, double rating){
        if(isEmpty()){
            head = new T2_Node(null, id, judul, rating, null);
        }else{
            T2_Node newNode = new T2_Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String id, String judul, double rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else{
            T2_Node current = head;
            while (current.next != null){
                current = current.next;
            }
            T2_Node newNode = new T2_Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String id, String judul,  double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            T2_Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                T2_Node newNode = new T2_Node(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                T2_Node newNode = new T2_Node(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            T2_Node tmp = head;
            while (tmp != null){
                System.out.println("ID: " + tmp.id);
                System.out.println("Judul Film: " + tmp.judul);
                System.out.println("Rating Film: " + tmp.rating);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }


    public void removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if (head.next == null){
            head = null;
            size--;
            return;
        }
        T2_Node current = head;
        while (current.next.next != null){
                current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()){
            throw new Exception("Nilai index di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            T2_Node current = head;
            int i=0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public String getFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        return (head.id + head.judul + head.rating);
    }
    
    public String getLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        T2_Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return (tmp.id + tmp.judul + tmp.rating);
    }
    
    public String get(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }
        T2_Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return (tmp.id + tmp.judul + tmp.rating);
    }

    public void search(String id) {
        int i = 0;
        boolean cek = false;
        T2_Node current = head;
        if (head == null){
            System.out.println("List Kosong");
            return;
        }
        while (current != null){
            if(current.id.equalsIgnoreCase(id)){
                cek = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (cek){
            System.out.println("Data ID Film: " + id + " berada di node ke-" + (i+1));
            System.out.println("IDENTITAS:");
            System.out.println(" ID Film: " + current.id);
            System.out.println(" Judul FIlm: " + current.judul);
            System.out.println(" IMDB Rating: " + current.rating);
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }

    public void BubbleSort() {
        T2_Node current = null, index = null;
        String tmp;
        double temp;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        temp = current.rating;
                        current.rating = index.rating;
                        index.rating = temp;
                        tmp = current.judul;
                        current.judul = index.judul;
                        index.judul = tmp;
                    }
                }
            }
        }
    }
}
