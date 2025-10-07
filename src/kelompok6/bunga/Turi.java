/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author USER
 */
public class Turi extends BungaBunga{
    String NegaraAsal, Jenis;
    int Pajak;
    boolean Beracun;

    public String getNegaraAsal() {
        return NegaraAsal;
    }

    public void setNegaraAsal(String NegaraAsal) {
        this.NegaraAsal = NegaraAsal;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenins(String Jenis) {
        this.Jenis = Jenis;
    }

    public int getPajak() {
        return Pajak;
    }

    public void setPajak(int Pajak) {
        this.Pajak = Pajak;
    }


    public boolean isBeracun() {
        return Beracun;
    }

    public void setBeracun(boolean Beracun) {
        this.Beracun = Beracun;
    }
        
        
        
    @Override
        public void TampilData(){
        super.TampilData();
        System.out.println("Negara Asal :  " + NegaraAsal);
        System.out.println("Jenis :  " + Jenis);
        System.out.println("Pajak :  " + Pajak); 
        System.out.println("Beracun :  " + Beracun);
        
    }
    }    

