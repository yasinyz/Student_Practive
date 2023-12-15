package day01_ifElsStatements;

import java.util.ArrayList;

public class P06_Array2 {

    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine 5 adet kelime ekleyin.
        // Ardından bu kelimeleri tek bir cümle olarak birleştirerek ekrana yazdırın.

        //cümle:java cok guclu bir dildir.


        ArrayList<String> words=new ArrayList<>();

        words.add("Java");
        words.add("çok");
        words.add("güçlü");
        words.add("bir");
        words.add("dildir");

        String sentence=String.join(" ",words);
        // join methodunda (delimeter,elemnts)
        System.out.println("sentence :"+sentence);





    }
}
