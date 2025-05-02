public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 3.1, 4.2, 2.9, 6.7};
        double total = 0;
        double max = myList[0];

        for (double number : myList){
            System.out.println(number);

            if(max<number){
                max = number;
            }
            total = number + total ;
        }
        System.out.println("Toplamlari = " + total);
        System.out.println("En buyuk sayi = " + max);

    }
}