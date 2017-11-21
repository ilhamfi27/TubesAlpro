/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toegasbesarkelompokakoe;

/**
 *
 * @author ilhamfi
 */
public class MakananMinuman {

    String nama, kategori, kode;
    Double harga;
    int stock;

    public MakananMinuman(String nama, String kategori, String kode, Double harga, int stock) {
        this.nama = nama;
        this.kategori = kategori;
        this.kode = kode;
        this.harga = harga;
        this.stock = stock;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public String getKode() {
        return kode;
    }

    public Double getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }
}
