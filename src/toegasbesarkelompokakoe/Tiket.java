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
public class Tiket {

    String kodeTiket, kodeFilm, posisiDuduk, kodePengunjung;

    public Tiket(String kodeTiket, String kodeFilm, String posisiDuduk, String kodePengunjung) {
        this.kodeTiket = kodeTiket;
        this.kodeFilm = kodeFilm;
        this.posisiDuduk = posisiDuduk;
        this.kodePengunjung = kodePengunjung;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    public void setKodeFilm(String kodeFilm) {
        this.kodeFilm = kodeFilm;
    }

    public void setPosisiDuduk(String posisiDuduk) {
        this.posisiDuduk = posisiDuduk;
    }

    public void setKodePengunjung(String kodePengunjung) {
        this.kodePengunjung = kodePengunjung;
    }
}
