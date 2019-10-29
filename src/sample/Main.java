package sample;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program wydający resztę.");
        System.out.println("Wprowadz kwotę:");
        Integer kwota = scan.nextInt();
        int[] nominaly = {1,2,5,10,20,50,100,200,500};

        int zmienna = nominaly.length-1;
        int[] ilosci = new int[nominaly.length];
        while(kwota!=0){
            if(kwota>=nominaly[zmienna]){
                kwota = kwota-nominaly[zmienna];
                ilosci[zmienna] = ilosci[zmienna]+1;
            }
            else zmienna--;
        }
        System.out.println("Najłatwiej będzie ci wydać");
        for(int i=0;i<nominaly.length;i++){
            System.out.println("Nominalow " + nominaly[i] + ": " + ilosci[i]);
        }
        System.out.print("Dziękuje, że mogłem pomóc");
    }
}
