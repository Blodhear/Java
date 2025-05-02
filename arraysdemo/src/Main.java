public class Main {
    public static void main(String[] args) {
        String ogrenci1="Eren";
        String ogrenci2="Bertu";
        String ogrenci3="Ogun";
        String ogrenci4="Emircan";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Eren";
        ogrenciler[1]="Bertu";
        ogrenciler[2]="Ogun";
        ogrenciler[3]="Emircan";

        for (int i=0; i<ogrenciler.length; i++){

            System.out.println(ogrenciler[i]);

        }

        System.out.println("-------------------------------------");


        for(String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }





    }
}