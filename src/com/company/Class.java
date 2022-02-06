package com.company;

import java.util.Arrays;

public class Class {
    private int butunsan;
    private String soz;
    private int [] san;

    public Class(int butunsan, String soz, int[] san){
        this.butunsan = butunsan;
        this.soz = soz;
        this.san = san;
    }

    public int getButunsan() {
        return butunsan;
    }

    public void setButunsan(int butunsan) {
        this.butunsan = butunsan;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    @Override
    public String toString() {
        return
                "Butunsan " + butunsan +
                ", soz- " + soz +
                ", san=" + Arrays.toString(san);
    }

    public int[] getSan() {
        return san;
    }

    public void setSan(int[] san) {
        this.san = san;
    }

}
