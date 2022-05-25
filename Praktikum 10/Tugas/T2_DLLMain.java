package Tugas;

import java.util.Scanner;
public class T2_DLLMain {
    public static void menu(){
        System.out.println("==============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("==============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("==============================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int menu, index;
        String id, judul, cari;
        double rating;
        T2_DoubleLinkedLists dll = new T2_DoubleLinkedLists();

     
            do{
                menu();
                menu = sc.nextInt();

                try {
                    switch (menu) {
                        case 1:
                            System.out.println("Masukkan Data Film Posisi Awal");
                            System.out.println("ID Film: ");
                            id = input.nextLine();
                            System.out.println("Judul Film: ");
                            judul = input.nextLine();
                            System.out.println("Rating Film: ");
                            rating = sc.nextDouble();
                            dll.addFirst(id, judul, rating);
                            break;
                        case 2:
                            System.out.println("Masukkan Data Film Posisi Akhir");
                            System.out.println("ID Film: ");
                            id = input.nextLine();
                            System.out.println("Judul Film: ");
                            judul = input.nextLine();
                            System.out.println("Rating Film: ");
                            rating = sc.nextDouble();
                            dll.addLast(id, judul, rating);
                            break;
                        case 3:
                            System.out.println("Masukkan Data Film Urutan ke-");
                            System.out.println("ID Film: ");
                            id = input.nextLine();
                            System.out.println("Judul Film: ");
                            judul = input.nextLine();
                            System.out.println("Rating Film: ");
                            rating = sc.nextDouble();
                            System.out.println("Data Film ini akan masuk di urutan ke-");
                            index = sc.nextInt();
                            dll.add(id, judul, rating, index);
                            break;
                        case 4:
                            dll.removeFirst();
                            System.out.println("Penghapusan Data Awal berhasil");
                            break;
                        case 5:
                            dll.removeLast();
                            System.out.println("Penghapusan Data Akhir berhasil");
                            break;
                            case 6:
                            System.out.println("Masukkan posisi index yang ingin dihapus: ");
                            index = sc.nextInt();
                            dll.remove(index);
                            System.out.println("Penghapusan Data Pada Indeks ke-"+ index +" berhasil");
                            break;
                        case 7:
                            System.out.println("Cetak Data");
                            dll.print();
                            System.out.println("Size : " + dll.size());
                            break;
                        case 8:
                            System.out.println("Cari Data");
                            System.out.println("Masukkan Id Film yang dicari");
                            cari = in.nextLine();
                            dll.search(cari);
                            break;
                        case 9:
                            System.out.println("Pengurutan Data Rating FIlm-DESC");
                            dll.BubbleSort();
                            dll.print();
                            break;
                        case 10:
                            System.out.println("TERIMA KASIH.....");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Inputan yang Anda masukkan salah");
                            break;
                        }
                } catch (Exception e){
                }
            }while (menu > 0 && menu < 11);
        }
}
