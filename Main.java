/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author qomarul
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Hewan {
        String namaPemilik;
        String noHP;
        String namaHewan;
        String jenisHewan;
        int umurHewan;
        String keluhan;

        Hewan(String namaPemilik, String noHP, String namaHewan, String jenisHewan, int umurHewan, String keluhan) {
            this.namaPemilik = namaPemilik;
            this.noHP = noHP;
            this.namaHewan = namaHewan;
            this.jenisHewan = jenisHewan;
            this.umurHewan = umurHewan;
            this.keluhan = keluhan;
        }
    }

    public static void main(String[] args) {
        ArrayList<Hewan> daftarHewan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU KLINIK HEWAN PELIHARAAN ===");
            System.out.println("1. Tambah Data Hewan");
            System.out.println("2. Lihat Data Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pemilik : ");
                    String namaPemilik = input.nextLine();
                    System.out.print("No HP Pemilik: ");
                    String noHP = input.nextLine();
                    System.out.print("Nama Hewan   : ");
                    String namaHewan = input.nextLine();
                    System.out.print("Jenis Hewan  : ");
                    String jenisHewan = input.nextLine();
                    System.out.print("Umur Hewan   : ");
                    int umurHewan = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Keluhan      : ");
                    String keluhan = input.nextLine();

                    daftarHewan.add(new Hewan(namaPemilik, noHP, namaHewan, jenisHewan, umurHewan, keluhan));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== Daftar Data Hewan ===");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data.");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            Hewan h = daftarHewan.get(i);
                            System.out.println((i + 1) + ". Pemilik: " + h.namaPemilik +
                                    " (No HP: " + h.noHP + ")" +
                                    ", Hewan: " + h.namaHewan +
                                    ", Jenis: " + h.jenisHewan +
                                    ", Umur: " + h.umurHewan + " tahun" +
                                    ", Keluhan: " + h.keluhan);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Ubah Data Hewan ===");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data untuk diubah.");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            Hewan h = daftarHewan.get(i);
                            System.out.println((i + 1) + ". " + h.namaHewan + " (Pemilik: " + h.namaPemilik + ")");
                        }
                        System.out.print("Pilih nomor data yang akan diubah: ");
                        int idxUbah = input.nextInt();
                        input.nextLine();

                        if (idxUbah > 0 && idxUbah <= daftarHewan.size()) {
                            Hewan h = daftarHewan.get(idxUbah - 1);
                            System.out.print("Nama Pemilik baru (" + h.namaPemilik + "): ");
                            h.namaPemilik = input.nextLine();
                            System.out.print("No HP baru (" + h.noHP + "): ");
                            h.noHP = input.nextLine();
                            System.out.print("Nama Hewan baru (" + h.namaHewan + "): ");
                            h.namaHewan = input.nextLine();
                            System.out.print("Jenis Hewan baru (" + h.jenisHewan + "): ");
                            h.jenisHewan = input.nextLine();
                            System.out.print("Umur Hewan baru (" + h.umurHewan + "): ");
                            h.umurHewan = input.nextInt();
                            input.nextLine();
                            System.out.print("Keluhan baru (" + h.keluhan + "): ");
                            h.keluhan = input.nextLine();
                            System.out.println(" Data berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== Hapus Data Hewan ===");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data untuk dihapus.");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            Hewan h = daftarHewan.get(i);
                            System.out.println((i + 1) + ". " + h.namaHewan + " (Pemilik: " + h.namaPemilik + ")");
                        }
                        System.out.print("Pilih nomor data yang akan dihapus: ");
                        int idxHapus = input.nextInt();
                        input.nextLine();

                        if (idxHapus > 0 && idxHapus <= daftarHewan.size()) {
                            daftarHewan.remove(idxHapus - 1);
                            System.out.println(" Data berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 5:
                    System.out.println(" Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        input.close();
    }
}