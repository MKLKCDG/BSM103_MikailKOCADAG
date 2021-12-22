import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print(" eleman sayısını giriniz: ");
        int elemanSayısı=input.nextInt();

        int[] dizi=new int[elemanSayısı];

        for(int index=0;index<dizi.length;index++){

            System.out.print((index)+". indeksin değerini giriniz: ");
            dizi[index]=input.nextInt();

        }

        double ortalama=ortalama(dizi);
        System.out.println(" elemanların ortalaması: "+ortalama);



    }

    public static double ortalama(int[] dizi){
        double ortalama=0.0;
        double toplam=0.0;
        for (int index=0;index<dizi.length;index++){
            toplam+=dizi[index];
        }
        ortalama=toplam / dizi.length;

        return ortalama;

    }


}