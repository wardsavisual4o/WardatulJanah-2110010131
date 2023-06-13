/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tourdantravel;


/**
 *
 * @author ACER
 */
public class Pengunjung {
    private String nama, alamat, telp, booking_paket,pembayaran;
    
    public Pengunjung (){}
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return this.nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat (){
        return this.alamat;
    }
    
    public void setTelp(String telp){
        this.telp = telp;
    }
    
    public String getTelp (){
        return this.telp;
    }
    
    public void setBooking_paket(String booking_paket){
        this.booking_paket = booking_paket;
    }
    
    public String getBooking_paket (){
        return this.booking_paket;
    }
    
    public void setPembayaran(String pembayaran){
        this.pembayaran = pembayaran;
    }
    
    public String getPembayaran (){
        return this.pembayaran;
    }
    
    
}
