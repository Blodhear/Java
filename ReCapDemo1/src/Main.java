public class Main {
    public static void main(String[] args) {
        int sayi1 = 3 ;
        int sayi2 = 7;
        int sayi3 = 1;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        else if (enBuyuk<sayi3) {
                enBuyuk = sayi3;
        }
        System.out.println("En buyuk sayi = "+enBuyuk);

    }
}