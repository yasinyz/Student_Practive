package day01_ifElsStatements;

import java.util.Scanner;

public class P01_ifEls {

    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // yasi 18 den buyukse " 18 yasindan buyuksunuz yani resitsiniz" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas>18) {
            System.out.println("18 yasindan buyuksunuz , yani resitsiniz");

            //  yasi 18 den kuyukse " 18 yasindan kuyuksunuz yani resitdegilsiniz" yazdirin

        }
            if (yas<18){
                System.out.println("18 yasindan kuyuksunuz yani resitdegilsiniz");
            }


        if (yas==18){
            System.out.println("Tam 18 yasindasiniz");
        }

    }
}
