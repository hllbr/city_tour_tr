
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    Scanner scn = new Scanner(System.in);
    public static void islem_bas(){
        String islem ="0-islemleri Görüntüle\n"
                + "1-bir önceki şehire git\n"
                + "2-bir sonraki şehire git\n"
                + "3-uygulamadna çık";
        System.out.println(islem);
    }
    public static void sehir_turla(LinkedList<String> sehirler){
        Scanner scn = new Scanner(System.in);
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir konumda değilsin");
        }
        boolean cıkıs = false;
        boolean ileri = true;
        
        while(!cıkıs){
            System.out.println("bir islem seçiniz");
            islem = scn.nextInt();
            switch(islem){
                case 0:
                    islem_bas();
                    break;
                case 1:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Şehire Gidiliyor "+iterator.previous());
                    }else{
                        System.out.println("Şehir Turu Başladı...");
                    }
                    break;
                case 2:
                    if(!ileri){
                       if( iterator.hasNext()){
                           iterator.next();
                       }
                       ileri = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Şehire gidiliyor "+iterator.next());
                    }else{
                        System.out.println("Gidilecek Şehir Kalmadı.");
                    }
                    break;
                case 3:
                    cıkıs = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
            }
        }
        
        
    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        sehirler.add("Sivas");
        sehirler.add("İstanbul");
        sehirler.add("Antep");
        islem_bas();
        sehir_turla(sehirler);
        
    }
    
}
