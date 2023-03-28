package com.mycompany.bangundatar01;

import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        Scanner loli=new Scanner (System.in);
        BangunDatar bangun=new BangunDatar();
       int input = 0;
        System.out.println("Bagun Datar Loli");
        System.out.println("1.Pesergi \n 2.Segitiga \n  3.Lingkaran");
       input=loli.nextInt();
      switch(input){
          case 1 :
              Pesrgi pesergi=new Pesrgi();
              System.out.print("Input Sisi : ");
              pesergi.sisi=loli.nextInt();
              pesergi.luaspesergi();
              pesergi.kelilingpesergi();
              break;
          case 2 :
              SegiTiga tiga=new SegiTiga();
              System.out.print("Input Alas :");
              tiga.alas=loli.nextInt();
              System.out.print("Input Tinggi :");
              tiga.tinggi=loli.nextInt();
              tiga.luas();
              tiga.keliling();
              break;
          case 3 :
              Lingkaran ling=new Lingkaran();
              System.out.print("Input Jari-Jari :");
              ling.r=loli.nextInt();
              
          
          
      }
        
        
    }
 
}
