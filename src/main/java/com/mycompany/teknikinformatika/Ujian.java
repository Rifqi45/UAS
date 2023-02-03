
package com.mycompany.teknikinformatika;

public class Ujian {
    String nim;
    String nama;
    String nid;
    int idUjian;
    int nilai;

    public Ujian(String nim, String nama, String nid, int idUjian, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nid = nid;
        this.idUjian = idUjian;
        this.nilai = nilai;
    }

    public Ujian() {
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNid() {
        return nid;
    }

    public int getIdUjian() {
        return idUjian;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void setIdUjian(int idUjian) {
        this.idUjian = idUjian;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    
}
