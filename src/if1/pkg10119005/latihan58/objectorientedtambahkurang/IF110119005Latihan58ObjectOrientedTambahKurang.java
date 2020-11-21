/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan58.objectorientedtambahkurang;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan hasil penjumlahan dan dengan selisihnya
 *                     dengan berbasis objek
 */
public class IF110119005Latihan58ObjectOrientedTambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan penjumlahan;
        SelisihBilangan pengurangan;
        
        penjumlahan = new JumlahBilangan();
        penjumlahan.tampilHasilJumlah();
        
        pengurangan = new SelisihBilangan();
        pengurangan.tampilSelisih();
    }
    
}
