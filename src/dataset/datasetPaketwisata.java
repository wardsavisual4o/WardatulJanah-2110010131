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
public class datasetPaketwisata {
     private ArrayList<String> no_pkt;
    private ArrayList<String> kota_wisata;
    private ArrayList<String> harga;
    private ArrayList<String> pelayanan;
    private ArrayList<String> status;
    private ArrayList<String> fasilitas;
    private ArrayList<String> book_pkt;
   
     public datasetPaketwisata(){
        no_pkt = new ArrayList<>();
        kota_wisata = new ArrayList<>();
        status = new ArrayList<>();
        harga = new ArrayList<>();
        pelayanan = new ArrayList<>();
        fasilitas = new ArrayList<>();
        book_pkt = new ArrayList<>();
        
    }
     
     public void addNo_pkt(String value){
        this.no_pkt.add(value);
    }
    
    public ArrayList<String> getDataNo_pkt(){
        return this.no_pkt;
    }
    
     
     public void addKota_wisata(String value){
        this.kota_wisata.add(value);
    }
    
    public ArrayList<String> getDataKota_wisata(){
        return this.kota_wisata;
    }
    
     public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
    
     public void addPelayanan(String value){
        this.pelayanan.add(value);
    }
    
    public ArrayList<String> getDataPelayanan(){
        return this.pelayanan;
    }
    
     public void addFasilitas(String value){
        this.fasilitas.add(value);
    }
    
    public ArrayList<String> getDataFasilitas(){
        return this.fasilitas;
    }
    
    public void addBook_pkt(String value){
        this.book_pkt.add(value);
    }
    
    public ArrayList<String> getDataBook_pkt(){
        return this.book_pkt;
    }
    
     public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    
    public void Paketwisata(String no_pkt, String kota_wisata, String harga,
            String pelayanan, String status, String fasilitas, String book_pkt){
        addNo_pkt(no_pkt);
        addKota_wisata(kota_wisata);
        addHarga(harga);
        addPelayanan(pelayanan);
        addStatus(status);
        addFasilitas(fasilitas);
        addBook_pkt(book_pkt);
        
    }
}
