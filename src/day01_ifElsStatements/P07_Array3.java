package day01_ifElsStatements;

import javax.swing.*;

public class P07_Array3 {

    //Kullanicidan aldiginiz bir string
    // icinde en cok tekrar eden karakteri yazdiriniz

    public static void main(String[] args) {

        String input= JOptionPane.showInputDialog("lütfen bir cümle yazınız");
       // System.out.println("input :" +input);

        String arr[]=input.split("");
        int count=0;
        char encokHarf=' ';
        int encok=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].contains(arr[j])){
                    count++;
                }
            }
       if (count>encok){
           encok=count;
           encokHarf=arr[i].charAt(0);
       }
       count=0;
        }
        System.out.println(encokHarf+" karekteri cümlede "+encok+" kez kullanılmıştır");
    }

}
