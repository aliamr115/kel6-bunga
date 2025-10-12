 package kelompok6.bunga;

public class ramaAnggrek extends BungaBunga {
    
    // Deklarasi variabel
    String Nama, NegaraAsal, Jenis, Harga;

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
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
        System.out.println("==============================================================");
        System.out.println("\t\t\t  Bunga Anggrek\t\t\t\t");
        System.out.println("==============================================================");
        System.out.println("Nama Bunga     :  " + this.Nama);
        System.out.println("Negara Asal    :  " + this.NegaraAsal);
        System.out.println("Jenis          :  " + this.Jenis);
        System.out.println("Pajak          :  " + this.Pajak);
        System.out.println("Harga          :  "+this.Harga);
        super.TampilData();
        System.out.println("==============================================================");
        
           } 
}