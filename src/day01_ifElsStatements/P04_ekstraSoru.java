package day01_ifElsStatements;

import java.util.Scanner;

public class P04_ekstraSoru {
    public static void main(String[] args) {

        // Soru 1- Kullanıcıdan kullanıcı adını girmesini isteyin.
        //  Kullanıcıdan şifresini girmesini isteyin.
        // ( Doğru kullanıcı adı : Wiseq , Doğru şifre : Wiseq123 olacak)
        // Kullanıcı adı ve şifre doğru ise «Oturum acildi» yazdirin.
        //  Kullanıcı adı ve şifrenin herhangi biri veya ikisi birden yanlışsa
        //  "Yanlis kullanici adi veya sifre girdiniz, lutfen tekrar deneyiniz"
        //  "Lutfen kullanici adinizi giriniz : " yazdirin.
        // "Lutfen sifrenizi giriniz : " yazdirin.
        // Kullanıcı 3 kere daha yanlış girerse "Hesabiniz kilitlendi. " yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen kullanici adinizi giriniz");
        String kullaniciAdi = scanner.nextLine();

        System.out.println("lutfen kullanici sifrenizi giriniz");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("Wiseq") && sifre.equals(" Wiseq123")){
            System.out.println("oturum acildi");
        }else {
            int denemeHakki = 3;

            while (!(kullaniciAdi.equals("Wiseq") && sifre.equals("Wiseq123")) && denemeHakki >0){
                System.out.println("Yanlis kullanici adi veya sifre girdiniz, lutfen tekrar deneyiniz");
                System.out.println("lutfen kullanici adinizi giriniz");
                sifre = scanner.nextLine();
                denemeHakki--;
            }if (kullaniciAdi.equals("Wiseq") && sifre.equals("Wiseq123")){
                System.out.println("oturum acildi");
            }else {
                System.out.println("hesabiniz kilitlendi");
            }
        }

    }
}
