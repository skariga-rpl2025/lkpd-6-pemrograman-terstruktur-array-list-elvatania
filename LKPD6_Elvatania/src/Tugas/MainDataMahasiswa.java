/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * 
 */
public class MainDataMahasiswa {
    public static void main (String[] args) {
        
        DataMahasiswa dataM = new DataMahasiswa();
        dataM.tambahMahasiswa ("2310001", "Andi Pratama", "Jl.Melati No.12, Bandung");
        dataM.tambahMahasiswa("2310002", "Siti Aulia", "Jl.Kenanga No.5, Cimahi");
        dataM.tambahMahasiswa("2310004", "Putri Ningsih", "Jl. Anggrek No.7, Lembang");
        dataM.tambahMahasiswa("2310010", "Eka Lestari", "Jl. Pasteur N0.123, Bandung");
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
        dataM.tambahMahasiswa("2310008", "Nur Zahra", "Jl. Soekarno-Hatta N0.55, Kediri");
        // Cari buku
        String cari = "2310004";
        System.out.println("Cari Mahasiswa dengan npm: " + cari);
        Mahasiswa mahas = dataM.cariMahasiswa(cari);
        if (mahas == null){
            System.out.println("mahasiswa tidak ditemukan");
        } else{
            System.out.println(" mahasiswa ditemukan dengan npm: " + mahas.getNpm() + 
                    ", nama: " + mahas.getNama() + ", alamat: " + mahas.getAlamat());
        }
        
        //ganti buku
        dataM.gantiMahasiswa(0,"12345", "elvatania", "junrejo");
        mahas = dataM.LihatMahasiswa(0);
        System.out.println("mahasiswa diganti dengan npm: " + mahas.getNpm()+ 
                ", nama: " + mahas.getNama() + ", alamat:" + mahas.getAlamat());
        
        // hapus buku 
        dataM.hapusMahasiswa(0);
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
    }
}
