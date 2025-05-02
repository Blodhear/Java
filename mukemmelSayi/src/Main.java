public class Main {
    public static void main(String[] args) {
        int number = 6;
        int total = 0 ;

        for (int i=1; i<number; i++){
            if(number % i == 0){
                total+=i;                   // Bu satır      total = total +i        ye eşittir.

            }

         }
        if (total == number){
            System.out.println("Mukemmel sayidir");
        }
        else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}