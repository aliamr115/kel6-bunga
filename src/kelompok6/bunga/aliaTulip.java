/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author user
 */
public class aliaTulip {
    String nama, warna, jenis, harga;
    
    //Method Setter
    public void setnama(String nama) {
        this.nama = nama;
    }
    public void setwarna(String warna) {
        this.warna = warna;
    }
    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
    public void setharga(String harga) {
        this.harga = harga;
    }
    
    //Method Getter
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
