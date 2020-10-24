package com.example.tourguideapp.classes;

public class HotelandResturant {


    private String nameitem;
    private String TopRate;
    private int imag;

    public HotelandResturant(int imag, String TopRate, String nameitem) {
        this.nameitem = nameitem;
        this.TopRate = TopRate;
        this.imag = imag;
    }

    public String getTopRate() {
        return TopRate;
    }

    public void setTopRate(String TopRate) {
        this.TopRate = TopRate;
    }

    public String getnameitem() {
        return nameitem;
    }

    public int getimag() {
        return imag;
    }



}

