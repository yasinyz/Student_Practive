package day01_ifElsStatements;

import java.util.Scanner;

public class P03_ifElsStataments {

    public static void main(String[] args) {

        //        kullanicidan yasini isteyin yasi
        //        18 den buyukse resitsiniz yazdirin//
        //        yasi 18 den kucukse resitdegilsiniz yazdirin
        //        yas 18 ise tam 18 yasindasiniz yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas > 18){
            System.out.println("RESİTSİNİZ");
        } else if (yas < 18) {
            System.out.println("RESİTDEGİLSİNİZ");

        } else if (yas == 18) {
            System.out.println("TAM 18 YASİNDASİNİZ");

        }

    }
}
