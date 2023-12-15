package day01_ifElsStatements;

import java.util.ArrayList;

public class P10_ForLoop {
    public static void main(String[] args) {


        // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
        // Bu fiyatların toplamını hesaplayarak ekrana yazdırın

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(256.23);
        prices.add(120.23);
        prices.add(97.00);
        prices.add(200.05);
        prices.add(156.25);
        prices.add(100.40);

        double sum=0;
        for (double price:prices){
            sum+=price;
        }
        System.out.println("Toplam: " +sum);





    }
}
