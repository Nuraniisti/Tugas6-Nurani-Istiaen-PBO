/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi6;

/**
 *
 * @author ACER
 */
public class MyMain {
    public static void main(String[] args) {
        BangunDatar segitiga=new Segitiga(12, 20);
        BangunDatar lingkaran=new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : "+segitiga.getLuas());
        System.out.println("Luas dari bangun datar luangkaran : "+lingkaran.getLuas());
    }
}