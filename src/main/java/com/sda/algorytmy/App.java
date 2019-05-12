package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 1, 3};
        int wynik = a[0];
        int maximum = a[0];

        for (int i=1; i<a.length; i++){
            if (a[i]>maximum){
                maximum=a[i];
            }
        }

        for (int i=1; i<a.length; i++){
            if (a[i]<wynik){
                wynik = a[i];
            }
        }
        System.out.println("element minimalny: "+wynik);
        System.out.println("element maksymalny: "+maximum);

    }
}
