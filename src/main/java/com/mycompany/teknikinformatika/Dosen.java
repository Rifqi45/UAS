
package com.mycompany.teknikinformatika;

public class Dosen {
    String nid;
    String nama;

    public Dosen() {
    }
    
    public Dosen(String nid, String nama) {
        this.nid = nid;
        this.nama = nama;
    }   
    
     public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
