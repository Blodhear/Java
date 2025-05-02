public class Main {
    public static void main(String[] args) {
        char grade = 'G';
        switch (grade) {
            case 'A':
                System.out.println("Mukemmmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok Guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Kotu  : Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}