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

    public static void main(String args[]) {
        ControllerFilm idf = new ControllerFilm();
        idf.execute();
    }

    void execute() {
        do {
            System.out.println("Daftar Film :");
            System.out.println("1. Input Data Film");
            System.out.println("2. View Data Film");
            System.out.println("3. Exit");
            System.out.println("===========================");
            System.out.print("Masukkan Angka 1 - 3 : ");
            String fik = "";
            try {
                fik = input.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ControllerFilm.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (fik) {
                case "1":
                    inputData();
                    break;
                case "2":
                    viewData();
                    break;
                case "3":
                    System.out.println("Program Selesai!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukkan Angka 1 - 3");
                    break;
            }
            System.out.println("\nApakan Anda Ingin Kembali Ke Main Menu? : ");
            try {
                ulang = input.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ControllerFilm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while ("ya".equals(ulang) || "y".equals(ulang));
    }

    void viewData() {
        if (arrayListFilm.isEmpty()) {
            System.out.println("Data Film Kosong!");
        } else {
            System.out.println("Data Film");
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
    
    void updateData(){
        
    }
}