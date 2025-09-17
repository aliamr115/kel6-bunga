 package kelompok6.bunga;

public class ramaAnggrek {
    // Deklarasi variabel
    String nama, warna, jenis, harga;
    
    // Method Setter
    public void setnama(String namax){
        this.nama = namax;
    }
    
    public void setwarna(String warnax){
        this.warna = warnax;
    }
    
    public void setjenis(String jenisx){
        this.jenis = jenisx;
    }
    
    public void setharga(String hargax){
        this.harga = hargax;
    }   
    
    // Method Getter
    public String getnama(){
        return this.nama;
    }
    
    public String getwarna(){
        return this.warna;
    }
    
    public String getjenis(){
        return this.jenis;
    }
    
    public String getharga(){
        return this.harga;
    }
}