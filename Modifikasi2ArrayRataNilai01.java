import java.util.Scanner;
public class Modifikasi2ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            double rataLulus = totalLulus / jumlahLulus;
            System.out.println("Rata - rata nilai lulus = " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata - rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
    }
}