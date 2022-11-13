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
public class Segitiga extends BangunDatar {

    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }

    @Override
    float getLuas(){
        return (float)0.5*alas*tinggi;
    }
}