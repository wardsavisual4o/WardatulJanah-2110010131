/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class datasetPengunjung {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> telp;
    private ArrayList<String> booking_paket;
    private ArrayList<String> pembayaran;
   
    public datasetPengunjung(){
        nama = new ArrayList<>();
        alamat = new ArrayList<>();
        telp = new ArrayList<>();
        booking_paket = new ArrayList<>();
        pembayaran = new ArrayList<>();
    
        
    }
    
     public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
     public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
     public void addTelp(String value){
        this.telp.add(value);
    }
    
    public ArrayList<String> getDataTelp(){
        return this.telp;
    }
    
     public void addBooking_paket(String value){
        this.booking_paket.add(value);
    }
    
    public ArrayList<String> getDataBooking_paket(){
        return this.booking_paket;
    }
    
     public void addPembayaran(String value){
        this.pembayaran.add(value);
    }
    
    public ArrayList<String> getDataPembayaran(){
        return this.pembayaran;
    }
    
    public void Pengunjung(String nama, String alamat, String telp,
            String booking_paket, String pembayaran){
        addNama(nama);
        addAlamat(alamat);
        addTelp(telp);
        addBooking_paket(booking_paket);
        addPembayaran(pembayaran);
        
    }
    
}
