package toegasbesarkelompokakoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToegasBesarKelompokAkoe {

    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

    void execute() {
        do {
            menu();
        } while (true);
    }

    void menu() {
        String pilihan = "";
        System.out.println("Menu Aplikasi");
        System.out.println("1. Tiket");
        System.out.println("2. Input Data");
        System.out.println("0. Keluar");
        System.out.print("Pilihan : ");
        try {
            pilihan = inp.readLine();
        } catch (Exception e) {

        }
        switch (pilihan) {
            case "1":
                System.out.print("Menu 1");
                break;
            case "2":
                System.out.print("Menu 2");
                break;
            case "0":
                if (konfirmasiAksi()) {
                    System.exit(1);
                } else {
                    menu();
                }
                break;
        }
    }

    boolean konfirmasiAksi() {
        System.out.println("Apakah anda yakin ? (y/n)");
        String pilihan = "";

        try {
            pilihan = inp.readLine();
        } catch (Exception e) {

        }

        if (pilihan.equals("y") || pilihan.equals("Y")) {
            return true;
        } else if (pilihan.equals("n") || pilihan.equals("N")) {
            return false;
        } else {
            System.out.println("Peringatan! Pilihlah Y atau N!");
            konfirmasiAksi();
            return false;
        }
    }

    public static void main(String[] args) {
        ToegasBesarKelompokAkoe tb = new ToegasBesarKelompokAkoe();
        tb.execute();
    }

}
