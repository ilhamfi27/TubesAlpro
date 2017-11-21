package toegasbesarkelompokakoe;

public class Film {
    String kodeFilm, judul, jamTayang, jamSelesai, kadaluarsa;
    
    public Film(String kodeFilm, String judul, String jamTayang, String jamSelesai, String kadaluarsa){
        this.kodeFilm = kodeFilm ;
        this.judul = judul;
        this.jamTayang = jamTayang;
        this.jamSelesai = jamSelesai;
        this.kadaluarsa = kadaluarsa;
    }
    
    public void setKodeFilm(String kdFilm) {
        this.kodeFilm = kodeFilm;
    }

    public void setJudulFilm(String judulfilm) {
        this.judul = judul;
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

    public void setJamSelesai(String jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public void setKadaluarsa(String kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }

    public String getKodeFilm() {
        return kodeFilm;
    }

    public String getJudulFilm() {
        return judul;
    }

    public String getJamTayang() {
        return jamTayang;
    }
    
    public String getJamSelesai(){
        return jamSelesai;
    }

    public String getKadaluarsa() {
        return kadaluarsa;
    }
}
