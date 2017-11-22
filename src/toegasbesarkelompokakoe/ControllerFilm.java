package toegasbesarkelompokakoe;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

class ControllerFilm {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Film> arrayListFilm = new ArrayList<>();
    String ulang;

    int getIndex(String value) {
        int indexFilm = -1;
        for (int a = 0; a < arrayListFilm.size(); a++) {
            if (arrayListFilm.get(a).getKodeFilm().contains(value)) {
                indexFilm = a;
                break;
            } else {
                indexFilm = -1;
            }
        }
        return indexFilm;
    }
    
    void dummyData(){
        arrayListFilm.add(new Film("F001", "Sepatu yang Tertukar", "07:30", "12;30", "10 Agustus 2020"));
        arrayListFilm.add(new Film("F001", "Telenovela", "08:30", "11:30", "9 Agustus 2020"));
    }

    void viewData() {
        if (arrayListFilm.isEmpty()) {
            System.out.println("Data Film Kosong!");
        } else {
            for (int a = 0; a < arrayListFilm.size(); a++) {
                String kodeFilm = arrayListFilm.get(a).getKodeFilm();
                String judulFilm = arrayListFilm.get(a).getJudulFilm();
                String jamTayang = arrayListFilm.get(a).getJamTayang();
                String kadaluarsa = arrayListFilm.get(a).getKadaluarsa();
                System.out.println((a + 1) + ".\tKode Film\t\t: " + kodeFilm);
                System.out.println("\tJudul Film\t\t: " + judulFilm);
                System.out.println("\tJam Tayang\t\t: " + jamTayang);
                System.out.println("\tKadaluarsa\t\t: " + kadaluarsa);
                System.out.println("");
            }
        }
    }

    void inputData() {
        try {
            System.out.println("Masukkan Data Film");
            System.out.print("Kode Film\t\t: ");
            String kodeFilm = input.readLine();
            System.out.print("Judul Film\t\t: ");
            String judulFilm = input.readLine();
            System.out.print("Jam Tayang\t\t: ");
            String jamTayang = input.readLine();
            System.out.print("Jam Selesai\t\t: ");
            String jamSelesai = input.readLine();
            System.out.print("Kadaluarsa\t\t: ");
            String kadaluarsa = input.readLine();

            Film hehe = new Film(kodeFilm, judulFilm, jamTayang, jamSelesai, kadaluarsa);
            arrayListFilm.add(hehe);
        } catch (IOException ex) {
            Logger.getLogger(ControllerFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void dataFilm() {
        if (arrayListFilm.isEmpty()) {
            System.out.println("Data Film Kosong!");
        } else {
            String tbl = "| %-2d | %-58s | %-10s | %-11s |%n";
            System.out.format("+--------------------------------------------------------------------------------------------+%n");
            System.out.format("|%52s%40s|%n", "DAFTAR FILM", "");
            System.out.format("+----+------------------------------------------------------------+------------+-------------+%n");
            System.out.format("| No |                            Judul                           | Jam Tayang | Jam Selesai |%n");
            System.out.format("+----+------------------------------------------------------------+------------+-------------+%n");
            for (int a = 0; a < arrayListFilm.size(); a++) {
                String kodeFilm = arrayListFilm.get(a).getKodeFilm();
                String judulFilm = arrayListFilm.get(a).getJudulFilm();
                String jamTayang = arrayListFilm.get(a).getJamTayang();
                String jamSelesai = arrayListFilm.get(a).getJamSelesai();
                System.out.format(tbl, (a + 1), judulFilm, jamTayang, jamSelesai);
            }
            System.out.format("+----+------------------------------------------------------------+------------+-------------+%n");
        }
    }
}
