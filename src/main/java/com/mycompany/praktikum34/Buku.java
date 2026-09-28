package com.mycompany.praktikum34;
public class Buku {
    // 1. ENCAPSULATION & ACCESS MODIFIER: Mengubah hak akses field menjadi private
    // Data ini sekarang dibungkus rapat dan hanya bisa diakses dari dalam class Buku
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    // 2. STATIC: Variabel ini milik Class (milik bersama), bukan milik objek individual
    // Digunakan untuk menghitung total objek buku yang berhasil diciptakan
    public static int totalBukuBerhasilDibuat = 0;

    // 3. CONSTRUCTOR & KEYWORD 'THIS'
    public Buku(String judul, String pengarang, int tahunTerbit) {
        // 'this.judul' merujuk pada atribut class, sedangkan 'judul' merujuk pada parameter input
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        
        // Setiap kali objek baru diciptakan, variabel static ditambah 1
        totalBukuBerhasilDibuat++;
    }

    // 4. GETTER & SETTER: Sebagai "pintu masuk" resmi untuk membaca dan mengubah data
    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        // Contoh keuntungan enkapsulasi: Kita bisa memberi validasi di Setter
        if (tahunTerbit > 0) {
            this.tahunTerbit = tahunTerbit;
        } else {
            System.out.println("Tahun terbit tidak valid!");
        }
    }

    public void tampilkanInfoBuku() {
        // Menggunakan Getter/Field internal untuk menampilkan data
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n", 
                          this.judul, this.pengarang, this.tahunTerbit);
    }
}