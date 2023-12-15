package day01_ifElsStatements;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class P08_Array4 {

    // Girilen desimal bir değeri binary değere
    //çeviren methodu oluşturun

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi= scanner.nextInt();
        binaryCevir(sayi);
    }

    private static void binaryCevir(int sayi) {
        ArrayList<Integer> binary=new ArrayList<>();
        while (sayi>=1){
            binary.add(sayi%2);
            sayi/=2;
        }
        for (int i = binary.size()-1; i >=0; i--) {
            System.out.print(binary.get(i));

        }
        
    }


}

