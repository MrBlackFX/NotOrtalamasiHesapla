import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("Turkce notunuz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = input.nextInt();
        System.out.println("Muzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortlama = toplam/6;

        System.out.println("Not ortalamasi : " +ortlama);
        boolean kosul1 = ortlama>60;
        boolean kosul2= ortlama<60;
        String str= (kosul1==true) ? "Gecti":"Kaldi";
        System.out.println(str);







    }
}