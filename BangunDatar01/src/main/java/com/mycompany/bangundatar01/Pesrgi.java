package com.mycompany.bangundatar01;
public class Pesrgi extends BangunDatar {
    double sisi;
    
    public void luaspesergi(){
        super.luas();
        double luasp=sisi*sisi;
        System.out.println("Luas Pesergi :"+luasp);
        
    }
    public void kelilingpesergi(){
        super.luas();
        double keliling=4*sisi;
        System.out.println("Keliling Pesergi :"+keliling);
       
    }
   
   
    
}
