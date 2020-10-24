package com.example.tourguideapp.classes;


public class actions {

    private String nameitem;
    private int imag;


    public actions(int imag, String nameitem) {
        this.nameitem = nameitem;
        this.imag = imag;
    }

    public String getnameitem() {
        return nameitem;
    }
    public int getimag() {
        return imag;
    }



}