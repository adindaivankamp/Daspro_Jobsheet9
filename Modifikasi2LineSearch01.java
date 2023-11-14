import java.util.Scanner;
public class Modifikasi2LineSearch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scanner.nextInt();

        int[] arrayInt = new int[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = scanner.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = scanner.nextInt();

        int hasil = -1; 

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }

        scanner.close();
    }
}