package com.mycompany.bangundatar01;
public class SegiTiga extends BangunDatar {
    double alas,tinggi,sm;
    
    public void luassegitiga(){
        double luas=1/2*alas*tinggi;
        System.out.println("Luas Segitiga  :"+luas);
        
    }
    public void kelilingsegitiga(){
       sm=Math.sqrt((alas*alas)+(tinggi*tinggi));
       double keliling=alas+tinggi+sm;
        System.out.println("Keliling Segitiga :"+keliling);
       
    }
}
