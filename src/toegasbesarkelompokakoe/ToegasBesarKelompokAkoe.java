package toegasbesarkelompokakoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ToegasBesarKelompokAkoe {

    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    ControllerFilm cf = new ControllerFilm();
    ControllerMakananMinuman cmm = new ControllerMakananMinuman();

    void inputanSalah() {
        System.out.println("Inputan Anda Salah");
    }

    // Menu Input Update Delete Data Makanan Minuman
    void menuDataMakananMinuman() {
        String pilihan = "";
        while (true) {
            System.out.println("1. Input Data MakananMinuman");
            System.out.println("2. View seluruh data MakananMinuman");
            System.out.println("3. Update data makanan dan minuman");
            System.out.println("4. Exit");

            try {
                pilihan = inp.readLine();

                switch (pilihan) {
                    case "1":
                        cmm.inputData();
                        break;
                    case "2":
                        cmm.viewData();
                        break;
                    case "3":
                        cmm.updateData();
                        break;
                    case "4":
                        menuManipulasiData();
                        break;
                    default:
                        inputanSalah();
                        break;
                }
            } catch (Exception e) {

            }
        }
    }

    // Menu Input Update Delete Data Film
    void menuDataFilm() {
        String ulang = "";
        do {
            System.out.println("Daftar Film :");
            System.out.println("1. Input Data Film");
            System.out.println("2. View Data Film");
            System.out.println("3. Exit");
            System.out.println("===========================");
            System.out.print("Pilihan anda : ");
            String fik = "";
            try {
                fik = inp.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ControllerFilm.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (fik) {
                case "1":
                    cf.inputData();
                    break;
                case "2":
                    cf.viewData();
                    break;
                case "3":
                    menu();
                    break;
                default:
                    inputanSalah();
                    break;
            }
        } while (true);
    }

    // Menu Pilihan Manipulasi Data
    void menuManipulasiData() {
        String pilihan = "";
        System.out.println("Menu Data");
        System.out.println("1. Data Film");
        System.out.println("2. Data Makanan Minuman");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        try {
            pilihan = inp.readLine();
        } catch (Exception e) {

        }
        switch (pilihan) {
            case "1":
                menuDataFilm();
                break;
            case "2":
                menuDataMakananMinuman();
                break;
            case "0":
                menu();
                break;
            default:
                inputanSalah();
                break;
        }
    }

    // Form beli tiket
    void beliTiket() {
        System.out.println("Pembelian Tiket");
        cf.dataFilm();
        try{
            System.out.print("Nama:\t");
        }catch(Exception e){
            
        }
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
                beliTiket();
                break;
            case "2":
                menuManipulasiData();
                break;
            case "0":
                if (konfirmasiAksi()) {
                    System.exit(1);
                } else {
                    menu();
                }
                break;
            default:
                inputanSalah();
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

    void execute() {
        cf.dummyData();
        do {
            menu();
        } while (true);
    }

    public static void main(String[] args) {
        ToegasBesarKelompokAkoe tb = new ToegasBesarKelompokAkoe();
        tb.execute();
    }

}
