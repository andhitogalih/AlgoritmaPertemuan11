package Tugas;

import java.util.Scanner;
public class T1_DLLMain {
    public static void menu(){
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int menu = 0;
        T1_DoubleLinkedLists dll = new T1_DoubleLinkedLists();

        do{
            System.out.println();
            menu();
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    int noAntrian = sc.nextInt();
                    System.out.println("Nama Penerima: ");
                    String namaPenerima = input.nextLine();
                    dll.Enqueue(noAntrian, namaPenerima);
                    break;
                case 2:
                    dll.Dequeue();
                    dll.print();
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    System.out.println("TERIMA KASIH...");
                    System.exit(0);
            }
        }while(menu > 0 && menu < 5);
    }
}
