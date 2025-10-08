/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author akuni
 */
public class talithaTeratai2 extends BungaBunga{
    String NegaraAsal, Jenis;
    int Pajak;
    boolean Beracun;

    public String getNegaraAsal() {
        return NegaraAsal;
    }

    public void setNegaraAsal(String NegaraAsal) {
        this.NegaraAsal = NegaraAsal;
    }

    public boolean isBeracun() {
        return Beracun;
    }

    public void setBeracun(boolean Beracun) {
        this.Beracun = Beracun;
    }

    public int getPajak() {
        return Pajak;
    }

    public void setPajak(int Pajak) {
        this.Pajak = Pajak;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getCiri_ciri() {
        return ciri_ciri;
    }

    public void setCiri_ciri(String ciri_ciri) {
        this.ciri_ciri = ciri_ciri;
    }

    public String getKelopak() {
        return kelopak;
    }

    public void setKelopak(String kelopak) {
        this.kelopak = kelopak;
    }

    public String getJenis() {
        return Jenis;
    }
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    
    @Override
    public void TampilData(){
        System.out.println("===========================");
        System.out.println("\t\t Bunga Teratai\t\t");
        System.out.println("===========================");
        super.TampilData();
        System.out.println("Negara Asal : " +this.NegaraAsal);
        System.out.println("Jenis       : " +this.Jenis);
        System.out.println("Pajak       : " +this.Pajak);
    }
}
