package com.mycompany.bangundatar01;
public class Lingkaran extends BangunDatar {
    double r;
    
    public void luas(){
        double luas=3.14*r*r;
        System.out.println("Luas Lingkaran :"+luas);
        
    }
    public void bkeliling(){
        double keliling=2*3.14*r;
        System.out.println("Keliling Lingkaran"+keliling);
        
    }
    
}
