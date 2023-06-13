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
public class datasetPembayaran {
    
    private ArrayList<String> id;
    private ArrayList<String> status;
    private ArrayList<String> upload;
    private ArrayList<String> lihat;
    private ArrayList<String> batal;
    
     public datasetPembayaran(){
        id = new ArrayList<>();
        upload = new ArrayList<>();
        status = new ArrayList<>();
        lihat = new ArrayList<>();
        batal = new ArrayList<>();      
    }
    
      public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataId(){
        return this.id;
    }
    
     public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    
      public void addBatal(String value){
        this.batal.add(value);
    }
    
    public ArrayList<String> getDataBatal(){
        return this.batal;
    }
    
    public void addUpload(String value){
        this.upload.add(value);
    }
    
    public ArrayList<String> getDataUpload(){
        return this.upload;
    }
    
    public void addLihat(String value){
        this.lihat.add(value);
    }
    
    public ArrayList<String> getDataLihat(){
        return this.lihat;
    }
    
     public void Bookingwisata(String id, String status, String upload,
            String lihat, String batal ){
        addId(id);
        addStatus(status);
        addUpload(upload);
        addLihat(lihat);
        addBatal(batal);
        
    }
}
