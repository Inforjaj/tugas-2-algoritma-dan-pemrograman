import java.util.Scanner;

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persenLembur = 0;
        double gajiLembur, totalPenghasilan;

        // Meminta input dari pengguna
        System.out.println("=== PROGRAM HITUNG GAJI KARYAWAN ===");
        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.nextLine();
        
        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jamLembur = input.nextInt();

        // Logika IF untuk menentukan Gaji Pokok berdasarkan Golongan
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Maaf, Golongan yang dimasukkan tidak terdaftar.");
            System.exit(0); // Menghentikan program jika golongan salah
        }

        // Logika IF untuk menentukan Persentase Lembur
        if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        } else {
            persenLembur = 0.0; // Jika tidak lembur atau jam minus
        }

        // Proses perhitungan matematika
        gajiLembur = gajiPokok * persenLembur;
        totalPenghasilan = gajiPokok + gajiLembur;

        // Output ke layar
        System.out.println("\n--- RINCIAN PENGHASILAN ---");
        System.out.println("Gaji Pokok     : Rp. " + String.format("%,.0f", gajiPokok));
        System.out.println("Gaji Lembur    : Rp. " + String.format("%,.0f", gajiLembur));
        System.out.println("Total Penghasilan: Rp. " + String.format("%,.0f", totalPenghasilan));
        
        input.close();
    }
}