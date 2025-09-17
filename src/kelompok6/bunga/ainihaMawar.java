/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author user
 */
public class ainihaMawar {
    String nama, jenis, warna, harga;
    
    //setter
    public void setnama_bunga(String nama_bunga) {
        this.nama = nama_bunga;
    }
    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
    public void setwarna(String warna) {
        this.warna = warna;
    }
    public void setharga(String harga) {
        this.harga = harga;
    }
    
    //getter
    public String getnama_bunga(){
        return this.nama;
    }
    public String getjenis(){
        return this.jenis;
    }
    public String getwarna(){
        return this.warna;
    }
    public String getharga(){
        return this.harga;
    }
    
}
