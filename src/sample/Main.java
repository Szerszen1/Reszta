package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.Arrays;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program wydający resztę.");
        System.out.println("Wprowadz kwotę:");
        Integer kwota = scan.nextInt();
        System.out.println("Wprowadz ilosc banknotow/blionow");
        Integer ilosc = scan.nextInt();
        int[] nominaly = new int[ilosc];
        for(int i=0;i<ilosc;i++){
            System.out.println("Wprowadz " + (i+1) + " nominał:");
            nominaly[i] = scan.nextInt();
        }
        Arrays.sort(nominaly);
        for(int i=0;i<nominaly.length;i++){
            System.out.println(nominaly[i]);
        }
        int zmienna = nominaly.length-1;
        int[] ilosci = new int[ilosc];
        while(kwota!=0){
            if(kwota>=nominaly[zmienna]){
                kwota = kwota-nominaly[zmienna];
                ilosci[zmienna] = ilosci[zmienna]+1;
            }
            else zmienna--;
        }
        for(int i=0;i<nominaly.length;i++){
            System.out.println("Nominalow " + nominaly[i] + ": " + ilosci[i]);
        }
        System.out.print("Koniec");
    }
}
