/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author user
 */
public class ainihaMawar extends BungaBunga{
    
    String NegaraAsal, Jenis;
    int Pajak;

    public String getNegaraAsal() {
        return NegaraAsal;
    }

    public void setNegaraAsal(String NegaraAsal) {
        this.NegaraAsal = NegaraAsal;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public int getPajak() {
        return Pajak;
    }

    public void setPajak(int Pajak) {
        this.Pajak = Pajak;
    }
    
    @Override
    public void TampilData() {
        System.out.println("==================================================");
        System.out.println("\t\tBUNGA MAWAR\t\t");
        System.out.println("==================================================");
        super.TampilData();
        System.out.println("Negara Asal     :  "+this.NegaraAsal);
        System.out.println("jenis           :  "+this.Jenis);
        System.out.println("Pajak           :  "+this.Pajak);
    }
    
    
}
