/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toegasbesarkelompokakoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ilhamfi
 */
class ControllerMakananMinuman {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<MakananMinuman> arrMkMi = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ControllerMakananMinuman cm = new ControllerMakananMinuman();
        cm.runThis();
    }

    void runThis() {
        String pilihan = "";
        while (true) {
            System.out.println("1. Input Data MakananMinuman");
            System.out.println("2. View seluruh data MakananMinuman");
            System.out.println("3. Update data makanan dan minuman");
            System.out.println("4. Exit");

            try {
                pilihan = input.readLine();

                switch (pilihan) {
                    case "1":
                        inputData();
                        break;
                    case "2":
                        viewData();
                        break;
                    case "3":
                        updateData();
                        break;
                    case "4":
                        System.exit(1);
                        System.out.print("Terimakasih sudah memesan menu makanan kami");
                        break;
                    default:
                        System.out.println("Tidak ada pilihan");
                        break;

                }

            } catch (Exception e) {

            }

        }

    }

    void updateData() throws IOException {
        System.out.println("input data ke berapa mau di update");
        //String indeks = input.readLine();
        int indeks = Integer.parseInt(input.readLine());
        System.out.println("Nama terbaru");
        String nama = input.readLine();
        arrMkMi.get(indeks).setNama(nama);
        System.out.println("Kategori terbaru");
        String kategori = input.readLine();
        arrMkMi.get(indeks).setKategori(kategori);
        System.out.println("harga terbaru");
        Double harga = Double.parseDouble(input.readLine());
        arrMkMi.get(indeks).setHarga(harga);
        System.out.println("stock terbaru");
        int stock = Integer.parseInt(input.readLine());
        arrMkMi.get(indeks).setStock(stock);

    }

    void viewData() {
        if (arrMkMi.isEmpty()) {
            System.out.println(" Data MakananMinuman masih kosong");
        } else {
            System.out.println("Data MakananMinuman");
            for (int a = 0; a < arrMkMi.size(); a++) {
                String nama = arrMkMi.get(a).getNama();
                String kategori = arrMkMi.get(a).getKategori();
                String kode = arrMkMi.get(a).getKode();
                Double harga = arrMkMi.get(a).getHarga();
                int stock = arrMkMi.get(a).getStock();
                System.out.println((a + 1) + ".\tnama : " + nama);
                System.out.println("\t\tkategori : " + kategori);
                System.out.println("\t\tkode : " + kode);
                System.out.println("\t\tharga : " + harga);
                System.out.println("\t\tstock : " + stock);

            }
        }
    }

    void inputData() {
        try {
            System.out.println("Masukkan Data Makanan Minuman");
            System.out.print("nama  : ");
            String nama = input.readLine();
            System.out.print("kategori  : ");
            String kategori = input.readLine();
            System.out.print("kode  : ");
            String kode = input.readLine();
            System.out.print("harga  : ");
            Double harga = Double.parseDouble(input.readLine());
            System.out.print("stock  : ");
            int stock = Integer.parseInt(input.readLine());
            arrMkMi.add(new MakananMinuman(nama, kategori, kode, harga, stock));
        } catch (Exception e) {
        }
    }
}
