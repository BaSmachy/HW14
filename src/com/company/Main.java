package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Class cal = new Class(10,"Basmachy",new int[]{1,2,3,4,5});

        //cal.setSan(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.print(cal.getButunsan() + " " + cal.getSoz());
        for (int i : cal.getSan()) {
            System.out.print(" " +i+" ");
        }

    }
}





