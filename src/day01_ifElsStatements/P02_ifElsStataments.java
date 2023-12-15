package day01_ifElsStatements;

import java.util.Scanner;

public class P02_ifElsStataments {

    public static void main(String[] args) {

        /*  kullanicidan yasini isteyin yasi 18 den buyukse resitsiniz yazdirin

        yasi 18 den kucukse resitdegilsiniz yazdirin

      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas > 18){
            System.out.println("resitsiniz");
        }else {
            System.out.println("resitdegilsiniz");
        }
    }
}
