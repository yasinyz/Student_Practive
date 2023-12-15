package day01_ifElsStatements;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P05_Array {

    public static void main(String[] args) {

        // Bir ArrayList oluşturun ve içine 3 adet renk ekleyin.
// Daha sonra kullanıcıdan bir renk adı alın
// ve bu rengin ArrayList'te olup olmadığını
// ekrana yazdırın.

        ArrayList<String> colors=new ArrayList<>();
        colors.add("purple");
        colors.add("yellow");
        colors.add("blue");


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir renk giriniz");
        String data= scanner.next();
        String searchingColor=data.toLowerCase(Locale.ROOT);

        if (colors.contains(searchingColor)){
            System.out.println("aranan kelime vardır");
        }else {
            System.out.println("aranan kelime yoktur");
        }
    }

}
