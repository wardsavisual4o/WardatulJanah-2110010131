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
public class datasetDaftarpemesanan {
     private ArrayList<String> nama;
    private ArrayList<String> id_book;
    private ArrayList<String> telp;
    private ArrayList<String> kota_wisata;
    private ArrayList<String> harga;
    private ArrayList<String> tgl_keb;
    private ArrayList<String> konfirmasi;
    
    public datasetDaftarpemesanan(){
        nama = new ArrayList<>();
        id_book = new ArrayList<>();
        telp = new ArrayList<>();
        kota_wisata = new ArrayList<>();
        harga = new ArrayList<>();
        tgl_keb = new ArrayList<>();
        konfirmasi = new ArrayList<>();
        
    }
    
     public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
     public void addId_book(String value){
        this.id_book.add(value);
    }
    
    public ArrayList<String> getDataId_book(){
        return this.id_book;
    }
     public void addTelp(String value){
        this.telp.add(value);
    }
    
    public ArrayList<String> getDataTelp(){
        return this.telp;
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
    
     public void addTgl_keb(String value){
        this.tgl_keb.add(value);
    }
    
    public ArrayList<String> getDataTgl_keb(){
        return this.tgl_keb;
    }
    
     public void addKonfirmasi(String value){
        this.konfirmasi.add(value);
    }
    
    public ArrayList<String> getDataKonfirmasi(){
        return this.konfirmasi;
    }
    
    public void Daftarpemesanan(String nama, String id_book, String telp,
            String kota_wisata, String harga, String tgl_keb, String konfirmasi ){
        addNama(nama);
        addTelp(telp);
        addKota_wisata(kota_wisata);
        addHarga(harga);
        addTgl_keb(tgl_keb);
        addKonfirmasi(konfirmasi);
        addId_book(id_book);
        
    }
}
