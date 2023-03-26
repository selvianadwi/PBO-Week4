package week4;

import java.util.Scanner;

import java.util.Scanner;

public class Penjualan {
    String kode;
    String nama;
    float harga;
    int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus(){
        float total = getTotalPembelian();

        if (total >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (total >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (total >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    public void cetakNota() {
        float total = getTotalPembelian();
        String bonus = getBonus();

        System.out.println("Kode barang: " + kode);
        System.out.println("Nama barang: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total pembelian: " + total);

        if (!bonus.equals("-")) {
            System.out.println("Bonus: " + bonus);
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Penjualan penjualan = new Penjualan();
            String jawab;
            
            do {
                System.out.print("Masukkan kode barang: ");
                String kode = input.nextLine();
                
                System.out.print("Masukkan nama barang: ");
                String nama = input.nextLine();
                
                System.out.print("Masukkan harga barang: ");
                float harga = input.nextFloat();
                
                System.out.print("Masukkan jumlah barang: ");
                int jumlah = input.nextInt();
                input.nextLine(); // membaca karakter newline setelah jumlah
                
                penjualan.setData(kode, nama, harga, jumlah);
                penjualan.cetakNota();
                
                System.out.print("Input data lagi [Y/T]? ");
                jawab = input.nextLine();
            } while (jawab.equalsIgnoreCase("Y"));
        }
    }

}
