 package kelompok6.bunga;

public class ramaAnggrek extends BungaBunga {
    
    // Deklarasi variabel
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
    
    public void TampilData() {
        System.out.println("=====================================");
        System.out.println("\t\tBunga Anggrek\t\t");
        System.out.println("=====================================");
        super.TampilData();
        System.out.println("Negara Asal       : " + this.NegaraAsal);
        System.out.println("Jenis             : " + this.NegaraAsal);
        System.out.println("Pajak             : " + this.NegaraAsal);
    } 
}