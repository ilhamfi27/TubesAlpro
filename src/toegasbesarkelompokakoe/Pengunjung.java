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
public class Pengunjung {

    String atasNama, kodePengunjung;
    boolean statusMember;

    public Pengunjung(String atasNama, String kodePengunjung, boolean statusMember) {
        this.atasNama = atasNama;
        this.kodePengunjung = kodePengunjung;
        this.statusMember = statusMember;
    }

    public void setAtasNama(String atasNama) {
        this.atasNama = atasNama;
    }

    public void setKodePengunjung(String kodePengunjung) {
        this.kodePengunjung = kodePengunjung;
    }

    public void setStatusMember(boolean statusMember) {
        this.statusMember = statusMember;
    }

    public String getAtasNama() {
        return atasNama;
    }

    public String getKodePengunjung() {
        return kodePengunjung;
    }

    public boolean getStatusMember() {
        return statusMember;
    }
}
