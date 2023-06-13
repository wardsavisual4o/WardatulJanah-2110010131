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
public class datasetJadwalkeberangkatan {
     private ArrayList<String> nama;
    private ArrayList<String> id_book;
    
    private ArrayList<String> status;
    private ArrayList<String> ubah_jadwal;
    private ArrayList<String> tgl_keb;
    private ArrayList<String> batal;
    
     public datasetJadwalkeberangkatan(){
        nama = new ArrayList<>();
        id_book = new ArrayList<>();
        
        status = new ArrayList<>();
        ubah_jadwal = new ArrayList<>();
        tgl_keb = new ArrayList<>();
        batal = new ArrayList<>();
        
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
   
    
     public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    
     public void addUbah_jadwal(String value){
        this.ubah_jadwal.add(value);
    }
    
    public ArrayList<String> getDataUbah_jadwal(){
        return this.ubah_jadwal;
    }
    
     public void addTgl_keb(String value){
        this.tgl_keb.add(value);
    }
    
    public ArrayList<String> getDataTgl_keb(){
        return this.tgl_keb;
    }
    
     public void addBatal(String value){
        this.batal.add(value);
    }
    
    public ArrayList<String> getDataBatal(){
        return this.batal;
    }
    
     public void Jadwalkeberangkatan(String nama, String id_book, String status,
            String ubah_jadwal, String batal, String tgl_keb){
        addNama(nama);
        addStatus(status);
        addUbah_jadwal(ubah_jadwal);
        addBatal(batal);
        addTgl_keb(tgl_keb);
        addId_book(id_book);
        
    }
    
}
