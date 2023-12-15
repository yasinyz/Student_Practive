package day01_ifElsStatements;

import javax.swing.*;

public class P09_ArananSehir {
    public static void main(String[] args) {


        // 4x2'lik bir multidimension array oluşturun ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
        // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.

        String cityData[][] = {
                {"istanbul", "16000000", "marmara"},
                {"Ankara", "5400000", "iç Anadolu"},
                {"izmir", "2300000", "Ege"},
                {"Adana", "1769000", "Akdeniz"}};

        String searcity = JOptionPane.showInputDialog("Şehir adı giriniz");

        String population=null;
        String Regin=null;
        for (int i = 0; i <cityData.length; i++) {
            if (cityData[i][0].contains(searcity)){
                population=cityData[i][1];
                Regin=cityData[i][2];
            }
        }
        if (population!=null){
            System.out.println("şehir: "+searcity+"\nNufus: "+population+"\nbölgesi: "+Regin);

        }else {
            System.out.println("Aranan şehir bulunamadı");
        }
    }
}

